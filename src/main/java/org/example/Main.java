package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

 /*     Zadanie 13. Kalkulator opłat bankowych.
        Poproś użytkownika o podanie salda konta bankowego i oblicz opłatę za prowadzenie konta, przyjmując, że opłata wynosi 10% salda.
        double accountBalance = 5000.0;*/
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj saldo konta:");
        float saldo = scan.nextFloat();

        System.out.println( "Twoje saldo to: " + saldo +
                            "\nTwoja opłata (10%) za prowadzenie konta to: " + (saldo * 0.1) );


    }
}