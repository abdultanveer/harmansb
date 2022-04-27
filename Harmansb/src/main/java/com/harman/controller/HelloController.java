package com.harman.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/greet")
	public String sayHi() {    //function,method,api,webservice
		return "hi from harman- java batch"; //set of object
	}

}
