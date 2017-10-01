package edu.ser.sandbox.generic;

import java.util.ArrayList;

public class GenericSndBx {

}

class  Class1 <E  extends Number, T extends A & Interface>{

   private <M extends Number> void print(M e, T t) {
        System.out.println("key " + e + " equal "+t);
        try {
        M n = (M)new Object();

    } catch (ClassCastException e1) {
            e1.printStackTrace();
        }
   }
    public static void main(String... args){
            Class1<Integer,A> c = new Class1<>();
            c.print(1,new A());

            ArrayList<Object> objects = new  ArrayList<>() ;
            ArrayList strings = new ArrayList<>();


    }
}

interface Interface {

}

class A implements Interface{

    @Override
    public String toString() {
        return  "/ Class A";
    }
}
    class B extends A implements Interface{}