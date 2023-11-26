package com.org;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class StringTest {

	private JavaUtils j = new JavaUtils();
	
	@Test
	public void testStringToInt1() {
		Integer actual = j.stringToInt("123");
		
		assertEquals(123,actual);
	}

	@Test
	public void testStringToInt2() {		
		assertThrows(IllegalArgumentException.class, ()-> j.stringToInt(null));
	}
	
	@Test
	public void testStringToInt3() {		
		assertThrows(IllegalArgumentException.class, ()-> j.stringToInt("  "));
	}
}
