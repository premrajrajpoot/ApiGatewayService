package com.Customerservice.CustomerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/All")
public class UserController {
	@Autowired
	userserviceImpl userservice;
	
	
	@PostMapping("/users")
	public ResponseEntity<User>createUser(@RequestBody User user){
		
	User user1	=userservice.saveUser(user);
	
	return ResponseEntity.status(HttpStatus.CREATED).body(user1);
		
	}

	
	//get single user
	
	@GetMapping("User/{UserId}")
	public ResponseEntity<User>getSingleUser(@PathVariable String UserId){
		
		User user=userservice.getUser(UserId);
		
		return ResponseEntity.ok(user);
		
	}
	
//all user get
	@GetMapping("/GetallUser")
	public ResponseEntity<List<User>>getAllUser(){
		
		List<User>allUser=userservice.getAllUser();
		
		return ResponseEntity.ok(allUser);
	}
	
	
	
}
