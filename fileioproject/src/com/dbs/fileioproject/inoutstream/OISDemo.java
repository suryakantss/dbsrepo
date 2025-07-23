package com.dbs.fileioproject.inoutstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class OISDemo {
    public static void main(String[] args) {
       try {
           ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/dbstraining/customers.dat"));
           Customer c1 = (Customer) ois.readObject();
           Customer c2 = (Customer) ois.readObject();

           System.out.println(c1.getEmail());
           System.out.println(c2.getEmail());
        ois.close();
       } catch (Exception e){
           System.out.println(e.getMessage());
       }

    }
}
