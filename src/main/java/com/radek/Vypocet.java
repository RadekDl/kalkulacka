package com.radek;

public class Vypocet {
    private final double cisloA;
    private final double cisloB;

    public Vypocet(double cisloA, double cisloB) {
        this.cisloA = cisloA;
        this.cisloB = cisloB;
    }

    public double scitani(){
        double vysledek = cisloA + cisloB;

        return vysledek;
    }

    public double rozdil(){
        double vysledek = cisloA - cisloB;

        return vysledek;
    }

    public double nasobeni(){
        double vysledek = cisloA * cisloB;

        return vysledek;
    }

    public double deleni(){
        if (cisloB == 0){
            throw new ArithmeticException("dělení nulou není možné");
        }
        double vysledek = cisloA / cisloB;

        return vysledek;
    }



}
