package com.test.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/product")
public class ProductController {
	
	
	@GetMapping("/product")
	public String productService()
	{
		return "Simple product controller response";
	}

}
