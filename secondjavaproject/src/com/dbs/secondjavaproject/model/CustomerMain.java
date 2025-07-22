package com.dbs.secondjavaproject.model;

public class CustomerMain {
    public static void main(String[] args) {

        Customer c = new Customer();
        c.setName("Tom");
        c.setEmail("tom@msn.com");

        System.out.println(c.getName()+" : " + c.getEmail());

    }
}
