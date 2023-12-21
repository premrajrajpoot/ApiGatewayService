package com.Customerservice.CustomerService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class Hotal {
	

	private String id;
	private String name;
	private String location;
	private String about;
	
	
	
	public Hotal() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Hotal(String id, String name, String location, String about) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.about = about;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public String getAbout() {
		return about;
	}



	public void setAbout(String about) {
		this.about = about;
	}



	@Override
	public String toString() {
		return "Hotal [id=" + id + ", name=" + name + ", location=" + location + ", about=" + about + "]";
	}
	
	
}
