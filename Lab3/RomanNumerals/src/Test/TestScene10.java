package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.RomanNumerals;

class TestScene10 {

	RomanNumerals roman = new RomanNumerals();
	
	@Test
    public void T1() {
        assertNotEquals(4, roman.convertRomanNumToInt("IIII"));
    }
	
	@Test
    public void T2() {
        assertNotEquals(40, roman.convertRomanNumToInt("XXXX"));
    }

	@Test
    public void T3() {
        assertNotEquals(400, roman.convertRomanNumToInt("CCCC"));
    }
	
	@Test
    public void T4() {
        assertNotEquals(4000, roman.convertRomanNumToInt("MMMM"));
    }
	
}
