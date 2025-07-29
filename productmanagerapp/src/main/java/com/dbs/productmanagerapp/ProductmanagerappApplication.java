package com.dbs.productmanagerapp;

import com.dbs.productmanagerapp.dao.ProductDAO;
import com.dbs.productmanagerapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductmanagerappApplication {
	@Autowired
	private ProductService productService;

	public static void main(String[] args) {

		SpringApplication.run(ProductmanagerappApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(){
		return (args)->{
			productService.search().stream().forEach(System.out::println);
		};
	}
}
