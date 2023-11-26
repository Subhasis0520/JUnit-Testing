package com.org;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

public class CalculatorTest2 {

	
    private static Calculator c = null;
    
    @BeforeClass // or BeforeEach
    public static  void init() {
    	c = new Calculator();
    }

    @AfterClass // or AfterEach
    public static void destroy() {
    	c = null;
    }
    
	
	@Test
	public void testAdd() {	
		int actualResult = c.add(2, 4);
		int expectedResult = 6;
		
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testMul() {		
		int actualResult = c.mul(6, 8);
		int expectedResult = 48;
		
		assertEquals(expectedResult, actualResult);
	}
}
