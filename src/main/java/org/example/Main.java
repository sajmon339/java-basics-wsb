package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj liczbę godzin: [zatwierdź enterem]");
            float godziny = scan.nextFloat();
            float minuty = godziny * 60;

            System.out.println("Podaj liczbę minut: [zatwierdź enterem]");
            float minuty2 = scan.nextFloat();
            float godziny2 = minuty2 / 60;

            System.out.println(godziny + " godziny, to: " + Math.ceil(minuty) + " minut.");
            System.out.println(minuty2 + " minuty, to: " + godziny2 + " godzin.");
        }

    }
}