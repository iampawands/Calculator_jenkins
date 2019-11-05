package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void addTest() {
		Calculator calc = new Calculator();
		assertEquals(5, calc.add(0,5));
	}
	
	@Test
	public void subTest() {
		Calculator calc = new Calculator();
		assertEquals(1, calc.sub(6,5));
	}
	@Test
	public void mulTest() {
		Calculator calc = new Calculator();
		assertEquals(25, calc.mul(5,5));
	}
	@Test
	public void divTest() {
		Calculator calc = new Calculator();
		assertEquals(1, calc.div(5,5));
	}
	
}
