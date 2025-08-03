package com.dover.restpro.service;

import java.util.List;

import com.dover.restpro.domain.Product;
import com.dover.restpro.exception.ProductNotFoundException;

public interface ProductService {
	public List<Product> getProducts();

	public Product getProducts(String id) throws ProductNotFoundException;

	public Product addProduct(Product product);

	public Product updateProduct(String id, Product product) throws ProductNotFoundException ;

	public Product deleteProduct(String id) throws ProductNotFoundException;

}
