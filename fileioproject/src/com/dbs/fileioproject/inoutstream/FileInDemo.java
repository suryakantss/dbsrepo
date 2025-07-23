package com.dbs.fileioproject.inoutstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInDemo {

    public static void main(String[] args) {
        try {
            File f = new File("d:/dbstraining/mydata.txt");
            if(!f.exists())
            {
                System.out.println(f.getName() + "doesn't exists..");
                System.exit(1);
            }
            FileInputStream fis = new FileInputStream(f);
           int b;
            while ((b=fis.read())!=-1)
                System.out.print((char)b);

            fis.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
}
}
