package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {  //Creanga Gabriel

    public static void main(String[] args) {

        String cuvant=null;
        UtilityClass ut= new UtilityClass();
       cuvant= ut.read();
        ut.write(cuvant,"C:/Users/Gabriel/Desktop/penta/test.txt");

    }


}
