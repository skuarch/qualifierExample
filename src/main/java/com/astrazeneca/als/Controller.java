package com.astrazeneca.als;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

	@Autowired
	@Qualifier("mocos")
	private MyBean mocos; 
	
	@Autowired
	private com.astrazeneca.als.demo.MyBean component;
	
	@GetMapping
	public MyBean get() {
		component.doSomenthing();
		return mocos;
	}
	
}
