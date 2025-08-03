package com.dover.restpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dover.restpro.service.GreetingService;

@RestController
//@RequestMapping("/dover")
public class GreetingController {

	@Autowired
	private GreetingService greetingService;

	// @RequestMapping(path = "/greet", method = RequestMethod.GET)
	@GetMapping("/greet")
	public List<String> greet() {
		return greetingService.getMessages();

	}

	@GetMapping("/welcome")
	public ResponseEntity<List<String>> wel() {
		return ResponseEntity.status(HttpStatus.OK).body(greetingService.getWMessages());
	}

}
