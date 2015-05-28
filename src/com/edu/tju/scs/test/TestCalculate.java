package com.edu.tju.scs.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculate {
	
	private static Calculate calculate = new Calculate();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPlus() {
		assertEquals(0, calculate.plus(-5, 5), 0);
	}

	@Test
	public void testMinus() {
		assertEquals(0, calculate.minus(10, 10), 0);
	}

	@Test
	public void testTimes() {
		assertEquals(0, calculate.times(10, 0), 0);
	}

	@Test(expected=ArithmeticException.class)
	public void testDivide() {
		calculate.divide(10, 0);
	}

}
