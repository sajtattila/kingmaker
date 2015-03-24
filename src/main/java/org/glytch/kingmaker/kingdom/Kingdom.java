/**
 * 
 */
package org.glytch.kingmaker.kingdom;

import java.util.HashMap;
import java.util.Map;

import org.glytch.kingmaker.util.Alignment;
import org.glytch.kingmaker.util.Dice;
import org.glytch.kingmaker.util.LeadershipRoles;

/**
 * The Class Kingdom.
 */
public class Kingdom {

	/** The name. */
	private String name;

	/** The alignment. */
	private Alignment alignment;

	/** The build points. */
	private int buildPoints = 0;

	/** The consumption. */
	private int consumption = 0;

	/** The control dc. */
	private int controlDC = 21;

	/** The economy. */
	private int economy = 0;

	/** The loyalty. */
	private int loyalty = 0;

	/** The stability. */
	private int stability = 0;

	/** The population. */
	private int population = 0;

	/** The size. */
	private int size = 1;

	/** The treasury. */
	private double treasury = 0.0;

	/** The turn. */
	private int turn = 0;

	/** The unrest. */
	private int unrest = 0;

	/** The anarchy. */
	private boolean anarchy = false;

	/** The leaders. */
	private Map<LeadershipRoles, Leader> leaders;

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
	 * Sets the leader.
	 *
	 * @param role the role
	 * @param leader the leader
	 */
	public void setLeader(LeadershipRoles role, Leader leader) {
		// if leader is already leading a role
		if (leaders.containsValue(leader)) {
			// remove the old leader at old role
			leaders.remove(leader.getRole());
			// removeBonusFromLeader(leader.getRoleToAddBonus(),
			// leader.getBonusToAddToRole());
		}
		// assigning new role to the leader
		leader.setRole(role);
		leaders.put(role, leader);

		// Update bonus score on loyalty, economy or stability
	}

	/**
	 * Economy test.
	 *
	 * @return true, if successful
	 */
	public boolean economyTest() {
		int dice = Dice.dice20();
		if (anarchy)
			return false;
		if (dice == 20 || dice + economy >= controlDC) {
			return true;
		} else
			return false;
	}

	/**
	 * Loyalty test.
	 *
	 * @return true, if successful
	 */
	public boolean loyaltyTest() {
		int dice = Dice.dice20();
		if (anarchy)
			return false;
		if (dice == 20 || dice + loyalty >= controlDC) {
			return true;
		} else
			return false;
	}

	/**
	 * Stability test.
	 *
	 * @return true, if successful
	 */
	public boolean stabilityTest() {
		int dice = Dice.dice20();
		if (anarchy)
			return false;
		if (dice == 20 || dice + stability >= controlDC) {
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
	 * Adds the size.
	 *
	 * @param size the size
	 */
	public void addSize(int size) {
		this.size += size;
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
