package com.Customerservice.CustomerService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(name="Hotal-Service")
public interface Hotal_Service {
	
	@GetMapping("hotal/gethotalbyid/{hotalId}")
	Hotal GetHotal(@PathVariable String hotalId );

}
