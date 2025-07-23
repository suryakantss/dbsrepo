package com.dbs.fileioproject.inoutstream;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class OOSDemo {

    public static void main(String[] args) {

        Customer c1 = new Customer("John","carter@msn.com");
        Customer c2 = new Customer("James","bond@msn.com");

       try {
           ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/dbstraining/customers.dat"));
            oos.writeObject(c1);
           oos.writeObject(c2);
        oos.close();
       } catch (Exception e){
           System.out.println(e.getMessage());
       }
        System.out.println("customers saved...");

    }
}
