package griffith;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConversionsTest {

	@Test
	void testEuroToDollar() {
		Conversions conversions = new Conversions();
		assertEquals(107, conversions.euroToDollar(100)); //Positives
		assertEquals(0, conversions.euroToDollar(0));	//Zero
		assertEquals(-107, conversions.euroToDollar(-100));	//Negatives
	}

	@Test
	void testDollarToEuro() {
		Conversions conversions = new Conversions();
		assertEquals(100, conversions.dollarToEuro(107)); //Positives
		assertEquals(0, conversions.dollarToEuro(0));	//Zero
		assertEquals(-100, conversions.dollarToEuro(-107));	//Negatives
	}

	@Test
	void testStringToInteger() {
		Conversions conversions = new Conversions();
		assertEquals(42, conversions.stringToInteger("42"));
		assertEquals(-42, conversions.stringToInteger("-42"));
		Throwable e = assertThrows(IllegalArgumentException.class, () ->
			conversions.stringToInteger(""));
			assertEquals("String can't be empty or of incorrect format", e.getMessage());
	}

	@Test
	void testIntegerToString() {
		Conversions conversions = new Conversions();
		assertEquals("42", conversions.integerToString(42));
		assertEquals("-42", conversions.integerToString(-42));
		Throwable e = assertThrows(NullPointerException.class, () ->
			conversions.integerToString((Integer)null));
			assertEquals("Cannot invoke \"java.lang.Integer.intValue()\" because \"null\" is null", e.getMessage());
	}
	
}