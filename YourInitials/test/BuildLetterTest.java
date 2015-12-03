import static org.junit.Assert.*;

import org.junit.Test;

public class BuildLetterTest {

	@Test
	public void test() {
		
		//BASIC FIRST LETTER 'A' FIRST LINE TEST
		
		Letters ltrs = new Letters();
		
		//Test 1st line returned (starts at 0)
		String actual = ltrs.BuildLetter("A".charAt(0), 0);		
		String expected = "  A  ";
		
		assertEquals(expected, actual);
		
		//fail("Not yet implemented-" + actual);
	}

	@Test
	public void test_missingletterpart() {
		
		//TEST ALL LETTERS RETURN STRING FOR FIRST LINE 5 CHARS LONG
		
		Letters ltrs = new Letters();
		
		//Test the next line of every letter
		for (int line = 0; line <= 6;line++){
		
			//Go through all letters for this line
			for (int NextLetterAscii = (int) 'a';NextLetterAscii <= (int) 'z'; NextLetterAscii++){
				
				//Test 1st line returned of each letter(starts at 0)
				String actual = ltrs.BuildLetter((char) NextLetterAscii, line);		
	
				//Get length of string returned
				int actuallen = actual.length();
				int expectedlen = 5;
				
				System.out.println("Testing Letter: " + (char) NextLetterAscii + " Line: " + line);
				
				assertTrue(actuallen == expectedlen);
				
			}
			
		}
		
		
		//fail("Not yet implemented-" + actual);
	}
}
