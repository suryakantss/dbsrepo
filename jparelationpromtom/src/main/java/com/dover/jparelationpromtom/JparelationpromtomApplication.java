package com.dover.jparelationpromtom;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.dover.jparelationpromtom.dao.StudentDAO;
import com.dover.jparelationpromtom.domain.Course;
import com.dover.jparelationpromtom.domain.Student;

@SpringBootApplication
public class JparelationpromtomApplication {

  
	@Autowired
	private StudentDAO studentDAO;

	public static void main(String[] args) {
		SpringApplication.run(JparelationpromtomApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner() {
		return (args)->{
			
			Course c1 = new Course("1", "Java", "1M");
			Course c2 = new Course("2", "React", "1M");
			
			List<Course> courses = new ArrayList<>();
			courses.add(c1);
			courses.add(c2);
			
			Student s = new Student("1","Jai");
			s.setCourses(courses);
			
			Student res = studentDAO.save(s);
			System.out.println(res.getName() + " saved...");
			
		};
	}
}
