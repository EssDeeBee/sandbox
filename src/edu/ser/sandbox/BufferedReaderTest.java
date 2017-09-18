package edu.ser.sandbox;

import java.io.*;
public class BufferedReaderTest {
    public static void main(String[] args) {
        File file = new File("C:\\file.txt");
        try {
           // BufferedReader input = new BufferedReader(new FileReader(file));
            FileInputStream input = new FileInputStream(file);
            int i;
            while((i = input.read()) != -1){
                System.out.print((char)i);
            }
        }
        catch (Exception ex) {
            System.out.println("Exception");
        }
    }
}

