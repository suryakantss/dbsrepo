package com.dbs.secondjavaproject.others;

public class ProductMain {

    public static void main(String[] args) {
        Product.setMfd("Microsoft");

        Product p1 = new Product();
        p1.setId("P1");
        p1.setName("Mouse");


        System.out.println(p1.getName() + " : " +  p1.getId() + " : " + Product.getMfd());

        Product p2 = new Product();
        p2.setId("P2");
        p2.setName("KB");
        System.out.println(p2.getName() + " : " +  p2.getId() + " : " + Product.getMfd());












    }
}
