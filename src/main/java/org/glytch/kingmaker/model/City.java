package org.glytch.kingmaker.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * The Class City.
 */
@Data
public class City {

	private String name;
	private List<Quarter> quarters = new ArrayList<Quarter>();

	/**
	 * Instantiates a new city.
	 *
	 * @param name the name
	 */
	public City(String name) {
		this.name = name;
	}

	/**
	 * Instantiates a new city.
	 *
	 * @param name the name
	 * @param quarters the quarters
	 */
	public City(String name, List<Quarter> quarters) {
		this.name = name;
		this.quarters = quarters;
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
