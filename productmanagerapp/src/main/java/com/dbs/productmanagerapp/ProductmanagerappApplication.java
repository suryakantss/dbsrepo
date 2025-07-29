package com.dbs.productmanagerapp;

import com.dbs.productmanagerapp.dao.ProductDAO;
import com.dbs.productmanagerapp.model.Product;
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
			//productService.search().stream().forEach(System.out::println);

			Product p = new Product("P4","Pencil",100);
			int res = productService.create(p);
			if(res == 1)
			{
				System.out.println(p.getName() + " saved!!");
			}
			else
				System.out.println("couln't save " + p.getName());

		};
	}
}
