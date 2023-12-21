package com.Customerservice.CustomerService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class userserviceImpl implements UserServices {

	private Logger logger=LoggerFactory.getLogger(userserviceImpl.class);
	
	@Autowired
	private UserRepo respos;
	
	@Autowired
	private RestTemplate resttemplate;
	//@Autowired
	//private Hotal_Service hotalservice;

   
	

	@Override
	public User saveUser(User user) {
	//generate unique id	
	//String randomUserId=	UUID.randomUUID().toString();
	//user.setUserId(randomUserId);
		return respos.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return respos.findAll();
	}

	@Override
	public User getUser(String UserId) {
		// get user details
		User user= respos.findById(UserId).orElseThrow(()->new ResourceNotFoundException("usergivenwithidisnotfoundonserver :"+UserId));
		
		// fetch rating of above user from rating service
		//http://localhost:8083/Ratings/User/124
	Rating[] RatingofUser=resttemplate.getForObject("http://localhost:8083/Ratings/User/"+user.getUserId(),Rating[].class);
	
	System.out.println(RatingofUser);
	logger.info(" " ,RatingofUser);
List<Rating>ratting=	Arrays.stream(RatingofUser).toList();
System.out.println(ratting);
List<Rating>listofRating=	ratting.stream().map(rating->{
		
	ResponseEntity<Hotal>forentity=resttemplate.getForEntity("http://localhost:8087/hotal/gethotalbyid/"+rating.gethotalId(), Hotal.class);
	Hotal hotal =forentity.getBody();
	
	//=hotalservice.GetHotal(rating.gethotalId());
			
			
	
	
	
	
	
	
	
	rating.setHotal(hotal);
	return rating;
	} ).collect(Collectors.toList());
	
logger.info(" " +listofRating);
user.setRatting(listofRating);
	return user;
	}

}
