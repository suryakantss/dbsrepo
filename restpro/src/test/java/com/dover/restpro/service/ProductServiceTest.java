package com.dover.restpro.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import com.dover.restpro.dao.ProductDAO;
import com.dover.restpro.domain.Product;
import com.dover.restpro.exception.ProductNotFoundException;

@SpringBootTest
public class ProductServiceTest {

	@MockitoBean
	private ProductDAO productDAO;
	
	@Autowired
	private ProductService productService;
	
	@BeforeEach
	public void init() throws ProductNotFoundException {
		Product p = new Product("1", "Toy", 2000);
		when(productDAO.findById(anyString())).thenReturn(Optional.of(p));
	}

	@Test
	public void testgetProductById() throws ProductNotFoundException {
		assertEquals("Toy", productService.getProducts("1").getName());
		
	}

}
