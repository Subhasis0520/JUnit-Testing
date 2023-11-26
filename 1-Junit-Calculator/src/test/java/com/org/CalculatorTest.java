package com.org;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	/*
    Calculator c = null;
    
    @BeforeAll // or BeforeEach
    public  void init() {
    	c = new Calculator();
    }

    @AfterAll // or AfterEach
    public void destroy() {
    	c = null;
    }
    */
	
	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		
		int actualResult = c.add(2, 4);
		int expectedResult = 6;
		
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testMul() {
		Calculator c = new Calculator();
		
		int actualResult = c.mul(6, 8);
		int expectedResult = 48;
		
		assertEquals(expectedResult, actualResult);
	}
}
