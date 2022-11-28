import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PigLatinTest {

	@Test
	public void apple() {
		String translatedName = PigLatin.translate("apple");
		assertEquals("appleway", translatedName);	
	}
	
	@Test
	public void elseword() {
		String translatedName = PigLatin.translate("else");
		assertEquals("elseway", translatedName);	
	}
	@Test
	public void giraffe() {
		String translatedName = PigLatin.translate("giraffe");
		assertEquals("iraffegay", translatedName);	
	}
	@Test
	public void voweltest1() {
		String translatedName = PigLatin.translate("orange");
		assertEquals("orangeway", translatedName);	
	}

	@Test
	public void voweltest2() {
		String translatedName = PigLatin.translate("ink");
		assertEquals("inkway", translatedName);	
	}
	
	@Test
	public void voweltest3() {
		String translatedName = PigLatin.translate("alligator");
		assertEquals("alligatorway", translatedName);	
	}
	@Test
	public void voweltest4() {
		String translatedName = PigLatin.translate("outrageous");
		assertEquals("outrageousway", translatedName);	
}
	@Test
	public void voweltest5() {
		String translatedName = PigLatin.translate("unicorn");
		assertEquals("unicornway", translatedName);
	}
	@Test
	public void consonanttest1() {
		String translatedName = PigLatin.translate("leaf");
		assertEquals("eaflay", translatedName);
	}
	@Test
	public void consonanttest2() {
		String translatedName = PigLatin.translate("cake");
		assertEquals("akecay", translatedName);
	}
	@Test
	public void twoconsonanttest() {
		String translatedName = PigLatin.translate("creepy");
		assertEquals("eepycray", translatedName);
	}
	@Test
	public void threeconsonanttest() {
		String translatedName = PigLatin.translate("sssnake");
		assertEquals("akesssnay", translatedName);
	}
		@Test
		public void capitaltest() {
			String translatedName = PigLatin.translate("YELLING");
			assertEquals("ellingyay", translatedName);
	}
}
