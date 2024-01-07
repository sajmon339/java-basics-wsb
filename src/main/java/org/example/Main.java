package org.example;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        zadanie15();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Naciśnij Enter, aby zakończyć...");        
    
    }
    public static void zadanie1(){
        System.out.println(" |--- /---\\ |    | /---\\\n    | |   | |    | |   |\n    | |   | |    | |   |\n    | |---| |    | |---|\n    | |   |  \\  /  |   |\n \\__/ |   |   \\/   |   |");
    }
    public static void zadanie2() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Wybierz opcję:");
                System.out.println("1. Godziny na Minuty");
                System.out.println("2. Minuty na Godziny");
                System.out.println("3. Wyjście");
                String wybor = scanner.nextLine();

                if (wybor.equals("1") || wybor.equals("2")) {
                    System.out.println("Wprowadź liczbę:");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("To nie jest liczba. Wprowadź liczbę:");
                        scanner.next();
                    }
                    double liczba = scanner.nextDouble();
                    scanner.nextLine();  // Tutaj dodajemy scanner.nextLine()

                    if (liczba < 0) {
                        System.out.println("Liczba musi być dodatnia.");
                    } else if (wybor.equals("1")) {
                        System.out.println(liczba + " godzin(y) to " + (liczba * 60) + " minut.");
                    } else {
                        System.out.println(liczba + " minut to " + (liczba / 60) + " godzin(y).");
                    }
                } else if (wybor.equals("3")) {
                    break;
                }

                System.out.println("Naciśnij 'b', aby wrócić do menu lub inny dowolny klawisz by zakonczyc.");
                String powrot = scanner.nextLine();
                if (!powrot.equalsIgnoreCase("b")) {
                    break;
                }
            }
        }
    }
    public static void zadanie3() {
        int a = 10;
        int b = 4;
        int c = 3;

        System.out.println("Wartości zmiennych:");
        System.out.println("Zmienna a:"+ a);
        System.out.println("Zmienna b:"+ b);
        System.out.println("Zmienna b:"+ c);

        double wynik = (double) (a % b % c);

        System.out.println("Wynik działania a % b % c: " + wynik);
    }
    public static void zadanie4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rozwiązanie równania kwadratowego ax^2 + bx + c = 0");
        
        System.out.print("Podaj wartość a: ");
        double a = scanner.nextDouble();
    
        System.out.print("Podaj wartość b: ");
        double b = scanner.nextDouble();
    
        System.out.print("Podaj wartość c: ");
        double c = scanner.nextDouble();
    
        double delta = calculateDelta(a, b, c);
    
        if (delta < 0) {
            System.out.println("Równanie nie ma miejsc zerowych.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Równanie ma jedno miejsce zerowe: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Równanie ma dwa miejsca zerowe:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
    public static double calculateDelta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }
    public static void zadanie5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();
    
        if (czyParzysta(liczba)) {
            System.out.println(liczba + " jest liczbą parzystą.");
        } else {
            System.out.println(liczba + " jest liczbą nieparzystą.");
        }
    }
    public static boolean czyParzysta(int liczba) {
        return liczba % 2 == 0;
    }
    public static void zadanie6() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Wybierz jedną z opcji:");
        System.out.println("1. Kawa");
        System.out.println("2. Herbata");
        System.out.println("3. Sok");
        System.out.println("4. Cola");
        System.out.print("Twój wybór: ");
        int opcja = scanner.nextInt();
    
        switch (opcja) {
            case 1:
                System.out.println("Wybrałeś kawę.");
                break;
            case 2:
                System.out.println("Wybrałeś herbatę.");
                break;
            case 3:
                System.out.println("Wybrałeś sok.");
                break;
            case 4:
                System.out.println("Wybrałeś colę.");
                break;
            default:
                System.out.println("Niepoprawna opcja.");
        }
    
        System.out.println("Wybierz numer miesiąca (1-12): ");
        int miesiac = scanner.nextInt();
    
        switch (miesiac) {
            case 1:
                System.out.println("Styczeń");
                break;
            case 2:
                System.out.println("Luty");
                break;
            case 3:
                System.out.println("Marzec");
                break;
            case 4:
                System.out.println("Kwiecień");
                break;
            default:
                System.out.println("Niepoprawny numer miesiąca.");
        }
    
        System.out.println("Podaj ocenę (1-5): ");
        int ocena = scanner.nextInt();
    
        switch (ocena) {
            case 1:
            case 2:
                System.out.println("Ocena niedostateczna.");
                break;
            case 3:
                System.out.println("Ocena dostateczna.");
                break;
            case 4:
                System.out.println("Ocena dobra.");
                break;
            case 5:
                System.out.println("Ocena bardzo dobra.");
                break;
            default:
                System.out.println("Niepoprawna ocena.");
        }
    
        System.out.println("Podaj dzień tygodnia (1-7): ");
        int dzienTygodnia = scanner.nextInt();
    
        switch (dzienTygodnia) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Środa");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Niepoprawny dzień tygodnia.");
        }
    }
    public static void zadanie7() {
        Scanner scanner = new Scanner(System.in);

        int liczbaA, liczbaB;

        do {
            System.out.print("Podaj pierwszą liczbę (liczbaA): ");
            while (!scanner.hasNextInt()) {
                System.out.println("To nie jest liczba. Podaj pierwszą liczbę (liczbaA): ");
                scanner.next();
            }
            liczbaA = scanner.nextInt();
        } while (liczbaA <= 0);

        do {
            System.out.print("Podaj drugą liczbę (liczbaB): ");
            while (!scanner.hasNextInt()) {
                System.out.println("To nie jest liczba. Podaj drugą liczbę (liczbaB): ");
                scanner.next();
            }
            liczbaB = scanner.nextInt();
        } while (liczbaB <= 0);

        int wiekszaLiczba = (liczbaA > liczbaB) ? liczbaA : liczbaB;
        System.out.println("Większa liczba to: " + wiekszaLiczba);

        String parzystaA = (liczbaA % 2 == 0) ? "Liczba A jest parzysta" : "Liczba A jest nieparzysta";
        System.out.println(parzystaA);

        String dodatniaB = (liczbaB > 0) ? "Liczba B jest dodatnia" : "Liczba B nie jest dodatnia";
        System.out.println(dodatniaB);
    }
    public static void zadanie8() {
        Scanner scanner = new Scanner(System.in);

        int liczba1, liczba2, liczba3;

        // Wprowadzanie liczby1
        do {
            System.out.print("Podaj pierwszą liczbę: ");
            while (!scanner.hasNextInt()) {
                System.out.println("To nie jest liczba. Podaj pierwszą liczbę: ");
                scanner.next(); // Pomijamy wprowadzony niepoprawny znak
            }
            liczba1 = scanner.nextInt();
        } while (liczba1 <= 0); // Możesz zmienić warunek na taki, jaki jest potrzebny

        // Wprowadzanie liczby2
        do {
            System.out.print("Podaj drugą liczbę: ");
            while (!scanner.hasNextInt()) {
                System.out.println("To nie jest liczba. Podaj drugą liczbę: ");
                scanner.next(); // Pomijamy wprowadzony niepoprawny znak
            }
            liczba2 = scanner.nextInt();
        } while (liczba2 <= 0); // Możesz zmienić warunek na taki, jaki jest potrzebny

        // Wprowadzanie liczby3
        do {
            System.out.print("Podaj trzecią liczbę: ");
            while (!scanner.hasNextInt()) {
                System.out.println("To nie jest liczba. Podaj trzecią liczbę: ");
                scanner.next(); // Pomijamy wprowadzony niepoprawny znak
            }
            liczba3 = scanner.nextInt();
        } while (liczba3 <= 0); // Możesz zmienić warunek na taki, jaki jest potrzebny

        System.out.println("Wyniki rozszerzonych instrukcji warunkowych:");

        // 1. Jeśli przynajmniej jedna z liczb jest większa niż 10
        if (liczba1 > 10 || liczba2 > 10 || liczba3 > 10) {
            System.out.println("Przynajmniej jedna z liczb jest większa niż 10.");
        } else {
            System.out.println("Żadna z liczb nie jest większa niż 10.");
        }

        // 2. Jeśli wszystkie liczby są parzyste
        if (liczba1 % 2 == 0 && liczba2 % 2 == 0 && liczba3 % 2 == 0) {
            System.out.println("Wszystkie liczby są parzyste.");
        } else {
            System.out.println("Nie wszystkie liczby są parzyste.");
        }

        // 3. Jeśli żadna z liczb nie jest ujemna
        if (!(liczba1 < 0 || liczba2 < 0 || liczba3 < 0)) {
            System.out.println("Żadna z liczb nie jest ujemna.");
        } else {
            System.out.println("Przynajmniej jedna z liczb jest ujemna.");
        }

        // 4. Jeśli conajmniej dwie liczby są dodatnie
        if ((liczba1 > 0 && liczba2 > 0) || (liczba1 > 0 && liczba3 > 0) || (liczba2 > 0 && liczba3 > 0)) {
            System.out.println("Conajmniej dwie liczby są dodatnie.");
        } else {
            System.out.println("Mniej niż dwie liczby są dodatnie.");
        }

        // 5. Jeśli wszystkie liczby są różne od zera
        if (liczba1 != 0 && liczba2 != 0 && liczba3 != 0) {
            System.out.println("Wszystkie liczby są różne od zera.");
        } else {
            System.out.println("Przynajmniej jedna z liczb jest równa zero.");
        }
    }
    public static void zadanie9() {
        Scanner scanner = new Scanner(System.in);
        int liczba;

        do {
            System.out.print("Podaj liczbę całkowitą od 0 do 9: ");
            while (!scanner.hasNextInt()) {
                System.out.println("To nie jest liczba całkowita. Podaj liczbę od 0 do 9: ");
                scanner.next();
            }
            liczba = scanner.nextInt();
        } while (liczba < 0 || liczba > 9);

        switch (liczba) {
            case 0:
                System.out.println("Wybrałeś liczbę 0.");
                break;
            case 1:
                System.out.println("Wybrałeś liczbę 1.");
                break;
            case 2:
                System.out.println("Wybrałeś liczbę 2.");
                break;
            case 3:
                System.out.println("Wybrałeś liczbę 3.");
                break;
            case 4:
                System.out.println("Wybrałeś liczbę 4.");
                break;
            case 5:
                System.out.println("Wybrałeś liczbę 5.");
                break;
            case 6:
                System.out.println("Wybrałeś liczbę 6.");
                break;
            case 7:
                System.out.println("Wybrałeś liczbę 7.");
                break;
            case 8:
                System.out.println("Wybrałeś liczbę 8.");
                break;
            case 9:
                System.out.println("Wybrałeś liczbę 9.");
                break;
        }
    }
    public static void zadanie10() {
        boolean czyModuloZero;

        Scanner scanner = new Scanner(System.in);

        int liczba1 = 0, liczba2 = 0; // Initialize both variables

        // Wprowadzanie dwóch liczb całkowitych
        for (int i = 1; i <= 2; i++) {
            while (true) {
                System.out.print("Podaj " + (i == 1 ? "pierwszą" : "drugą") + " liczbę całkowitą: ");
                if (scanner.hasNextInt()) {
                    if (i == 1) {
                        liczba1 = scanner.nextInt();
                    } else {
                        liczba2 = scanner.nextInt();
                    }
                    break; // Jeśli wprowadzono poprawną liczbę, przerywamy pętlę
                } else {
                    System.out.println("To nie jest liczba całkowita. Spróbuj ponownie.");
                    scanner.next(); // Pomijamy wprowadzoną nieprawidłową wartość
                }
            }
        }

        czyModuloZero = (liczba1 % 2 == 0) || (liczba2 % 3 == 0);

        System.out.println("Czy wynikiem dowolnego dzielenia modulo jest 0? " + czyModuloZero);
    }
    public static void zadanie11() {
        int liczbaCalkowita = 0;

        Scanner scanner = new Scanner(System.in);
        boolean poprawnaLiczba = false;

        while (!poprawnaLiczba) {
            System.out.print("Podaj liczbę całkowitą: ");

            if (scanner.hasNextInt()) {
                liczbaCalkowita = scanner.nextInt();
                poprawnaLiczba = true;
            } else {
                System.out.println("To nie jest liczba całkowita. Spróbuj jeszcze raz.");
                scanner.next();
            }
        }

        if (liczbaCalkowita < 0) {
            liczbaCalkowita = Math.abs(liczbaCalkowita);
        }

        System.out.println("Wartość zmiennej liczbaCalkowita po zamianie na dodatnią: " + liczbaCalkowita);
        scanner.nextLine(); // Odczytamy zbędny znak nowej linii
        System.out.println("Naciśnij Enter, aby zakończyć...");
        scanner.nextLine();
        scanner.close();
    }
    public static void zadanie12() {
        Scanner scanner = new Scanner(System.in);

        boolean poprawnaLiczba = false;

        while (!poprawnaLiczba) {
            System.out.print("Podaj liczbę całkowitą: ");

            if (scanner.hasNextInt()) {
                int liczba = scanner.nextInt();
                poprawnaLiczba = true;

                switch (liczba) {
                    case 1:
                    case 4:
                    case 8:
                        System.out.println("Zmienna ma wartość 1, 4 lub 8.");
                        break;
                    case 2:
                    case 3:
                    case 7:
                        System.out.println("Zmienna ma wartość 2, 3 lub 7.");
                        break;
                    default:
                        System.out.println("Wszystkie inne przypadki.");
                }
            } else {
                System.out.println("To nie jest liczba całkowita. Spróbuj jeszcze raz.");
                scanner.next();
            }
        }

        scanner.close();
    }
    public static void zadanie13() {
        Scanner scanner = new Scanner(System.in);

        double accountBalance = 0.0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Podaj saldo konta bankowego (większe od 0): ");
            if (scanner.hasNextDouble()) {
                accountBalance = scanner.nextDouble();
                if (accountBalance > 0) {
                    validInput = true;
                } else {
                    System.out.println("Saldo konta musi być większe od 0. Spróbuj ponownie.");
                }
            } else {
                System.out.println("To nie jest liczba. Spróbuj ponownie.");
                scanner.next();
            }
        }

        double fee = accountBalance * 0.1;

        System.out.println("Opłata za prowadzenie konta wynosi: " + fee);

        scanner.close();
    }    
    public static void zadanie14() {
        Scanner scanner = new Scanner(System.in);
        int month = 0;

        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.print("Podaj numer miesiąca (1 - styczeń, 12 - grudzień): ");

            if (scanner.hasNextInt()) {
                month = scanner.nextInt();

                if (month >= 1 && month <= 12) {
                    isValidInput = true;
                } else {
                    System.out.println("Podano nieprawidłowy numer miesiąca. Numer miesiąca powinien być w przedziale od 1 do 12.");
                }
            } else {
                System.out.println("Podana wartość nie jest liczbą całkowitą.");
                scanner.next(); // Pomijamy niepoprawną wartość
            }
        }

        String nazwaMiesiaca = "";

        switch (month) {
            case 1:
                nazwaMiesiaca = "styczeń";
                break;
            case 2:
                nazwaMiesiaca = "luty";
                break;
            case 3:
                nazwaMiesiaca = "marzec";
                break;
            case 4:
                nazwaMiesiaca = "kwiecień";
                break;
            case 5:
                nazwaMiesiaca = "maj";
                break;
            case 6:
                nazwaMiesiaca = "czerwiec";
                break;
            case 7:
                nazwaMiesiaca = "lipiec";
                break;
            case 8:
                nazwaMiesiaca = "sierpień";
                break;
            case 9:
                nazwaMiesiaca = "wrzesień";
                break;
            case 10:
                nazwaMiesiaca = "październik";
                break;
            case 11:
                nazwaMiesiaca = "listopad";
                break;
            case 12:
                nazwaMiesiaca = "grudzień";
                break;
        }

        System.out.println("Pełna nazwa miesiąca to: " + nazwaMiesiaca);

        scanner.close();
    }
    public static void zadanie15() {
        Scanner scanner = new Scanner(System.in);

        String colorCode;
        String colorName;

        while (true) {
            System.out.print("Podaj kod koloru (np. 'R' - red, 'G' - green, 'B' - blue): ");
            colorCode = scanner.nextLine().toUpperCase();

            if (colorCode.equals("R") || colorCode.equals("G") || colorCode.equals("B")) {
                break;
            } else {
                System.out.println("Niepoprawny kod koloru. Spróbuj jeszcze raz.");
            }
        }

        switch (colorCode) {
            case "R":
                colorName = "Czerwony";
                break;
            case "G":
                colorName = "Zielony";
                break;
            case "B":
                colorName = "Niebieski";
                break;
            default:
                colorName = "Nieznany kolor";
                break;
        }

        System.out.println("Pełna nazwa koloru: " + colorName);

        scanner.close();
    }
}