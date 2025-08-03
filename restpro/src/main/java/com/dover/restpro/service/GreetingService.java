package com.dover.restpro.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	private List<String> messages = new ArrayList<>();
	List<String> wmessages = new ArrayList<>();
	public GreetingService() {
		messages.add("Welcome to REST");
		messages.add("Happy Learning");
		messages.add("This is a Web Application");

		wmessages.add("This is Home");
		wmessages.add("Happy Learning");

	}
	public List<String> getMessages() {
		return messages;
	}

	public List<String> getWMessages() {
		return wmessages;
	}
}
