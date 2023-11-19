package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz miasto (Gdańsk, Gdynia, Sopot): ");
        String miasto = scan.next();

        if(miasto.equals("Gdańsk")){
            System.out.println("Twoje miasto to Gdańsk ");
        }else if(miasto.equals("Gdynia")){
            System.out.println("Twoje miasto to Gdynia");
        }else if(miasto.equals("Sopot")){
            System.out.println("Twoje miasto to Sopot");
        }else{
            System.out.println("Podałeś inną wartość!");
        }


    }
}