package org.glytch.kingmaker.model;

/**
 * The Class Square.
 */
public class Square {

	private char letter;
	private int number;

	/**
	 * Instantiates a new square.
	 *
	 * @param letter the letter
	 * @param number the number
	 */
	public Square(char letter, int number) {
		this.letter = letter;
		this.number = number;
	}

	/**
	 * Gets the letter.
	 *
	 * @return the letter
	 */
	public char getLetter() {
		return letter;
	}

	/**
	 * Sets the letter.
	 *
	 * @param letter the new letter
	 */
	public void setLetter(char letter) {
		this.letter = letter;
	}

	/**
	 * Gets the number.
	 *
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * Sets the number.
	 *
	 * @param number the new number
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return letter + "" + number;
	}
}
