package com.satish.Lab6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String Showindexing () {
		
		System.out.println("HHHHHHHHHHIIIIIIIIIIIIIIIIIii");
		
		return "index ........................satish";
	}

}
