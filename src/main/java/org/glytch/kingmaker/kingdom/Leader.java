/**
 * 
 */
package org.glytch.kingmaker.kingdom;

import java.util.List;

import org.glytch.kingmaker.util.KingdomAttributes;
import org.glytch.kingmaker.util.LeadershipRoles;

/**
 * The Class Leader.
 */
public class Leader {

	/** The name. */
	private String name;

	/** The leadership role. */
	private LeadershipRoles role;

	/** The Kingdom's attributes to set bonus on. */
	private List<KingdomAttributes> attributes;

	/** The strength. */
	private int STR;

	/** The dexterity. */
	private int DEX;

	/** The constitution. */
	private int CON;

	/** The intelligence. */
	private int INT;

	/** The wisdom. */
	private int WIS;

	/** The charisma. */
	private int CHA;

	/**
	 * Instantiates a new leader.
	 *
	 * @param name the name
	 * @param role the role
	 * @param sTR the strength
	 * @param dEX the dexterity
	 * @param cON the constitution
	 * @param iNT the intelligence
	 * @param wIS the wisdom
	 * @param cHA the charisma
	 */
	public Leader(String name, LeadershipRoles role, int sTR, int dEX, int cON,
			int iNT, int wIS, int cHA) {
		this.name = name;
		this.role = role;
		STR = sTR;
		DEX = dEX;
		CON = cON;
		INT = iNT;
		WIS = wIS;
		CHA = cHA;
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
	 * Gets the strength.
	 *
	 * @return the strength
	 */
	public int getSTR() {
		return STR;
	}

	/**
	 * Gets the bonus strength.
	 *
	 * @return the bonus strength
	 */
	public int getBonusSTR() {
		int bonus;
		if (STR >= 10 || STR % 2 == 0) {
			bonus = (STR - 10) / 2;
		} else {
			bonus = (STR - 10) / 2;
			bonus--;
		}
		return bonus;
	}

	/**
	 * Sets the strength.
	 *
	 * @param sTR the new strength
	 */
	public void setSTR(int sTR) {
		STR = sTR;
		if (STR < 0)
			STR = 0;
	}

	/**
	 * Gets the dexterity.
	 *
	 * @return the dexterity
	 */
	public int getDEX() {
		return DEX;
	}

	/**
	 * Gets the bonus dexterity.
	 *
	 * @return the bonus dexterity
	 */
	public int getBonusDEX() {
		int bonus;
		if (DEX >= 10 || DEX % 2 == 0) {
			bonus = (DEX - 10) / 2;
		} else {
			bonus = (DEX - 10) / 2;
			bonus--;
		}
		return bonus;
	}

	/**
	 * Sets the dexterity.
	 *
	 * @param dEX the new dexterity
	 */
	public void setDEX(int dEX) {
		DEX = dEX;
		if (DEX < 0)
			DEX = 0;
	}

	/**
	 * Gets the constitution.
	 *
	 * @return the constitution
	 */
	public int getCON() {
		return CON;
	}

	/**
	 * Gets the bonus constitution.
	 *
	 * @return the bonus constitution
	 */
	public int getBonusCON() {
		int bonus;
		if (CON >= 10 || CON % 2 == 0) {
			bonus = (CON - 10) / 2;
		} else {
			bonus = (CON - 10) / 2;
			bonus--;
		}
		return bonus;
	}

	/**
	 * Sets the constitution.
	 *
	 * @param cON the new constitution
	 */
	public void setCON(int cON) {
		CON = cON;
		if (CON < 0)
			CON = 0;
	}

	/**
	 * Gets the intelligence.
	 *
	 * @return the intelligence
	 */
	public int getINT() {
		return INT;
	}

	/**
	 * Gets the bonus intelligence.
	 *
	 * @return the bonus intelligence
	 */
	public int getBonusINT() {
		int bonus;
		if (INT >= 10 || INT % 2 == 0) {
			bonus = (INT - 10) / 2;
		} else {
			bonus = (INT - 10) / 2;
			bonus--;
		}
		return bonus;
	}

	/**
	 * Sets the intelligence.
	 *
	 * @param iNT the new intelligence
	 */
	public void setINT(int iNT) {
		INT = iNT;
		if (INT < 0)
			INT = 0;
	}

	/**
	 * Gets the wisdom.
	 *
	 * @return the wisdom
	 */
	public int getWIS() {
		return WIS;
	}

	/**
	 * Gets the bonus wisdom.
	 *
	 * @return the bonus wisdom
	 */
	public int getBonusWIS() {
		int bonus;
		if (WIS % 2 == 0 || WIS >= 10) {
			bonus = (WIS - 10) / 2;
		} else {
			bonus = (WIS - 10) / 2;
			bonus--;
		}
		return bonus;
	}

	/**
	 * Sets the wisdom.
	 *
	 * @param wIS the new wisdom
	 */
	public void setWIS(int wIS) {
		WIS = wIS;
		if (WIS < 0)
			WIS = 0;
	}

	/**
	 * Gets the charisma.
	 *
	 * @return the charisma
	 */
	public int getCHA() {
		return CHA;
	}

	/**
	 * Gets the bonus charisma.
	 *
	 * @return the bonus charisma
	 */
	public int getBonusCHA() {
		int bonus;
		if (CHA % 2 == 0 || CHA >= 10) {
			bonus = (CHA - 10) / 2;
		} else {
			bonus = (CHA - 10) / 2;
			bonus--;
		}
		return bonus;
	}

	/**
	 * Sets the charisma.
	 *
	 * @param cHA the new charisma
	 */
	public void setCHA(int cHA) {
		CHA = cHA;
		if (CHA < 0)
			CHA = 0;
	}

	/**
	 * Gets the leadership role.
	 *
	 * @return the leadership role
	 */
	public LeadershipRoles getRole() {
		return role;
	}

	/**
	 * Sets the leadership role.
	 *
	 * @param role the new leadership role
	 */
	public void setRole(LeadershipRoles role) {
		this.role = role;
	}

	/**
	 * Gets the kingdom attributes to set bonus on.
	 *
	 * @return the kingdom attributes to set bonus on
	 */
	public List<KingdomAttributes> getAttributes() {
		return attributes;
	}

	/**
	 * Sets the kingdom attributes to set bonus on.
	 *
	 * @param attributes the new kingdom attributes to set bonus on
	 */
	public void setAttributes(List<KingdomAttributes> attributes) {
		this.attributes = attributes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		/*
		 * StringBuffer buffer = new StringBuffer(); buffer.append(role + "(" +
		 * name + ")"); buffer.append(STR + " (" + getBonusSTR() + ") ");
		 * buffer.append(DEX + " (" + getBonusDEX() + ") "); buffer.append(CON +
		 * " (" + getBonusCON() + ") "); buffer.append(INT + " (" +
		 * getBonusINT() + ") "); buffer.append(WIS + " (" + getBonusWIS() +
		 * ") "); buffer.append(CHA + " (" + getBonusCHA() + ") "); return
		 * buffer.toString();
		 */
		return name;
	}
}
