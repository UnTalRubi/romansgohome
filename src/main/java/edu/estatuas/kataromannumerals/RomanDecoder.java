package edu.estatuas.kataromannumerals;

import java.util.regex.*;

public class RomanDecoder {

    private String regex = "M";

    private Integer summatory;

    public Integer romanToDecimal(String romanNumber) {

        summatory = 0;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(romanNumber);

        while (matcher.find()) {
            summatory += RomanSymbols.M.getDecimalValue();
        }

        return summatory;
    }
}