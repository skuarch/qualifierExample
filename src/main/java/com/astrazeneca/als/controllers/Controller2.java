package com.astrazeneca.als.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.astrazeneca.als.demo.MyBean;

@RestController
@RequestMapping("/demo")
public class Controller2 {

	@Autowired
	private MyBean myBean;
	
	@GetMapping
	public String get() {
		
		myBean.doSomenthing();
		return "demo";
		
	}
	
}
