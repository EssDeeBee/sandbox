package edu.ser.sandbox.collectionsndbx;

import java.util.*;

public class ArrayListView {

    public static void main (String[] args) {
        List strings = new ArrayList<>();
        strings.add("abc");
        strings.add("aaa");
        for (Object s : strings )
            System.out.println(s);
        strings.forEach(System.out::println);
        System.out.println(strings.get(1));
        System.out.println(strings.size());
        strings.remove(1);
        Set<String> set = new HashSet<>();

    }
}


