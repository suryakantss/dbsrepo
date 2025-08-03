package com.dover.restpro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import com.dover.restpro.domain.Product;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class IntegrationTest {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void integrationTest() {
		Product product = testRestTemplate.getForObject("/products/{id}", Product.class, "P2");
		assertEquals("P2", product.getId());
	}

}
