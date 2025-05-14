package edu.estatuas.kataromannumerals;

public class RomanNumber {

    private String romanAnnotation;

    private Short decimalAnnotation;

    private RomanDecoder romanDecoder;

    public RomanNumber(String romanAnnotation) {

        this.romanAnnotation = romanAnnotation;
        romanDecoder = new RomanDecoder();
    }

    public Short toDecimal() {

        return (romanDecoder.romanToDecimal(romanAnnotation).shortValue());
    }

    public Short getDecimalAnnotation() {

        return decimalAnnotation;
    }

    public String getRomanAnnotation() {

        return romanAnnotation;
    }

    @Override
    public String toString() {
        return getRomanAnnotation();
    }
}
