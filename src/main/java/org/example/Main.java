package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj miesiąc (numerycznie): ");
        int miesiac = scan.nextInt();

        switch (miesiac){
            case 1:
                System.out.println("Podaleś numer: " + miesiac + " to jest Styczeń.");
                break;
            case 2:
                System.out.println("Podaleś numer: " + miesiac + " to jest Luty.");
                break;
            case 3:
                System.out.println("Podaleś numer: " + miesiac + " to jest Marzec.");
                break;
            case 4:
                System.out.println("Podaleś numer: " + miesiac + " to jest Kwiecień.");
                break;
            case 5:
                System.out.println("Podaleś numer: " + miesiac + " to jest Maj.");
                break;
            case 6:
                System.out.println("Podaleś numer: " + miesiac + " to jest Czerwiec.");
                break;
            case 7:
                System.out.println("Podaleś numer: " + miesiac + " to jest Lipiec.");
                break;
            case 8:
                System.out.println("Podaleś numer: " + miesiac + " to jest Sierpień.");
                break;
            case 9:
                System.out.println("Podaleś numer: " + miesiac + " to jest Wrzesień.");
                break;
            case 10:
                System.out.println("Podaleś numer: " + miesiac + " to jest Październik.");
                break;
            case 11:
                System.out.println("Podaleś numer: " + miesiac + " to jest Listopad.");
                break;
            case 12:
                System.out.println("Podaleś numer: " + miesiac + " to jest Grudzień.");
                break;
            default:
                System.out.println("Podałeś zły numerek");
        }




    }
}