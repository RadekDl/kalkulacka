package com.radek;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("První číslo: ");
        double a = sc.nextDouble();

        System.out.print("Operátor (+ - * /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Druhé číslo: ");
        double b = sc.nextDouble();

        Vypocet vypocet = new Vypocet(a, b);
// switch (operator) { ... volání scitani(), rozdil(), ... }
    }
}
