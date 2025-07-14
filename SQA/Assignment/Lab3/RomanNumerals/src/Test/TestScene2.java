package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.RomanNumerals;

class TestScene2 {

	RomanNumerals roman = new RomanNumerals();
	
	@Test
    public void T1() {
        assertEquals(4, roman.convertRomanNumToInt("IV"));
    }
	
    @Test
    public void T2() {
        assertEquals(9, roman.convertRomanNumToInt("IX"));
    }

    @Test
    public void T3() {
        assertEquals(5, roman.convertRomanNumToInt("VX"));
        fail("Expected error input");
    }
    
    @Test
    public void T4() {
        assertEquals(50, roman.convertRomanNumToInt("LC"));
    }
    
    @Test
    public void T5() {
        assertEquals(500, roman.convertRomanNumToInt("DM"));
        
    }
}
