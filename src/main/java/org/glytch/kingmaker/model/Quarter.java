package org.glytch.kingmaker.model;

import java.util.List;

/**
 * The Class Quarter.
 */
public class Quarter {

	private String name;
	private List<Building> buildings;

	/**
	 * Instantiates a new quarter.
	 *
	 * @param name the name
	 */
	public Quarter(String name) {
		this.setName(name);
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
	 * Gets the buildings.
	 *
	 * @return the buildings
	 */
	public List<Building> getBuildings() {
		return buildings;
	}

	/**
	 * Sets the buildings.
	 *
	 * @param buildings the new buildings
	 */
	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}
}
