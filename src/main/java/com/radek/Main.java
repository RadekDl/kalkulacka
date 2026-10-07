package com.radek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main() {

//        Scanner sc = new Scanner(System.in);
//
//
//            while (true) {
//                try {
//                System.out.println("první číslo (q = konec: ");
//                String vstup = sc.next();
//                if(vstup.equalsIgnoreCase("q")){
//                    break;
//                }
//                double a = Double.parseDouble(vstup);
//
//                System.out.print("Operátor (+ - * /): ");
//                char operator = sc.next().charAt(0);
//
//                System.out.print("Druhé číslo: ");
//                double b = Double.parseDouble(sc.next());
//
//                Vypocet vypocet = new Vypocet(a, b);
//
//
//                switch (operator) {
//                    case '+' -> System.out.println("Výsledek: " + vypocet.scitani());
//                    case '-' -> System.out.println("Výsledek: " + vypocet.rozdil());
//                    case '*' -> System.out.println("Výsledek: " + vypocet.nasobeni());
//                    case '/' -> System.out.println("Výsledek: " + vypocet.deleni());
//                    default -> System.out.println("Neznámý operátor: " + operator);
//                }
//            } catch(NumberFormatException e){
//                System.out.println("Chyba: zadej platné číslo.");
//            } catch(ArithmeticException e){
//                System.out.println("Chyba: " + e.getMessage());
//            }
//        }


        // opravuje každou chybu čísla operátoru zvlášt nemusí se celé zadávat znovu jako výše
        Scanner sc = new Scanner(System.in);

        while (true) {
            // první číslo (nebo q)
            System.out.print("První číslo (q = konec): ");
            String vstup = sc.next();
            if (vstup.equalsIgnoreCase("q")) {
                break;
            }

            double a;
            try {
                a = Double.parseDouble(vstup);
            } catch (NumberFormatException e) {
                System.out.println("Chyba: zadej platné číslo.");
                continue;   // zpět na začátek vnější smyčky
            }

            // operátor – opakuje se, dokud není platný
            char operator;
            while (true) {
                System.out.print("Operátor (+ - * /): ");
                operator = sc.next().charAt(0);
                if ("+-*/".indexOf(operator) >= 0) {
                    break;
                }
                System.out.println("Neznámý operátor, zkus znovu.");
            }

            // druhé číslo – opakuje se, dokud není platné
            double b;
            while (true) {
                System.out.print("Druhé číslo: ");
                try {
                    b = Double.parseDouble(sc.next());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Chyba: zadej platné číslo.");
                }
            }

            Vypocet vypocet = new Vypocet(a, b);

            try {
                switch (operator) {
                    case '+' -> System.out.println("Výsledek: " + vypocet.scitani());
                    case '-' -> System.out.println("Výsledek: " + vypocet.rozdil());
                    case '*' -> System.out.println("Výsledek: " + vypocet.nasobeni());
                    case '/' -> System.out.println("Výsledek: " + vypocet.deleni());
                }
            } catch (ArithmeticException e) {
                System.out.println("Chyba: " + e.getMessage());
            }
        }
    }
}