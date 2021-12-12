package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.Calendar;

class TestCalendar {

	@ParameterizedTest
	@ValueSource(ints = { 2020, 2000, 2008 })
	public void Should_return_true(int year) {
		// Implement
		assertTrue(new Calendar(year).isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = { 2001, 2005, 2100, 2200, 2010 })
	public void Should_return_false(int year) {
		// Implement
		assertFalse(new Calendar(year).isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = { 2020, 2000, 2008, 2001, 2005, 2100, 2200, 2010 })
	public void Should_return_if_year_is_leap(int year) {
		// Implement
		new Calendar(year).isLeapYear();
	}

	// Create a new method for boundary testing
	@Test
	public void Check_For_Bullshit() {
		assertFalse(new Calendar(-10).isLeapYear());
		assertFalse(new Calendar(2020 / 3).isLeapYear());
		assertTrue(new Calendar(17 / 4).isLeapYear());
	}
}
