/**
 * 
 */
package org.glytch.kingmaker.model;

import lombok.Data;

/**
 * The Class Hex.
 */
@Data
public class Hex {

	private Square square;
	private City city = null;
	private String name = null;
	private boolean claimed = false;
	private boolean cleaned = false;
	private boolean explored = false;
	private boolean hasRiver = false;
	private boolean hasRoad = false;
	private boolean hasFarm = false;

	/**
	 * Instantiates a new hex.
	 *
	 * @param square the square
	 */
	public Hex(Square square) {
		this.square = square;
	}

	/**
	 * Instantiates a new hex.
	 *
	 * @param square the square
	 * @param name the name
	 * @param hasRiver the has river
	 */
	public Hex(Square square, String name, boolean hasRiver) {
		this.square = square;
		this.name = name;
		this.hasRiver = hasRiver;
	}

	/**
	 * Checks for city.
	 *
	 * @return true, if successful
	 */
	public boolean hasCity() {
		return city != null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return square + " " + name;
	}
}
