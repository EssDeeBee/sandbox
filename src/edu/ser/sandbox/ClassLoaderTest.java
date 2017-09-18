package edu.ser.sandbox;

public class ClassLoaderTest {
    {
        System.out.println("1");
    }

    ClassLoaderTest () {
        System.out.println("2");
    }

    static {
        System.out.println("3");
    }

    {
        System.out.println("4");
    }

    public static void main(String[] args) {
        new ClassLoaderTest();
    }
}
