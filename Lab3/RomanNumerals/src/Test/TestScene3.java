package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.RomanNumerals;

class TestScene3 {
	
	RomanNumerals roman = new RomanNumerals();
	
	@Test
    public void T1() {
        assertEquals(6, roman.convertRomanNumToInt("VI"));
    }
	
	@Test
    public void T2() {
        assertEquals(11, roman.convertRomanNumToInt("XI"));
    }
	
    @Test
    public void T3() {
        assertEquals(150, roman.convertRomanNumToInt("CL"));
    }
    
    @Test
    public void T4() {
        assertEquals(1100, roman.convertRomanNumToInt("MC"));
    }
    
    @Test
    public void T5() {
        assertEquals(1500, roman.convertRomanNumToInt("MD"));
    }


}
