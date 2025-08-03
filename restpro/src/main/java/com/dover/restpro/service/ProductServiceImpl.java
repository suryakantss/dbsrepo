package com.dover.restpro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dover.restpro.dao.ProductDAO;
import com.dover.restpro.domain.Product;
import com.dover.restpro.exception.ProductNotFoundException;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDAO;

	@Override
	public List<Product> getProducts() {
		return productDAO.findAll();
	}

	@Override
	public Product getProducts(String id) throws ProductNotFoundException {
		return productDAO.findById(id).get();
	}

	@Override
	public Product addProduct(Product product) {
		return productDAO.save(product);
	}

	@Override
	public Product updateProduct(String id, Product product) throws ProductNotFoundException {
		Product p = getProducts(id);
		if (p != null) {
			product.setId(id);
			productDAO.save(product);
			return p;
		}
		return null;
	}

	@Override
	public Product deleteProduct(String id) throws ProductNotFoundException {
		Product p = getProducts(id);
		if (p != null) {
			productDAO.deleteById(id);
			return p;
		}
		return null;
	}
}
