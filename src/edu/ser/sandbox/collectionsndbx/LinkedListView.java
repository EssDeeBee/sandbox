package edu.ser.sandbox.collectionsndbx;

import java.util.*;

public class LinkedListView {

    public static void main(String... arguments) {

        System.out.println("Hello LinkedList!\n");

        List<String> list = new LinkedList();
        list.add("Param1");
        list.add("Param2");
        for (int i = 0 ; i < list.size(); i++) {
            System.out.println(i + 1 + " element is:\n" + " " + list.get(i));
        }

    }
}
