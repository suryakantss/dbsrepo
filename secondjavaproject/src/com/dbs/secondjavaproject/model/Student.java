package com.dbs.secondjavaproject.model;

public class Student {
   //access modifier
    private String name;
    private String email;
    private int age;

    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
     this.email=email;
    }
    public void setAge(int age){
        if(age >0 && age <= 100)
      this.age=age;
        else {
            System.out.println("Invalid age...");
        }
    }


    public void print(){
        System.out.println(name + " : " + email + ":" + age);
    }
}
