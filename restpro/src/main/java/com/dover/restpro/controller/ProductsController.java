package com.dover.restpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dover.restpro.domain.Product;
import com.dover.restpro.exception.ProductNotFoundException;
import com.dover.restpro.service.ProductService;

@RestController

@CrossOrigin(origins = {"http://localhost:5173"})
public class ProductsController {
	@Autowired
	private ProductService productService;

	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts() {
		return ResponseEntity.ok(productService.getProducts());
	}

	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getProducts(@PathVariable String id) throws ProductNotFoundException {
		return ResponseEntity.ok(productService.getProducts(id));
	}

	@PostMapping("/products")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
		Product p = productService.addProduct(product);
		return ResponseEntity.status(HttpStatus.CREATED).body(p);
	}
	@PutMapping("/products/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable String id,@RequestBody Product product) throws ProductNotFoundException {
		Product p = productService.updateProduct(id,product);
		return ResponseEntity.status(HttpStatus.OK).body(p);
	}
	
	@DeleteMapping("/products/{id}")
	public ResponseEntity<Product> deleteProduct(@PathVariable String id) throws ProductNotFoundException
	{
		return ResponseEntity.status(HttpStatus.OK).body(productService.deleteProduct(id));
	}
}
