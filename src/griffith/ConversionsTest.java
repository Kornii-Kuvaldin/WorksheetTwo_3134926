//Kornii Kuvaldin 3134926
package griffith;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConversionsTest {

	@Test
	void testEuroToDollar() { //Tests euroToDollar method
		Conversions conversions = new Conversions();
		assertEquals(107, conversions.euroToDollar(100)); //Positives
		assertEquals(0, conversions.euroToDollar(0));	//Zero
		assertEquals(-107, conversions.euroToDollar(-100));	//Negatives
	}

	@Test
	void testDollarToEuro() { //Tests dollarToEuro method
		Conversions conversions = new Conversions();
		assertEquals(100, conversions.dollarToEuro(107)); //Positives
		assertEquals(0, conversions.dollarToEuro(0));	//Zero
		assertEquals(-100, conversions.dollarToEuro(-107));	//Negatives
	}

	@Test
	void testStringToInteger() { //Tests stringToInteger method
		Conversions conversions = new Conversions();
		assertEquals(42, conversions.stringToInteger("42"));
		assertEquals(-42, conversions.stringToInteger("-42"));
		Throwable e = assertThrows(IllegalArgumentException.class, () ->
		conversions.stringToInteger(""));
		assertEquals("String can't be empty or of incorrect format", e.getMessage());
	}

	@Test
	void testIntegerToString() { //Tests integerToString method
		Conversions conversions = new Conversions();
		assertEquals("42", conversions.integerToString(42));
		assertEquals("-42", conversions.integerToString(-42));
		Throwable e = assertThrows(NullPointerException.class, () ->
		conversions.integerToString((Integer)null));
		assertEquals("Cannot invoke \"java.lang.Integer.intValue()\" because \"null\" is null", e.getMessage());
	}

	@Test
	void testSwitchCase() { //Tests switchCase method
		Conversions conversions = new Conversions();
		assertEquals("APPLE", conversions.switchCase("apple"));
		assertEquals("orange", conversions.switchCase("ORANGE"));
		assertEquals("BaNaNa", conversions.switchCase("bAnAnA"));
	}

}