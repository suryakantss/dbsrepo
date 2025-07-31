package com.dbs.firstwebapp.intgration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.dbs.firstwebapp.model.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class IntegrationTest {
	@Autowired
	private TestRestTemplate testRestTemplate;
	@Test
	public void integrationTest() {
		TestRestTemplate authenticatedRestTemplate = testRestTemplate.withBasicAuth("john", "123");
		Course course = authenticatedRestTemplate.getForObject("/courses/{id}", Course.class, "C2");
		assertEquals("C2", course.getId());
	}

}
