package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Czy mieszkasz w Gdyni?");
        Boolean input = scan.next().equals("Gdynia") ? true : false;

        System.out.println(input);
    }
}