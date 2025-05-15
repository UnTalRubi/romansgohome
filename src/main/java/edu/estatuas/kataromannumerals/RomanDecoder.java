package edu.estatuas.kataromannumerals;

import java.util.regex.*;

public class RomanDecoder {

    private String regex = "(M{1,3})";

    public Integer romanToDecimal(String romanNumber) {

        Integer summatory = 0;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(romanNumber);

        while (matcher.find()) {
            summatory += RomanSymbols.M.getDecimalValue() * matcher.group().length();
        }

        return summatory;
    }
}