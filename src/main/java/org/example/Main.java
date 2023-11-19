package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Podaj liczbę z przecinkiem:");
        float liczba = scan.nextFloat();

        System.out.println("Podana liczba to: " + liczba);


    }
}