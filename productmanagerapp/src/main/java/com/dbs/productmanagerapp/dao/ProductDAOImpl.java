package com.dbs.productmanagerapp.dao;

import com.dbs.productmanagerapp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO {
    @Autowired
    private JdbcTemplate jdbctemplate;
    @Override
    public List<Product> findAll() {
    String query = "select * from products";
    return  jdbctemplate.query(query,new BeanPropertyRowMapper<>(Product.class));
    }

    @Override
    public int save(Product product) {
        String query = "insert into products values(?,?,?)";
        Object[] params = {product.getId(),product.getName(),product.getPrice()};
        return  jdbctemplate.update(query,params);

    }
}
