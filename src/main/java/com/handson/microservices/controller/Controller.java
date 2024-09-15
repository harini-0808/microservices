package com.handson.microservices.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service2")
public class Controller {
	@GetMapping("/hello")
	public ResponseEntity<?> sayHello(){
		return ResponseEntity.status(200).body("another service says howdy");
	}
	
	@GetMapping("/factorial/{no}")
	public ResponseEntity<?> getFactorial(@PathVariable int no){
		int fact = 1;
	    if(no==1)
	    	fact=1;
	    else {
	    	for(int i=no;i>=1;i--) {
	    		fact*=i;
	    	}
	    }
		return ResponseEntity.status(200).body(fact);
	}
}
