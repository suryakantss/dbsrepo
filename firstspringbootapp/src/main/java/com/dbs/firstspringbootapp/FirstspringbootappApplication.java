package com.dbs.firstspringbootapp;

import com.dbs.firstspringbootapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.dbs.firstspringbootapp.service.GreetService;

@SpringBootApplication
public class FirstspringbootappApplication {

	@Autowired
	private GreetService gs;
	@Autowired
	private WeatherService ws;
	public static void main(String[] args) {
		SpringApplication.run(FirstspringbootappApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(){
		return (args)->{
			System.out.println(gs.greet("John"));
			System.out.println(ws.getWeather("Pune"));
		};
	}
}
