package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UtilityClass {

    public static String read(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s= null;
        int i=0;
        try {
            System.out.print("Enter String: ");
            s = br.readLine();
            System.out.print("Enter Integer: ");
           i = Integer.parseInt(br.readLine());
        }
        catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }
        catch (IOException e) {
            System.out.println("IO_Exception" + e);
        }
        return s+" "+i;
    }

    public static void write(String s,String cale){

        Path path = Paths.get(cale);
        try (BufferedWriter writer = Files.newBufferedWriter(path))
        {
            writer.write(s);
        }
        catch (IOException e){
            System.out.println(e);
        }

    }
}
