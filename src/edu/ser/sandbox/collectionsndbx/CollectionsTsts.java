package edu.ser.sandbox.collectionsndbx;


import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class CollectionsTsts {

    String r;

    public static void main (String[] args) {
        System.out.println("Hello Java Collections!");
        Set<Integer> s = new HashSet();
        s.add(1);
        s.add(1);
        s.add(3);
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(3);
        s.add(3);
        s.add(3);
          System.out.println(s);
        Object n =new Object();
        Object b = new Object();
        System.out.println("== "+n==b);
        System.out.println("equals"+n.equals(b));


            File file = new File("\\\\w001-0000004902\\Workspace\\report\\A File.txt");
         //  OutputStream st =

    }
}
