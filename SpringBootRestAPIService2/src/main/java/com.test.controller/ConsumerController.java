package com.test.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/consumer")
public class CosumerController {
	
	@GetMapping("/consumer")
	public String consumerService() {
		return "Simple consumer controller response";
		
	}

}
