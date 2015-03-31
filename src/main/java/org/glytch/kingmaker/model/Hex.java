/**
 * 
 */
package org.glytch.kingmaker.model;


/**
 * The Class Hex.
 */
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
	 * Gets the square.
	 *
	 * @return the square
	 */
	public Square getSquare() {
		return square;
	}

	/**
	 * Sets the square.
	 *
	 * @param square the new square
	 */
	public void setSquare(Square square) {
		this.square = square;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public City getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(City city) {
		this.city = city;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Checks if is claimed.
	 *
	 * @return true, if is claimed
	 */
	public boolean isClaimed() {
		return claimed;
	}

	/**
	 * Sets the claimed.
	 *
	 * @param claimed the new claimed
	 */
	public void setClaimed(boolean claimed) {
		this.claimed = claimed;
	}

	/**
	 * Checks for river.
	 *
	 * @return true, if successful
	 */
	public boolean hasRiver() {
		return hasRiver;
	}

	/**
	 * Sets the checks for river.
	 *
	 * @param hasRiver the new checks for river
	 */
	public void setHasRiver(boolean hasRiver) {
		this.hasRiver = hasRiver;
	}

	/**
	 * Checks for road.
	 *
	 * @return true, if successful
	 */
	public boolean hasRoad() {
		return hasRoad;
	}

	/**
	 * Sets the checks for road.
	 *
	 * @param hasRoad the new checks for road
	 */
	public void setHasRoad(boolean hasRoad) {
		this.hasRoad = hasRoad;
	}

	/**
	 * Checks for farm.
	 *
	 * @return true, if successful
	 */
	public boolean hasFarm() {
		return hasFarm;
	}

	/**
	 * Checks for city.
	 *
	 * @return true, if successful
	 */
	public boolean hasCity() {
		if (city == null)
			return false;
		else
			return true;
	}

	/**
	 * Sets the checks for farm.
	 *
	 * @param hasFarm the new checks for farm
	 */
	public void setHasFarm(boolean hasFarm) {
		this.hasFarm = hasFarm;
	}

	/**
	 * Checks if is cleaned.
	 *
	 * @return the cleaned
	 */
	public boolean isCleaned() {
		return cleaned;
	}

	/**
	 * Sets the cleaned.
	 *
	 * @param cleaned the cleaned to set
	 */
	public void setCleaned(boolean cleaned) {
		this.cleaned = cleaned;
	}

	/**
	 * Checks if is explored.
	 *
	 * @return the explored
	 */
	public boolean isExplored() {
		return explored;
	}

	/**
	 * Sets the explored.
	 *
	 * @param explored the explored to set
	 */
	public void setExplored(boolean explored) {
		this.explored = explored;
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
