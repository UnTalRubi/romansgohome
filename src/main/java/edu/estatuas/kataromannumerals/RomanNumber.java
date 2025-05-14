package edu.estatuas.kataromannumerals;

public class RomanNumber {

    String romanAnnotation;

    Short decimalAnnotation;

    public RomanNumber(String romanAnnotation) {
        this.romanAnnotation = romanAnnotation;
    }

    public Short toDecimal() {

        return Short.valueOf("0");
    }
}
