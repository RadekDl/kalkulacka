package com.radek;

public class Main {
    static void main() {
        VstupProKalkulacku vstup = new VstupProKalkulacku();

        while (true) {
            Double a = vstup.nactiPrvniCislo();
            if (a == null) {
                break;
            }
            Operace operace = vstup.nactiOperator();
            double b = vstup.nactiDruheCislo();

            Vypocet vypocet = new Vypocet(a, b);

            try {
                System.out.println("Výsledek: " + vypocet.vypocitej(operace));
            } catch (ArithmeticException e) {
                System.out.println("Chyba: " + e.getMessage());
            }
        }
    }
}