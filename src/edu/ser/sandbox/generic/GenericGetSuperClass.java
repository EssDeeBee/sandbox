package edu.ser.sandbox.generic;

import java.lang.reflect.ParameterizedType;

public class GenericGetSuperClass<T, N>  extends SuperClass <String, Integer> {

    private void f () {
        Class<T> t = (Class<T>)((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Class<N> n = (Class<N>)((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
        System.out.println(t.toString());
        System.out.println(n.toString());

    }


    public static void main(String[] args) {
        GenericGetSuperClass<String, Integer> generic = new GenericGetSuperClass<>();
        generic.f();

    }
}


    class SuperClass<T, I> {

    }

