package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Podaj miesiąc (numerycznie): ");
            int miesiac = scan.nextInt();

            switch (miesiac) {
                case 1 -> System.out.println("Podaleś numer: " + miesiac + " to jest Styczeń.");
                case 2 -> System.out.println("Podaleś numer: " + miesiac + " to jest Luty.");
                case 3 -> System.out.println("Podaleś numer: " + miesiac + " to jest Marzec.");
                case 4 -> System.out.println("Podaleś numer: " + miesiac + " to jest Kwiecień.");
                case 5 -> System.out.println("Podaleś numer: " + miesiac + " to jest Maj.");
                case 6 -> System.out.println("Podaleś numer: " + miesiac + " to jest Czerwiec.");
                case 7 -> System.out.println("Podaleś numer: " + miesiac + " to jest Lipiec.");
                case 8 -> System.out.println("Podaleś numer: " + miesiac + " to jest Sierpień.");
                case 9 -> System.out.println("Podaleś numer: " + miesiac + " to jest Wrzesień.");
                case 10 -> System.out.println("Podaleś numer: " + miesiac + " to jest Październik.");
                case 11 -> System.out.println("Podaleś numer: " + miesiac + " to jest Listopad.");
                case 12 -> System.out.println("Podaleś numer: " + miesiac + " to jest Grudzień.");
                default -> System.out.println("Podałeś zły numerek");
            }

            System.out.println("Jeśli chcesz zakończyć działanie programu wpisze \"x\" ");
            String x = scan.next();
            if(x.equals("x")) break;

        }



    }
}