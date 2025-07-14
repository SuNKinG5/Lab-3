package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.RomanNumerals;

class TestScene9 {
	
	RomanNumerals roman = new RomanNumerals();
	
	@Test
    public void T1() {
        assertNotEquals(10, roman.convertRomanNumToInt("VV"));
    }

    @Test
    public void T2() {
        assertNotEquals(100, roman.convertRomanNumToInt("LL"));
    }
    
    @Test
    public void T3() {
        assertNotEquals(1000, roman.convertRomanNumToInt("DD"));
    }

}
