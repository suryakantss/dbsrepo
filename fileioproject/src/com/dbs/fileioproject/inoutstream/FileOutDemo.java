package com.dbs.fileioproject.inoutstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutDemo {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("d:/dbstraining/mydata.txt");
            String str = "Welcome to Java Streams!!";
            fos.write(str.getBytes());
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
}
}
