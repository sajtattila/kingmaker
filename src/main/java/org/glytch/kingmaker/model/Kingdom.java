/**
 * 
 */
package org.glytch.kingmaker.model;

import java.util.HashMap;
import java.util.Map;

import org.glytch.kingmaker.model.util.Alignment;
import org.glytch.kingmaker.model.util.Dice;
import org.glytch.kingmaker.model.util.KingdomAttributes;
import org.glytch.kingmaker.model.util.LeadershipRoles;
import org.glytch.kingmaker.model.util.Square;

/**
 * The Class Kingdom.
 */
public class Kingdom {

	private String name;
	private Alignment alignment;
	private int buildPoints = 0;
	private int consumption = 0;
	private int controlDC = 21;
	private int economy = 0;
	private int loyalty = 0;
	private int stability = 0;
	private int population = 0;
	private int size = 1;
	private double treasury = 0.0;
	private int turn = 0;
	private int unrest = 0;
	private boolean anarchy = false;
	private Map<LeadershipRoles, Leader> leaders;
	private Map<Square, Hex> hexes;

	/**
	 * Instantiates a new kingdom.
	 *
	 * @param name the name
	 */
	public Kingdom(String name) {
		this.name = name;
		leaders = new HashMap<LeadershipRoles, Leader>();
	}

	/**
	 * Remove a leader from the leaders Update bonus score on loyalty, economy
	 * or stability.
	 *
	 * @param leader the leader to remove
	 */
	public void removeLeader(Leader leader) {
		leaders.remove(leader.getRole());
		// Update bonus score on loyalty, economy or stability
		for (KingdomAttributes attribute : leader.getAttributes().keySet()) {
			switch (attribute) {
			case Economy:
				addEconomy(-leader.getAttributes().get(attribute));
				break;
			case Loyalty:
				addLoyalty(-leader.getAttributes().get(attribute));
				break;
			case Stability:
				addStability(-leader.getAttributes().get(attribute));
				break;
			default:
				break;
			}
		}
	}

	/**
	 * Add a leader to the leaders Update bonus score on loyalty, economy or
	 * stability.
	 *
	 * @param leader the leader to add
	 */
	public void addLeader(Leader leader) {
		leaders.put(leader.getRole(), leader);
		// Update bonus score on loyalty, economy or stability
		for (KingdomAttributes attribute : leader.getAttributes().keySet()) {
			switch (attribute) {
			case Economy:
				addEconomy(leader.getAttributes().get(attribute));
				break;
			case Loyalty:
				addLoyalty(leader.getAttributes().get(attribute));
				break;
			case Stability:
				addStability(leader.getAttributes().get(attribute));
				break;
			default:
				break;
			}
		}
	}

	/**
	 * Economy test under controlDC. Roll dice 20, a natural 1 is a fail, a
	 * natural 20 is a pass
	 *
	 * @return true, if successful
	 */
	public boolean economyTest() {
		int roll = Dice.roll(20);
		if (anarchy || roll == 1)
			return false;
		if (roll == 20 || roll + economy >= controlDC) {
			return true;
		} else
			return false;
	}

	/**
	 * Loyalty test under controlDC. Roll dice 20, a natural 1 is a fail, a
	 * natural 20 is a pass
	 *
	 * @return true, if successful
	 */
	public boolean loyaltyTest() {
		int roll = Dice.roll(20);
		if (anarchy || roll == 1)
			return false;
		if (roll == 20 || roll + loyalty >= controlDC) {
			return true;
		} else
			return false;
	}

	/**
	 * Stability test under controlDC. Roll dice 20, a natural 1 is a fail, a
	 * natural 20 is a pass
	 *
	 * @return true, if successful
	 */
	public boolean stabilityTest() {
		int roll = Dice.roll(20);
		if (anarchy || roll == 1)
			return false;
		if (roll == 20 || roll + stability >= controlDC) {
			return true;
		} else
			return false;
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
	 * Gets the alignment.
	 *
	 * @return the alignment
	 */
	public Alignment getAlignment() {
		return alignment;
	}

	/**
	 * Sets the alignment.
	 *
	 * @param alignment the new alignment
	 */
	public void setAlignment(Alignment alignment) {
		if (this.alignment != null) {
			switch (this.alignment) {
			case CHAOTIC_EVIL:
				economy -= 2;
				loyalty -= 2;
				break;
			case CHAOTIC_GOOD:
				loyalty -= 4;
				break;
			case CHAOTIC_NEUTRAL:
				stability -= 2;
				loyalty -= 2;
				break;
			case LAWFUL_EVIL:
				economy -= 4;
				break;
			case LAWFUL_GOOD:
				economy -= 2;
				loyalty -= 2;
				break;
			case LAWFUL_NEUTRAL:
				economy -= 2;
				stability -= 2;
				break;
			case NEUTRAL_EVIL:
				economy -= 2;
				stability -= 2;
				break;
			case NEUTRAL_GOOD:
				loyalty -= 2;
				stability -= 2;
				break;
			case NEUTRAL_NEUTRAL:
				stability -= 4;
				break;
			default:
				break;
			}
		}

		// set new alignment
		this.alignment = alignment;
		switch (this.alignment) {
		case CHAOTIC_EVIL:
			economy += 2;
			loyalty += 2;
			break;
		case CHAOTIC_GOOD:
			loyalty += 4;
			break;
		case CHAOTIC_NEUTRAL:
			stability += 2;
			loyalty += 2;
			break;
		case LAWFUL_EVIL:
			economy += 4;
			break;
		case LAWFUL_GOOD:
			economy += 2;
			loyalty += 2;
			break;
		case LAWFUL_NEUTRAL:
			economy += 2;
			stability += 2;
			break;
		case NEUTRAL_EVIL:
			economy += 2;
			stability += 2;
			break;
		case NEUTRAL_GOOD:
			loyalty += 2;
			stability += 2;
			break;
		case NEUTRAL_NEUTRAL:
			stability += 4;
			break;
		default:
			break;
		}
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
	 * Gets the consumption.
	 *
	 * @return the consumption
	 */
	public int getConsumption() {
		return consumption;
	}

	/**
	 * Sets the consumption.
	 *
	 * @param consumption the new consumption
	 */
	public void setConsumption(int consumption) {
		this.consumption = consumption;
	}

	/**
	 * Gets the control dc.
	 *
	 * @return the control dc
	 */
	public int getControlDC() {
		return controlDC;
	}

	/**
	 * Sets the control dc.
	 *
	 * @param controlDC the new control dc
	 */
	public void setControlDC(int controlDC) {
		this.controlDC = controlDC;
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
	 * Adds the economy.
	 *
	 * @param economy the economy
	 */
	public void addEconomy(int economy) {
		this.economy += economy;
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
	 * Adds the loyalty.
	 *
	 * @param loyalty the loyalty
	 */
	public void addLoyalty(int loyalty) {
		this.loyalty += loyalty;
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
	 * Adds the stability.
	 *
	 * @param stability the stability
	 */
	public void addStability(int stability) {
		this.stability += stability;
	}

	/**
	 * Gets the population.
	 *
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * Adds the population.
	 *
	 * @param population the population
	 */
	public void addPopulation(int population) {
		this.population += population;
	}

	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Adds the size. Augmenting size augments controlDC
	 *
	 * @param size the size
	 */
	public void addSize(int size) {
		this.size += size;
		controlDC += size;
	}

	/**
	 * Gets the treasury.
	 *
	 * @return the treasury
	 */
	public double getTreasury() {
		return treasury;
	}

	/**
	 * Adds the treasury.
	 *
	 * @param treasury the treasury
	 */
	public void addTreasury(double treasury) {
		this.treasury += treasury;
	}

	/**
	 * Gets the turn.
	 *
	 * @return the turn
	 */
	public int getTurn() {
		return turn;
	}

	/**
	 * Adds the turn.
	 */
	public void addTurn() {
		turn++;
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
	 * Adds the unrest.
	 *
	 * @param unrest the unrest
	 */
	public void addUnrest(int unrest) {
		this.unrest += unrest;
		if (this.unrest < 0)
			this.unrest = 0;
		if (this.unrest >= 20) {
			this.anarchy = true;
		}
	}

	/**
	 * Checks if is anarchy.
	 *
	 * @return true, if is anarchy
	 */
	public boolean isAnarchy() {
		return anarchy;
	}

	/**
	 * Sets the anarchy.
	 *
	 * @param anarchy the new anarchy
	 */
	public void setAnarchy(boolean anarchy) {
		this.anarchy = anarchy;
	}

	/**
	 * Gets the leaders.
	 *
	 * @return the leaders
	 */
	public Map<LeadershipRoles, Leader> getLeaders() {
		return leaders;
	}

	/**
	 * Gets the territories.
	 *
	 * @return the territories
	 */
	public Map<Square, Hex> getHexes() {
		return hexes;
	}

	/**
	 * Sets the territories.
	 *
	 * @param hexes the hexes
	 */
	public void setHexes(Map<Square, Hex> hexes) {
		this.hexes = hexes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(name + "\n");
		buffer.append("alignment " + alignment + "\n");
		buffer.append("build points " + buildPoints + "\n");
		buffer.append("consumption " + consumption + "\n");
		buffer.append("controlDC " + controlDC + "\n");
		buffer.append("economy " + economy + "\n");
		buffer.append("loyalty " + loyalty + "\n");
		buffer.append("stability " + stability + "\n");
		buffer.append("population " + population + "\n");
		buffer.append("size " + size + "\n");
		buffer.append("treasury " + treasury + "\n");
		buffer.append("turn " + turn + "\n");
		buffer.append("unrest " + unrest + "\n");
		buffer.append("anarchy " + anarchy + "\n");
		buffer.append("Leaders:\n");
		buffer.append(leaders);
		return buffer.toString();
	}
}
