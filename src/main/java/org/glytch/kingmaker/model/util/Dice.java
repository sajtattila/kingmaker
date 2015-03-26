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
	 * Roll a dice.
	 *
	 * @param dice The number of face of the dice to roll
	 * @return the roll result between 1 and dice
	 */
	public static int roll(int dice) {
		return rd.nextInt(dice) + 1;
	}
}
