package com.radek;

public enum Operace {
    SCITANI('+'),
    ROZDIL('-'),
    DELENI('/'),
    NASOBENI('*');

    private final char symbol;

    Operace(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public static Operace zeSymbolu(char symbol) {
        for (Operace o : Operace.values()) {
            if (o.getSymbol() == symbol) {
                return o;
            }
        }
        throw new IllegalArgumentException("zadal jsi špatný operátor '" + symbol+ "' zadej správný ");
    }

}


