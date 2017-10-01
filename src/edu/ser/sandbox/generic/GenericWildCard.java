package edu.ser.sandbox.generic;
import java.util.*;


public class GenericWildCard {
}


class Generics2<T> {

    public void copy (List<? extends T> src, List<? super T> dst) {

        dst.addAll(src);



    }



    public static void main(String[] args) {
        Generics2 g= new Generics2();

        List<Integer> src = new ArrayList<>();
        src.add(1);
        src.add(2);
        src.add(3);

        List<Number> dst = new ArrayList<>();
        g.copy(src, dst);

        System.out.println(dst.size());
    }

}

class Generics01{}

class F extends Generics01{}