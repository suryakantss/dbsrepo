package com.dover.jparelationprooto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.dover.jparelationprooto.dao.UserDAO;
import com.dover.jparelationprooto.domain.User;

@SpringBootApplication
public class JparelationproApplication {

  
	@Autowired
	private UserDAO userDAO;

   
	public static void main(String[] args) {
		SpringApplication.run(JparelationproApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner() {

		return (args) -> {
			/*
			 * Address addr = new Address(); addr.setId("A1"); addr.setCity("Munich");
			 * addr.setPin("255-255");
			 * 
			 * User user = new User(); user.setId("U1"); user.setName("John");
			 * user.setAddress(addr);
			 * 
			 * User ruser = userDAO.save(user); System.out.println(ruser.getName() +
			 * " saved...");
			 * 
			 * System.out.println("=============================");
			 */

			List<User> users = userDAO.findAll();

			for (User u : users) {
				System.out.println(u.getName() + " ," + u.getAddress().getCity());

			}
		};

	}

}
