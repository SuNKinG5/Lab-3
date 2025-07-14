package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.RomanNumerals;

class TestScene4 {
	
	RomanNumerals roman = new RomanNumerals();
	
	@Test
    public void T1() {
        assertEquals(2, roman.convertRomanNumToInt("II"));
    }

    @Test
    public void T2() {
        assertEquals(20, roman.convertRomanNumToInt("XX"));
    }
    
    @Test
    public void T3() {
        assertEquals(100, roman.convertRomanNumToInt("CC"));
        fail("Ecpected error input");
    }
    
    
    @Test
    public void T4() {
        assertEquals(2000, roman.convertRomanNumToInt("MM"));
    }
}
