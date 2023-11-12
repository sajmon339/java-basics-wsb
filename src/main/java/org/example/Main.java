package org.example;

public class Main {
    public static void main(String[] args) {

        int godziny = 3;
        int minuty = godziny * 60;

        int minuty2 = 120;
        int godziny2 = minuty2 / 60;

        System.out.println(godziny + " godziny, to: "  + minuty + " minut.");
        System.out.println(minuty2 + " minuty, to: "  + godziny2 + " godzin.");

    }
}