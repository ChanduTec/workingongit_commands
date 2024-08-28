package com.example.demo.controoler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitChanges_Conttroller {

	@GetMapping(value = "/getdata")
	public ResponseEntity<String> getWelocmeMessage() {
		System.out.println("Welcome to the getWelcome messgae");
		String msg = "Welcome to the chandu world";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	@GetMapping(value = "mymsg/{msg}")
	public StringBuilder welcomeChandu(@PathVariable("msg") StringBuilder msg) {
		
		/*
		 * System.out.println(msg.append("_Learn Heare Lead Anywhere"));
		 * System.out.println(msg); StringBuilder append = msg.append("_Learn Heare Lead Anywhere");
		 */
		return msg.append(msg);
		//Here when i was hit this url, Mulitipule times is going to print.I am not getting why it is like this
	}

}
