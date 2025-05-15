package edu.estatuas.kataromannumerals.Test;

import org.junit.jupiter.api.Test;

import edu.estatuas.kataromannumerals.RomanNumber;

import org.junit.jupiter.api.Tag;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumeroRomanoTest {

    public RomanNumber numeroRomano;

    /**
     * Grupos sumatorios M, C, X, I
     */
    @Tag("sumatorio")
    @ParameterizedTest
    @CsvSource({
            "1000,  M",
            "2000,  UMMU",
            "3000,  UMMMU",
            "4000,  UMMMMU"
    })
    void grupo_M_test(String decimal, String roman) {

        // String testCase = "M";
        numeroRomano = new RomanNumber(roman);
        assertEquals(decimal, numeroRomano.toDecimal().toString());

        /**
         * El caso MMMM es control de errores
         * y no puede estar en el test de la logica
         * Asumimos que la entrada es correcta.
         * Sino, hay que programar la gestion de errores
         */
    }
}
