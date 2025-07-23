package com.dbs.secondjavaproject.others;

public class Product {
    private String id;
    private String name;
    private static String mfd;

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

    public static String getMfd() {
        return mfd;
    }

    public static void setMfd(String mfd) {
        Product.mfd = mfd;
    }
}
