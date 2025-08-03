package com.dover.restpro.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dover.restpro.domain.Product;

@Repository
public interface ProductDAO  extends CrudRepository<Product, String>{
	public List<Product> findAll();
	

}
