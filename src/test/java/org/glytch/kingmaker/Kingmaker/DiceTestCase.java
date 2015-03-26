package org.glytch.kingmaker.Kingmaker;

import org.glytch.kingmaker.model.util.Dice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class DiceTestCase.
 */
public class DiceTestCase {

	/** The number dice roll. */
	private int numberOfRolls;

	/**
	 * Inits the.
	 */
	@Before
	public void init() {
		numberOfRolls = 1000;
	}

	/**
	 * Test dice1000.
	 */
	@Test
	public void testDice1000() {
		int roll;
		for (int i = 0; i < numberOfRolls * 1000; i++) {
			roll = Dice.roll(1000);
			Assert.assertFalse(roll < 1 || roll > 1000);
		}
	}

	/**
	 * Test dice100.
	 */
	@Test
	public void testDice100() {
		int roll;
		boolean ok = true;
		for (int i = 0; i < numberOfRolls * 100 && ok; i++) {
			roll = Dice.roll(100);
			Assert.assertFalse(roll < 1 || roll > 100);
		}
	}

	/**
	 * Test dice20.
	 */
	@Test
	public void testDice20() {
		int roll;
		boolean ok = true;
		for (int i = 0; i < numberOfRolls && ok; i++) {
			roll = Dice.roll(20);
			Assert.assertFalse(roll < 1 || roll > 20);
		}
	}

	/**
	 * Test dice12.
	 */
	@Test
	public void testDice12() {
		int roll;
		boolean ok = true;
		for (int i = 0; i < numberOfRolls && ok; i++) {
			roll = Dice.roll(12);
			Assert.assertFalse(roll < 1 || roll > 12);
		}
	}

	/**
	 * Test dice10.
	 */
	@Test
	public void testDice10() {
		int roll;
		boolean ok = true;
		for (int i = 0; i < numberOfRolls && ok; i++) {
			roll = Dice.roll(10);
			Assert.assertFalse(roll < 1 || roll > 10);
		}
	}

	/**
	 * Test dice8.
	 */
	@Test
	public void testDice8() {
		int roll;
		boolean ok = true;
		for (int i = 0; i < numberOfRolls && ok; i++) {
			roll = Dice.roll(8);
			Assert.assertFalse(roll < 1 || roll > 8);
		}
	}

	/**
	 * Test dice6.
	 */
	@Test
	public void testDice6() {
		int roll;
		boolean ok = true;
		for (int i = 0; i < numberOfRolls && ok; i++) {
			roll = Dice.roll(6);
			Assert.assertFalse(roll < 1 || roll > 6);
		}
	}

	/**
	 * Test dice4.
	 */
	@Test
	public void testDice4() {
		int roll;
		boolean ok = true;
		for (int i = 0; i < numberOfRolls && ok; i++) {
			roll = Dice.roll(4);
			Assert.assertFalse(roll < 1 || roll > 4);
		}
	}

	/**
	 * Test dice3.
	 */
	@Test
	public void testDice3() {
		int roll;
		boolean ok = true;
		for (int i = 0; i < numberOfRolls && ok; i++) {
			roll = Dice.roll(3);
			Assert.assertFalse(roll < 1 || roll > 3);
		}
	}

	/**
	 * Test dice2.
	 */
	@Test
	public void testDice2() {
		int roll;
		boolean ok = true;
		for (int i = 0; i < numberOfRolls && ok; i++) {
			roll = Dice.roll(2);
			Assert.assertFalse(roll < 1 || roll > 2);
		}
	}
}
