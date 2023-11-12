package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = -1,
            b = -11,
            c = 12;

        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Delta: " + delta);

        if(delta < 0){
            System.out.println("Brak pierwiastków");
        } else if (delta == 0) {
            double x0 = -b / (2 * a);
            System.out.println("Jedno miejsce zerowe x0: " + x0);
        }else if(delta > 0){
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Dwa miejsca zerowe x1: " + x1 + "\nx2: " + x2 );
        }

    }
}