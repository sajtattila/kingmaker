package org.glytch.kingmaker.model;

/**
 * The Class Building.
 */
public class Building {

	private String name;
	private String message;
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
	 * @param message the message
	 * @param buildPoints the build points
	 * @param loyalty the loyalty
	 * @param stability the stability
	 * @param unrest the unrest
	 * @param economy the economy
	 * @param gpIncrease the gp increase
	 * @param defense the defense
	 * @param minorItems the minor items
	 * @param mediumItems the medium items
	 * @param majorItems the major items
	 * @param onlyOnePerCity the only one per city
	 */
	public Building(String name, String message, int buildPoints, int loyalty,
			int stability, int unrest, int economy, int gpIncrease,
			int defense, int minorItems, int mediumItems, int majorItems,
			boolean onlyOnePerCity) {
		this.name = name;
		this.message = message;
		this.buildPoints = buildPoints;
		this.loyalty = loyalty;
		this.stability = stability;
		this.unrest = unrest;
		this.economy = economy;
		this.gpIncrease = gpIncrease;
		this.defense = defense;
		this.minorItems = minorItems;
		this.mediumItems = mediumItems;
		this.majorItems = majorItems;
		this.onlyOnePerCity = onlyOnePerCity;
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
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Gets the builds the points.
	 *
	 * @return the builds the points
	 */
	public int getBuildPoints() {
		return buildPoints;
	}

	/**
	 * Sets the builds the points.
	 *
	 * @param buildPoints the new builds the points
	 */
	public void setBuildPoints(int buildPoints) {
		this.buildPoints = buildPoints;
	}

	/**
	 * Gets the loyalty.
	 *
	 * @return the loyalty
	 */
	public int getLoyalty() {
		return loyalty;
	}

	/**
	 * Sets the loyalty.
	 *
	 * @param loyalty the new loyalty
	 */
	public void setLoyalty(int loyalty) {
		this.loyalty = loyalty;
	}

	/**
	 * Gets the stability.
	 *
	 * @return the stability
	 */
	public int getStability() {
		return stability;
	}

	/**
	 * Sets the stability.
	 *
	 * @param stability the new stability
	 */
	public void setStability(int stability) {
		this.stability = stability;
	}

	/**
	 * Gets the unrest.
	 *
	 * @return the unrest
	 */
	public int getUnrest() {
		return unrest;
	}

	/**
	 * Sets the unrest.
	 *
	 * @param unrest the new unrest
	 */
	public void setUnrest(int unrest) {
		this.unrest = unrest;
	}

	/**
	 * Gets the economy.
	 *
	 * @return the economy
	 */
	public int getEconomy() {
		return economy;
	}

	/**
	 * Sets the economy.
	 *
	 * @param economy the new economy
	 */
	public void setEconomy(int economy) {
		this.economy = economy;
	}

	/**
	 * Gets the gp increase.
	 *
	 * @return the gp increase
	 */
	public int getGpIncrease() {
		return gpIncrease;
	}

	/**
	 * Sets the gp increase.
	 *
	 * @param gpIncrease the new gp increase
	 */
	public void setGpIncrease(int gpIncrease) {
		this.gpIncrease = gpIncrease;
	}

	/**
	 * Gets the defense.
	 *
	 * @return the defense
	 */
	public int getDefense() {
		return defense;
	}

	/**
	 * Sets the defense.
	 *
	 * @param defense the new defense
	 */
	public void setDefense(int defense) {
		this.defense = defense;
	}

	/**
	 * Gets the minor items.
	 *
	 * @return the minor items
	 */
	public int getMinorItems() {
		return minorItems;
	}

	/**
	 * Sets the minor items.
	 *
	 * @param minorItems the new minor items
	 */
	public void setMinorItems(int minorItems) {
		this.minorItems = minorItems;
	}

	/**
	 * Gets the medium items.
	 *
	 * @return the medium items
	 */
	public int getMediumItems() {
		return mediumItems;
	}

	/**
	 * Sets the medium items.
	 *
	 * @param mediumItems the new medium items
	 */
	public void setMediumItems(int mediumItems) {
		this.mediumItems = mediumItems;
	}

	/**
	 * Gets the major items.
	 *
	 * @return the major items
	 */
	public int getMajorItems() {
		return majorItems;
	}

	/**
	 * Sets the major items.
	 *
	 * @param majorItems the new major items
	 */
	public void setMajorItems(int majorItems) {
		this.majorItems = majorItems;
	}

	/**
	 * Checks if is only one per city.
	 *
	 * @return true, if is only one per city
	 */
	public boolean isOnlyOnePerCity() {
		return onlyOnePerCity;
	}

	/**
	 * Sets the only one per city.
	 *
	 * @param onlyOnePerCity the new only one per city
	 */
	public void setOnlyOnePerCity(boolean onlyOnePerCity) {
		this.onlyOnePerCity = onlyOnePerCity;
	}
}
