package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź imię: ");
        String imie = scan.next();

        switch (imie){
            case "Anna", "Antoni", "Adam" -> System.out.println("Twoje imię to: Anna, Antoni lub Adam");
            case "Monika", "Magdalena", "Marek" -> System.out.println("Twoje imię to: Monika, Magdalena lub Marek");
            default -> System.out.println("Inne imię...");
        }

    }
}