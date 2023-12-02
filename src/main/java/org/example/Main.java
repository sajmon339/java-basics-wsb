package org.example;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner przyjmowacz = new Scanner(System.in);


        while(true) {
            System.out.println("Podaj liczbę 1: [zatwierdź enter]");
            String liczba1 = przyjmowacz.next();
            System.out.println("Podaj liczbę 2: [zatwierdź enter]");
            int liczba2 = przyjmowacz.nextInt();
            System.out.println("Podaj operator (+, -, *, /), x - zakończy działanie: [zatwierdź enter]");
            String operator = przyjmowacz.next();
            switch (operator) {
                case "+" -> System.out.println("Wynik: " + liczba1 + " + " + liczba2 + " = " + (Integer.parseInt(liczba1) + liczba2));
                case "-" -> System.out.println("Wynik: " + liczba1 + " - " + liczba2 + " = " + (Integer.parseInt(liczba1) - liczba2));
                case "*" -> System.out.println("Wynik: " + liczba1 + " * " + liczba2 + " = " + (Integer.parseInt(liczba1) * liczba2));
                case "/" -> System.out.println("Wynik: " + liczba1 + " / " + liczba2 + " = " + (Integer.parseInt(liczba1) / liczba2));
                default -> System.out.println("Podałeś operator: " + operator + " podaj poprawny.");
            }
            if (operator.equals("x") || operator.equals("X") || operator.equals("exit")) break;

        }



    }
}