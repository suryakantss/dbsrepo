package com.dbc.springjdbcapp;

import com.dbc.springjdbcapp.model.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
    //search();
        save();
    }

    public static void search(){
        AnnotationConfigApplicationContext container =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        JdbcTemplate jd = (JdbcTemplate) container.getBean("jdbcTemplate");
        String qry = "select * from products";

        List<Product> products =
                jd.query(qry,new BeanPropertyRowMapper<Product>(Product.class));

      /*  for (Product p : products) {
            System.out.println(p.getId() + ", " + p.getName() + ", " + p.getPrice());
        }
       */
        products.stream().forEach(System.out::println);

    }

    public static void save(){
        AnnotationConfigApplicationContext container =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        JdbcTemplate jd = (JdbcTemplate) container.getBean("jdbcTemplate");
        String qry = "insert into products values(?,?,?)";
        Object params[] = {"P1","Coffe Mug",200};

        int rec = jd.update(qry,params);
        System.out.println(rec + " record(s) inserted");


    }
}
