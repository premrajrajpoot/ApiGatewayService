package com.Customerservice.CustomerService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import feign.Feign;
import feign.Feign.Builder;

@Configuration
public class configration {
	
	

	Hotal_Service hotalservice;
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplet() {
		
		return new RestTemplate();
	}
	

	

}
