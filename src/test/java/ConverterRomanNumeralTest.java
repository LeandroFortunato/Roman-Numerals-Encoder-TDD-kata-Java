import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConverterRomanNumeralTest {

//    The Kata says you should write a function to convert from normal numbers to Roman Numerals: eg
    //     1 --> I
    //     5 --> V
    //     10 --> X
    //     30 --- XXX
    //     40 --- XL
    //     50 --> L
    //     100 --> C
    //     400 --> CD
    //     500 --> D
    //     1000 --> M     2022 --> MMXXII   2322  ---> MMCCCXXII


        @Test
        public void testConvertMultiplesOf1000LessThan4000ToRN (){

            ConverterRomanNumeral converterRN = new ConverterRomanNumeral();

            assertEquals("MM",converterRN.convertToRoman(2000));
            assertEquals("MMM",converterRN.convertToRoman(3000));
        }

        @Test
        public void testConvertMultiplesOf100ThatAreLessThan400ToRN (){

            ConverterRomanNumeral converterRN = new ConverterRomanNumeral();

            assertEquals("CC",converterRN.convertToRoman(200));
            assertEquals("CCC",converterRN.convertToRoman(300));
        }

        @Test
        public void testConvert400ToRN (){

            ConverterRomanNumeral converterRN = new ConverterRomanNumeral();

            assertEquals("CD",converterRN.convertToRoman(400));
        }

        @Test
        public void testConvertMultiplesOf10ThatAreLessThan40 (){

            ConverterRomanNumeral converterRN = new ConverterRomanNumeral();

            assertEquals("XX",converterRN.convertToRoman(20));
            assertEquals("XXX",converterRN.convertToRoman(30));
        }

        @Test
        public void testConvert40ToRN (){

            ConverterRomanNumeral converterRN = new ConverterRomanNumeral();

            assertEquals("XL",converterRN.convertToRoman(40));
        }

        @Test

        public void testConvertUpTo7ToRN (){

            ConverterRomanNumeral converterRN = new ConverterRomanNumeral();

            assertEquals("I",converterRN.convertToRoman(1));
            assertEquals("II",converterRN.convertToRoman(2));
            assertEquals("III",converterRN.convertToRoman(3));
            assertEquals("IV",converterRN.convertToRoman(4));
            assertEquals("V",converterRN.convertToRoman(5));
            assertEquals("VII",converterRN.convertToRoman(7));
        }

        @Test
        public void testConvertCompoundNumbersOver1000MultipleOf100ToRN (){

            ConverterRomanNumeral converterRN = new ConverterRomanNumeral();

            assertEquals("MC",converterRN.convertToRoman(1100));
            assertEquals("MCCC",converterRN.convertToRoman(1300));
            assertEquals("MCC",converterRN.convertToRoman(1200));
            assertEquals("MCD",converterRN.convertToRoman(1400));
            assertEquals("MD",converterRN.convertToRoman(1500));
            assertEquals("MDC",converterRN.convertToRoman(1600));
            assertEquals("MCM",converterRN.convertToRoman(1900));
            assertEquals("MMC",converterRN.convertToRoman(2100));
        }

        @Test
        public void testConvertCompoundNumbersOver1000MultipleOf10ToRN (){

            ConverterRomanNumeral converterRN = new ConverterRomanNumeral();

            assertEquals("MCXXX",converterRN.convertToRoman(1130));
            assertEquals("MCCCXC",converterRN.convertToRoman(1390));

            assertEquals("XXIII",converterRN.convertToRoman(23));

        }

        @Test
        public void testConvertNumbersLowerThan50ToRN (){

            ConverterRomanNumeral converterRN = new ConverterRomanNumeral();

            assertEquals("XXIII",converterRN.convertToRoman(23));
            assertEquals("XLIX",converterRN.convertToRoman(49));

        }
    @Test
    public void print1to3000 (){

        ConverterRomanNumeral converterRN = new ConverterRomanNumeral();

        for (int i = 1; i < 4000; i++) {
            System.out.println(converterRN.convertToRoman(i));
        }

    }
}
