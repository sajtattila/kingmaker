package org.glytch.kingmaker.model.util;

import java.util.Random;

/**
 * The Class Dice.
 */

/**
 * @author Matthieu 20 mars 2015
 */
public class Dice {

	private static Random rd = new Random();

	/**
	 * Roll.
	 *
	 * @param dice the dice
	 * @return the int
	 */
	public static int roll(int dice) {
		return rd.nextInt(dice) + 1;
	}
}
