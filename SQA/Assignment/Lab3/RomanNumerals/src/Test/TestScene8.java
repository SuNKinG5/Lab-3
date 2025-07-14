package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.RomanNumerals;

class TestScene8 {
	
	RomanNumerals roman = new RomanNumerals();
	
	@Test
    public void T1() {
        roman.convertRomanNumToInt("A");
    }

    @Test
    public void T2() {
        roman.convertRomanNumToInt("B");
    }
    
    @Test
    public void T3() {
        roman.convertRomanNumToInt("H");
    }
    
    @Test
    public void T4() {
        roman.convertRomanNumToInt("Y");
    }
    
    @Test
    public void T5() {
        roman.convertRomanNumToInt("Z");
    }
}
