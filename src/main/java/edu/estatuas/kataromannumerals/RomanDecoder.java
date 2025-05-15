package edu.estatuas.kataromannumerals;

import java.util.regex.*;

public class RomanDecoder {

    private String regex = "(CM)|(M{1,3})|(CD)|(D)|(XC)|(C{1,3})|(XL)|(L)|(IX)|(X{1,3})|(IV)|(V)|(I{1,3})";

    public Integer romanToDecimal(String romanNumber) {

        Integer summatory = 0;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(romanNumber);

        while (matcher.find()) {
            summatory += RomanSymbols.valueOf(matcher.group()).getDecimalValue();
        }

        return summatory;
    }
}