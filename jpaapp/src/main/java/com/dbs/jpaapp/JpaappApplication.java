package com.dbs.jpaapp;

import com.dbs.jpaapp.dao.EmployeeDAO;
import com.dbs.jpaapp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaappApplication {
	@Autowired
	private EmployeeDAO employeeDAO;

	public static void main(String[] args) {
		SpringApplication.run(JpaappApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner() {
		return (args) -> {
			//	employeeDAO.findAll().stream().forEach(System.out::println);
			//Employee e =employeeDAO.findById("E1").get();
			//	System.out.println(e);
		/*
			Employee e = employeeDAO.findByName("Jerry");
			System.out.println(e);
		};*/
		//	Employee e = new Employee("E4", "Hardy");
		//	employeeDAO.save(e);
		};
	}
}