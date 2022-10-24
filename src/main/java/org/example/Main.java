package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        if(args[0].equals("sinus")) {
            System.out.println(Matematika.sinus(Double.parseDouble(args[1])));
        }
    }
}