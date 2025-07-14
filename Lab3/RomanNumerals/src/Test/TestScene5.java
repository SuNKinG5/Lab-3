package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.RomanNumerals;

class TestScene5 {
	
	RomanNumerals roman = new RomanNumerals();
	
	@Test
    public void T1() {
        assertEquals(3, roman.convertRomanNumToInt("III"));
    }

    @Test
    public void T2() {
        assertEquals(15, roman.convertRomanNumToInt("VVV"));
        fail("Expected error input");
    }
    
    @Test
    public void T3() {
        assertEquals(150, roman.convertRomanNumToInt("LLL"));
        fail("Expected error input");
    }
    
    @Test
    public void T4() {
        assertEquals(1500, roman.convertRomanNumToInt("DDD"));
        fail("Expected error input");
    }
    
    @Test
    public void T5() {
        assertEquals(3000, roman.convertRomanNumToInt("MMMM"));
    }

}
