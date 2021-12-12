package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Calculator;

class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		assertEquals(0, calculator.add(0, 0));
		assertEquals(4, calculator.add(2, 2));
		assertEquals(0, calculator.add(3, -3));

	}

	@ParameterizedTest
	@CsvSource(value = { "1:1", "1:2", "1:5", "0:0" }, delimiter = ':')
	public void Should_add_two_numbers_and_return_result_parameterized(int valueOne, int valueTwo) {
		// Implement
		assertEquals(valueOne + valueTwo, calculator.add(valueOne, valueTwo));
	}

	@Test
	public void Should_substract_two_numbers_and_return_result() {
		// Implement
		assertEquals(1, calculator.sub(2, 1));
		assertEquals(0, calculator.sub(0, 0));
		assertEquals(3, calculator.sub(2, -1));
	}

	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		// Implement
		assertEquals(0, calculator.multiply(0, 23424));
		assertEquals(0, calculator.multiply(32543, 0));
		assertEquals(1, calculator.multiply(-1, -1));
		assertEquals(-1, calculator.multiply(1, -1));
	}

	@Test
	public void Should_divide_two_numbers_and_return_result() {
		// Implement
		assertEquals(3, calculator.divide(15, 5));
		assertEquals(0.75, calculator.divide(3, 4));
		assertEquals(1, calculator.divide(12345678, 12345678));
	}

	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		// Implement
		ArrayIndexOutOfBoundsException thrown = assertThrows(ArrayIndexOutOfBoundsException.class,
				() -> calculator.divide(15, 0), "Expected doThing() to throw, but it didn't");

		assertTrue(thrown.getMessage().equals("ZeroDivisionError"));
	}
}
