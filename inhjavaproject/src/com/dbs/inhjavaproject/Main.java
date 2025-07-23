package com.dbs.inhjavaproject;
abstract class Person {
    String name;
}
class Employee extends Person {
    String id;
}
class Manager extends Employee{
    String dept;
}
class FloorManager extends  Manager {
    int floorno;
}
public class Main {
    public static void main(String[] args) {
   Manager m = new Manager();
   m.name="John";
   m.dept="Purchase";

   FloorManager fm = new FloorManager();
   fm.name="Jai";
   fm.dept="Seurity";
   fm.floorno=4;


    }
}
