package com.org;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class EvenOrOddTest {

	@ParameterizedTest
	@CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
	public void evenOrOddTest(String input, String output) {
		EvenOrOdd eo = new EvenOrOdd();
		String actual = eo.evenOrOdd(Integer.parseInt(input));
		
		assertEquals(output, actual);
	}
}
