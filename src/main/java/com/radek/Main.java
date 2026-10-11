package com.radek;

public class Main {
    static void main() {
        VstupProKalkulacku vstup = new VstupProKalkulacku();

        while (true) {
            Double a = vstup.nactiPrvniCislo();
            if (a == null) {
                break;
            }
            char operator = vstup.nactiOperator();
            double b = vstup.nactiDruheCislo();

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