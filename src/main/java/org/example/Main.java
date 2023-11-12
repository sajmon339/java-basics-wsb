package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę godzin: [zatwierdź enterem]");
        int godziny = scan.nextInt();
        int minuty = godziny * 60;

        System.out.println("Podaj liczbę minut: [zatwierdź enterem]");
        int minuty2 = scan.nextInt();
        int godziny2 = minuty2 / 60;

        System.out.println(godziny + " godziny, to: "  + minuty + " minut.");
        System.out.println(minuty2 + " minuty, to: "  + godziny2 + " godzin.");

    }
}