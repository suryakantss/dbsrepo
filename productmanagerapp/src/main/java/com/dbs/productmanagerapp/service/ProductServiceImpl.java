package com.dbs.productmanagerapp.service;

import com.dbs.productmanagerapp.dao.ProductDAO;
import com.dbs.productmanagerapp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl  implements  ProductService {
   @Autowired
   private ProductDAO productDAO;

    @Override
    public List<Product> search() {
        return productDAO.findAll();
    }
}
