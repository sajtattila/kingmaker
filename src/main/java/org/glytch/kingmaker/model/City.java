package org.glytch.kingmaker.model;

import java.util.List;

/**
 * The Class City.
 */
public class City {

	private String name;
	private List<Quarter> quarters;

	/**
	 * Instantiates a new city.
	 *
	 * @param name the name
	 */
	public City(String name) {
		this.name = name;
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
	 * Gets the quarters.
	 *
	 * @return the quarters
	 */
	public List<Quarter> getQuarters() {
		return quarters;
	}

	/**
	 * Sets the quarters.
	 *
	 * @param quarters the new quarters
	 */
	public void setQuarters(List<Quarter> quarters) {
		this.quarters = quarters;
	}
}
