package edu.estatuas.kataromannumerals;

import java.util.List;

public class RomansGoHome {
    public static void main(String[] args) {

        List.of("MMM", // 3000
                "MM", // 2000
                "M", // 1000
                "MMMDCCCLXXXVIII", // 3888
                "MMDCCLXXVII", // 2777
                "CDXLIV", // 444
                "CDXXXIX" // 439
        ).stream()
                .map(RomanNumber::new)
                .forEach(n -> System.out.println(n.toString() + " = " + n.toDecimal()));
    }
}
