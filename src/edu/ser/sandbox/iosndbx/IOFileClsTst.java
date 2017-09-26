package edu.ser.sandbox.iosndbx;

import java.io.File;
import java.io.IOException;

public class IOFileClsTst {

    public static void main (String... args) {
        System.out.println("Hello IO-Java!");
        File dir = new File("C:\\Users\\DzeboevSB\\Desktop\\!A Folder");
        String[] dirPath = dir.list();
        for (String s: dirPath)
            System.out.println(s);
        System.out.println(dir.isDirectory());
        System.out.println(dir.isFile());
        System.out.println(dir.getAbsolutePath());
        System.out.println(dir.getParentFile());
        File[] files = dir.listFiles();
        for (File f : files)
            System.out.println("dir.listFiles() = " + f);
        dir.mkdirs() ;
        try {
            dir.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Exception not appeared!");
        }
    }

}
