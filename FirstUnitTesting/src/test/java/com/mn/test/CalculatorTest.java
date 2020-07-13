package com.mn.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mn.cal.Calculator;

public class CalculatorTest {

	public static Calculator cal=null;
	
	@BeforeClass
	public static void init() {
		cal =new Calculator();
	}
	
	@Test
	public void test1() {
		Integer result=cal.div(10, 2);
		Integer expectvalue=5;
		
		assertEquals(result, expectvalue);
	}
	
	@Test(expected = ArithmeticException.class)
	public void test2() {
		Integer result=cal.div(10, 2);
		Integer expectvalue=5;
		
		assertEquals(result, expectvalue);
	}
	
	@AfterClass
	public static void destroy() {
		cal=null;
	}
}
