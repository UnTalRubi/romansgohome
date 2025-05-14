package edu.estatuas.kataromannumerals;

public enum RomanSymbols {

    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    private int decimalValue;

    private RomanSymbols(int decimalValue) {
        this.decimalValue = decimalValue;
    }

    public int getDecimalValue() {
        return this.decimalValue;
    }
}
