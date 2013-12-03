package de.andreas.da.lab3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTests {
	private Calculator calc;

	@Before
	public void newCalculator() {
		calc = new Calculator();
	}			

	@SuppressWarnings("static-access")
	@Test
	public void testAdd() {
		assertEquals(3, calc.add(1, 2));
		assertEquals(123, calc.add(123, 0));
		assertEquals(321, calc.add(321, 0));
		assertEquals(-2, calc.add(7, -9));
		assertEquals(32, calc.add(-68, 100));
		assertEquals(0, calc.add(0, 0));
	}

	@SuppressWarnings("static-access")
	@Test
	public void testRemove(){
		assertEquals(3, calc.subtract(6, 3));
	}
	
}
