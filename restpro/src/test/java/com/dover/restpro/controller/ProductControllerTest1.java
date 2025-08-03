package com.dover.restpro.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.dover.restpro.domain.Product;
import com.dover.restpro.exception.ProductNotFoundException;
import com.dover.restpro.service.ProductService;

@WebMvcTest(value = ProductsController.class)
@AutoConfigureMockMvc
public class ProductControllerTest1 {
	
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
		ResultActions response =  mockMvc.perform(get("/products/{id}",p.getId()));
		
		response.andExpect(status().isOk()) 
		.andDo(print())
		.andExpect(content().contentType(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$.id", is(p.getId())))
        .andExpect(jsonPath("$.name", is(p.getName())))
        .andExpect(jsonPath("$.price", is(p.getPrice())));
	}
}