package edu.ser.sandbox.iosndbx;

import java.io.*;

public class IOCopyFileTst {

    String s = "1";
    byte b = 127;

    private void writeInFile () {
        File file = new File("C:\\Users\\DzeboevSB\\Desktop\\!A Folder\\A File.txt");
       try(OutputStream out = new FileOutputStream(file)){
            byte[] data = s.getBytes();
           out.write(data);
            System.out.print("This data was write in the file = ");
            for (byte b : data)
                System.out.print((byte)b + " \n");
            System.out.println((s));
            System.out.println("-------------------");
            System.out.println("-----(" + (char) b+ ")-----------");
            System.out.println("-------------------");

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void main (String[] args) {
        System.out.println("Hello IO Files Copy Test!");
        IOCopyFileTst c =new IOCopyFileTst();
        c.writeInFile();



    }

}
