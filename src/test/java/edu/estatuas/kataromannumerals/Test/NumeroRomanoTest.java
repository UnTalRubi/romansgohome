package edu.estatuas.kataromannumerals.Test;

import org.junit.jupiter.api.Test;

import edu.estatuas.kataromannumerals.RomanNumber;

import org.junit.jupiter.api.Tag;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
            "3300,  UMMMUCCCU"
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
    @Test
    @Tag("sumatorio")
    public void tres_repeticiones_C_test() {

        String testCase = "UMMMUCCCU";
        numeroRomano = new RomanNumber(testCase);
        assertEquals("3300", numeroRomano.toDecimal().toString());
    }

    @Test
    @Tag("sumatorio")
    public void tres_repeticiones_X_test() {

        String testCase = "UMMMUXXXU";
        numeroRomano = new RomanNumber(testCase);

        assertEquals("3030", numeroRomano.toDecimal().toString());
    }
    @Test
    @Tag("sumatorio")
    public void tres_repeticiones_I_test() {

        String testCase = "UMMMUIIIU";
        numeroRomano = new RomanNumber(testCase);

        assertEquals("3003", numeroRomano.toDecimal().toString());
    }
    @Test
    @Tag("sumatorio")
    public void una_D_test() {

        String testCase = "UMMMUDUIIIU";
        numeroRomano = new RomanNumber(testCase);
        assertEquals("3503", numeroRomano.toDecimal().toString());

        testCase = "MMMUCDUIIIU";
        numeroRomano = new RomanNumber(testCase);
        assertNotEquals("3503", numeroRomano.toDecimal().toString());
    }
    /**
     * Grupos sustractivos
     * IV(4), IX(9), 
     * XL(40), XC(90), 
     * CD(400), CM(900)
     */

    @Test
    @Tag("sustractivo")
    public void grupo_C_DM_test() {

        String testCase = "UCDU";
        numeroRomano = new RomanNumber(testCase);
        assertEquals("400", numeroRomano.toDecimal().toString());

        testCase = "UCMU";
        numeroRomano = new RomanNumber(testCase);
        assertEquals("900", numeroRomano.toDecimal().toString());
    }
    @Test
    @Tag("sustractivo")
    public void grupo_X_LC_test() {

        String testCase = "UXLU";
        numeroRomano = new RomanNumber(testCase);
        assertEquals("40", numeroRomano.toDecimal().toString());  

        testCase = "UXCU";
        numeroRomano = new RomanNumber(testCase);
        assertEquals("90", numeroRomano.toDecimal().toString());        
    }
    @Test
    @Tag("sustractivo")
    public void grupo_I_VX_test() {

        String testCase = "UIVU";
        numeroRomano = new RomanNumber(testCase);
        assertEquals("4", numeroRomano.toDecimal().toString());  

        testCase = "UIXU";
        numeroRomano = new RomanNumber(testCase);
        assertEquals("9", numeroRomano.toDecimal().toString());  
    }
    @Test
    @Tag("sustractivo")
    public void grupos_sumatorios_tres_digitos_test() {
        String testCase = "MMMDCCCLXXXVIII"; // 3888
        numeroRomano = new RomanNumber(testCase);
        assertEquals("3888", numeroRomano.toDecimal().toString());
    }
    @Test
    @Tag("sustractivo")
    public void grupos_sumatorios_test() {
        String testCase = "MMDCCLXXVII"; // 2777
        numeroRomano = new RomanNumber(testCase);
        assertEquals("2777", numeroRomano.toDecimal().toString());
    }
    @Test
    @Tag("sustractivo")
    public void grupos_substractivos_test() {
        String testCase = "CDXLIV"; // 444
        numeroRomano = new RomanNumber(testCase);
        assertEquals("444", numeroRomano.toDecimal().toString());

        testCase = "CDXXXIX"; // 439
        numeroRomano = new RomanNumber(testCase);
        assertEquals("439", numeroRomano.toDecimal().toString());
    }

}
