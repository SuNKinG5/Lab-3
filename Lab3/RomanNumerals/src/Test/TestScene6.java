package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.RomanNumerals;

class TestScene6 {

	RomanNumerals roman = new RomanNumerals();
	
	@Test
    public void T1() {
        assertEquals(26, roman.convertRomanNumToInt("XXVI"));
    }

    @Test
    public void T2() {
        assertEquals(27, roman.convertRomanNumToInt("XXVII"));
    }

    @Test
    public void T3() {
        assertEquals(67, roman.convertRomanNumToInt("LXVII"));
    }

    @Test
    public void T4() {
        assertEquals(1601, roman.convertRomanNumToInt("MDCI"));
    }

    @Test
    public void T5() {
        assertEquals(1610, roman.convertRomanNumToInt("MDCX"));
    }

}
