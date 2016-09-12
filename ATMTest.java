package edu.elon.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ATMTest {
	private ATM atm;

	@Before
	public void setUp() throws Exception {
		atm = new ATM();
	}

	@After
	public void tearDown() throws Exception {
		atm = null;
	}

	@Test
	public void testDeposit() {
		atm.deposit(10);
		int expected = (int) atm.getBalance();
		int actual = 10;
		assertEquals(expected, actual);
	}

	@Test
	public void testGetBalance() {
		int expected = (int) atm.getBalance();
		int actual = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void testToString() {
		String expected = "Amount balance is $0.00";
		String actual = atm.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testWithdraw() {
		atm.deposit(20);
		atm.withdraw(5);
		int expected = 15;
		int actual = (int) atm.getBalance();
		assertEquals(expected, actual);
	}

}
