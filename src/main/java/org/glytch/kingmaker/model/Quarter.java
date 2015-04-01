package org.glytch.kingmaker.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * The Class Quarter.
 */
@Data
public class Quarter {

	private String name = "";
	private List<Building> buildings;

	/**
	 * Instantiates a new quarter.
	 */
	public Quarter() {
		buildings = new ArrayList<Building>();
	}

	/**
	 * Instantiates a new quarter.
	 *
	 * @param name the name
	 */
	public Quarter(String name) {
		this.name = name;
		buildings = new ArrayList<Building>();
	}

	/**
	 * Instantiates a new quarter.
	 *
	 * @param name the name
	 * @param buildings the buildings
	 */
	public Quarter(String name, List<Building> buildings) {
		this.name = name;
		this.buildings = buildings;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return name;
	}
}
