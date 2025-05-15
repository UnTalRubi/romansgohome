package edu.estatuas.kataromannumerals;

import java.util.List;

public class RomansGoHome {
    public static void main(String[] args) {

        List.of("MMM", // 3000
                "MM", // 2000
                "M", // 1000
                "MMM D CCC L XXX V III", // 3888
                "MM D CC L XX V II", // 2777
                "CD X L IV", // 444
                "CD XXX IX" // 439
        ).stream()
                .map(RomanNumber::new)
                .forEach(n -> System.out.println(n.toString() + " = " + n.toDecimal()));
    }
}
