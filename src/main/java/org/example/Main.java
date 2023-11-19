package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //START
        //Podaj a
        System.out.println("Podaj a:");
        int a = scan.nextInt();
        //Podaj b
        System.out.println("Podaj b:");
        int b = scan.nextInt();
        //Podaj c
        System.out.println("Podaj c:");
        int c = scan.nextInt();
        //Blok operacji:
        int suma = a + b + c;
        //Blok wypisz suma:
        System.out.println(suma);
        //KONIEC (STOP)

    }
}