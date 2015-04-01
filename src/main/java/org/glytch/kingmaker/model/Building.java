package org.glytch.kingmaker.model;

import lombok.Data;

/**
 * The Class Building.
 */
@Data
public class Building {

	private String name;
	private int buildPoints;
	private int loyalty;
	private int stability;
	private int unrest;
	private int economy;
	private int gpIncrease;
	private int defense;
	private int minorItems = 0;
	private int mediumItems = 0;
	private int majorItems = 0;
	private boolean onlyOnePerCity;

	/**
	 * Instantiates a new building.
	 *
	 * @param name the name
	 * @param buildPoints the build points
	 * @param loyalty the loyalty
	 * @param stability the stability
	 * @param economy the economy
	 */
	public Building(String name, int buildPoints, int loyalty, int stability,
			int economy) {
		this.name = name;
		this.buildPoints = buildPoints;
		this.loyalty = loyalty;
		this.stability = stability;
		this.economy = economy;
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
