package org.glytch.kingmaker.util;

import java.util.Random;

/**
 * The Class Dice.
 */

/**
 * @author Matthieu 20 mars 2015
 */
public class Dice {

	/** The rd. */
	private static Random rd = new Random();

	/**
	 * Dice2.
	 *
	 * @return the int
	 */
	public static int dice2() {
		return rd.nextInt(2) + 1;
	}

	/**
	 * Dice3.
	 *
	 * @return the int
	 */
	public static int dice3() {
		return rd.nextInt(3) + 1;
	}

	/**
	 * Dice4.
	 *
	 * @return the int
	 */
	public static int dice4() {
		return rd.nextInt(4) + 1;
	}

	/**
	 * Dice6.
	 *
	 * @return the int
	 */
	public static int dice6() {
		return rd.nextInt(6) + 1;
	}

	/**
	 * Dice8.
	 *
	 * @return the int
	 */
	public static int dice8() {
		return rd.nextInt(8) + 1;
	}

	/**
	 * Dice10.
	 *
	 * @return the int
	 */
	public static int dice10() {
		return rd.nextInt(10) + 1;
	}

	/**
	 * Dice12.
	 *
	 * @return the int
	 */
	public static int dice12() {
		return rd.nextInt(12) + 1;
	}

	/**
	 * Dice20.
	 *
	 * @return the int
	 */
	public static int dice20() {
		return rd.nextInt(20) + 1;
	}

	/**
	 * Dice100.
	 *
	 * @return the int
	 */
	public static int dice100() {
		return rd.nextInt(100) + 1;
	}

	/**
	 * Dice1000.
	 *
	 * @return the int
	 */
	public static int dice1000() {
		return rd.nextInt(1000) + 1;
	}
}
