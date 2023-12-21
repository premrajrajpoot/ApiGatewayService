package com.Customerservice.CustomerService;

import java.util.List;





public interface UserServices {
	
	
	
	//user operation
	
	//create
	
	User saveUser(User user);
	
	//get all user
	List<User>getAllUser();
	
	//get single user of given userid
	
	User getUser(String UserId);
	
	

		
		
	
	

}
