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
	private int numberDiceRoll;

	/**
	 * Inits the.
	 */
	@Before
	public void init() {
		numberDiceRoll = 100000;
	}

	/**
	 * Test dice100.
	 */
	@Test
	public void testDice100() {
		int roll;
		boolean ok = true;
		for (int i = 0; i < numberDiceRoll; i++) {
			roll = Dice.dice100();
			if (roll < 1 || roll > 100) {
				ok = false;
			}
		}
		Assert.assertTrue(ok);
	}

	/**
	 * Test dice20.
	 */
	@Test
	public void testDice20() {
		int roll;
		boolean ok = true;
		for (int i = 0; i < numberDiceRoll; i++) {
			roll = Dice.dice20();
			if (roll < 1 || roll > 20) {
				ok = false;
			}
		}
		Assert.assertTrue(ok);
	}

	/**
	 * Test dice12.
	 */
	@Test
	public void testDice12() {
		int roll;
		boolean ok = true;
		for (int i = 0; i < numberDiceRoll; i++) {
			roll = Dice.dice12();
			if (roll < 1 || roll > 12) {
				ok = false;
			}
		}
		Assert.assertTrue(ok);
	}

	/**
	 * Test dice10.
	 */
	@Test
	public void testDice10() {
		int roll;
		boolean ok = true;
		for (int i = 0; i < numberDiceRoll; i++) {
			roll = Dice.dice10();
			if (roll < 1 || roll > 10) {
				ok = false;
			}
		}
		Assert.assertTrue(ok);
	}

	/**
	 * Test dice8.
	 */
	@Test
	public void testDice8() {
		int roll;
		boolean ok = true;
		for (int i = 0; i < numberDiceRoll; i++) {
			roll = Dice.dice8();
			if (roll < 1 || roll > 8) {
				ok = false;
			}
		}
		Assert.assertTrue(ok);
	}

	/**
	 * Test dice6.
	 */
	@Test
	public void testDice6() {
		int roll;
		boolean ok = true;
		for (int i = 0; i < numberDiceRoll; i++) {
			roll = Dice.dice6();
			if (roll < 1 || roll > 6) {
				ok = false;
			}
		}
		Assert.assertTrue(ok);
	}

	/**
	 * Test dice4.
	 */
	@Test
	public void testDice4() {
		int roll;
		boolean ok = true;
		for (int i = 0; i < numberDiceRoll; i++) {
			roll = Dice.dice4();
			if (roll < 1 || roll > 4) {
				ok = false;
			}
		}
		Assert.assertTrue(ok);
	}

	/**
	 * Test dice3.
	 */
	@Test
	public void testDice3() {
		int roll;
		boolean ok = true;
		for (int i = 0; i < numberDiceRoll; i++) {
			roll = Dice.dice3();
			if (roll < 1 || roll > 3) {
				ok = false;
			}
		}
		Assert.assertTrue(ok);
	}

	/**
	 * Test dice2.
	 */
	@Test
	public void testDice2() {
		int roll;
		boolean ok = true;
		for (int i = 0; i < numberDiceRoll; i++) {
			roll = Dice.dice2();
			if (roll < 1 || roll > 2) {
				ok = false;
			}
		}
		Assert.assertTrue(ok);
	}

}
