package com.dbs.fileioproject.filedemo;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {

        File f = new File("d:/dbstraining/java.txt");
        System.out.println(f.exists());
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.isDirectory());





    }
}
