package com.dbs.productmanagerapp.dao;

import com.dbs.productmanagerapp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface ProductDAO {
    public List<Product> findAll();

}
