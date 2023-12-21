package com.Customerservice.CustomerService;





import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;




@Entity
//@Table(name="micro_user")
public class User {
	
	@Id
	@Column(name="ID")
	private String userId;
	private String name;
	private String email;
	
	private String about;

	@Transient
	private List<Rating>ratting=new ArrayList<>();
	


	

	public User(String userId, String name, String email, String about, List<Rating> ratting) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.about = about;
		this.ratting = ratting;
	}

	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public List<Rating> getRatting() {
		return ratting;
	}



	public void setRatting(List<Rating> ratting) {
		this.ratting = ratting;
	}

	
	



	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	} 
	
	

}
