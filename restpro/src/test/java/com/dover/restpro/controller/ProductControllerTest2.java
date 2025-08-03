package com.dover.restpro.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.dover.restpro.domain.Product;
import com.dover.restpro.exception.ProductNotFoundException;
import com.dover.restpro.service.ProductService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(controllers = ProductsController.class)
@AutoConfigureMockMvc
public class ProductControllerTest2 {

	@MockitoBean
	private ProductService productService;

	@Autowired
	private MockMvc mockMvc;

	Product p;

	@BeforeEach
	public void setup() throws ProductNotFoundException {

		p = new Product();
		p.setId("P1");
		p.setName("Mouse");
		p.setPrice(400);
		when(productService.getProducts("P1")).thenReturn(p);
	}

	@Test
	public void testProductController() throws Exception {
		MvcResult response = mockMvc.perform(get("/products/{id}", p.getId())).andExpect(status().isOk())
				.andReturn();

		String json = response.getResponse().getContentAsString();
		ObjectMapper objectMapper = new ObjectMapper();
		Product product = objectMapper.readValue(json, Product.class);
		assertEquals("P1", product.getId());

	}
}
