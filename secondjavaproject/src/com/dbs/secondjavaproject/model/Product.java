package com.dbs.secondjavaproject.model;
public class Product {
    private String id;
    private  String name;
    private double price;

    public Product(String id){
        this.id=id;
        System.out.println("cons...called");
    }
    //overloaded constructor
    public Product(String id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
        System.out.println("cons...called");
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void print() {
        System.out.println(id+" : " + name + " : " + price);
    }
}
