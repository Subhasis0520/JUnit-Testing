package com.org;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeTest {

	@ParameterizedTest
	@ValueSource(strings = {"madam", "radar","racecar","malayalam","subha"})
	public void testPalindrome(String s) {
		PalindromeCheck pc = new PalindromeCheck();
		
		boolean result = pc.isPalindrome(s);
		assertTrue(result);
	}
}
