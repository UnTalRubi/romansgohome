package edu.estatuas.kataromannumerals;

public enum RomanSymbols {

    I(1), II(2), III(3),
    IV(4), V(5), IX(9),
    X(10), XX(20), XXX(30),
    XL(40), L(50), XC(90),
    C(100), CC(200), CCC(300),
    CD(400), D(500), CM(900),
    M(1000), MM(2000), MMM(3000);

    private int decimalValue;

    private RomanSymbols(int decimalValue) {
        this.decimalValue = decimalValue;
    }

    public int getDecimalValue() {
        return this.decimalValue;
    }
}
