package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.RomanNumerals;

class TestScene7 {

	RomanNumerals roman = new RomanNumerals();
	
	@Test
    public void T1() {
        assertEquals(74, roman.convertRomanNumToInt("LXXIV"));
    }

    @Test
    public void T2() {
        assertEquals(77, roman.convertRomanNumToInt("LXXVII"));
    }

    @Test
    public void T3() {
        assertEquals(78, roman.convertRomanNumToInt("LXXVIII"));
    }

    @Test
    public void T4() {
        assertEquals(1034, roman.convertRomanNumToInt("MXXXIV"));
    }
    
    @Test
    public void T5() {
        assertEquals(1038, roman.convertRomanNumToInt("MXXXVIII"));
    }
}
