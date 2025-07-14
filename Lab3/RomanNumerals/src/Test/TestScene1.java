package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.RomanNumerals;

class TestScene1 {

    RomanNumerals roman = new RomanNumerals();

    @Test
    public void T1() {
        assertEquals(1, roman.convertRomanNumToInt("I"));
    }
    
    @Test
    public void T2() {
        assertEquals(5, roman.convertRomanNumToInt("V"));
    }

    @Test
    public void T3() {
        assertEquals(50, roman.convertRomanNumToInt("L"));
    }

    @Test
    public void T4() {
        assertEquals(500, roman.convertRomanNumToInt("D"));
    }

    @Test
    public void T5() {
        assertEquals(1000, roman.convertRomanNumToInt("M"));
    }

}
