package com.radek;

import java.util.Scanner;

public class VstupProKalkulacku {
    private final Scanner sc = new Scanner(System.in);
    public Double nactiPrvniCislo(){
        while(true) {
            System.out.println("zadej první číslo: (q = konec) ");
            String vstup = sc.next();
            if (vstup.equalsIgnoreCase("q")){
                return null;
            }
            try {
                return Double.parseDouble(vstup);
            } catch (NumberFormatException e) {
                System.out.println("chyba: zadej platné číslo ");
            }
        }
    }

    public Double nactiDruheCislo() {
        while (true) {
            System.out.println("zadej druhé číslo: ");
            String vstup = sc.next();

            try {
                return Double.parseDouble(vstup);
            } catch (NumberFormatException e) {
                System.out.println("chyba zadej platné číslo");
            }
        }
    }

    public char nactiOperator() {
        while (true) {
            System.out.print("zadej operátor (+ - * /): ");
            String vstup = sc.next();
            if (vstup.length() == 1 && "+-*/".indexOf(vstup.charAt(0)) >= 0) {
                return vstup.charAt(0);
            }
            System.out.println("neznámý operátor, zkus znovu");
        }
    }
}
