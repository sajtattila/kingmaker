/**
 * 
 */
package org.glytch.kingmaker.model;

import java.util.HashMap;
import java.util.Map;

import org.glytch.kingmaker.model.util.KingdomAttributes;
import org.glytch.kingmaker.model.util.LeadershipRoles;

/**
 * The Class Leader.
 */
public class Leader {

	private String name;
	private LeadershipRoles role;
	private Map<KingdomAttributes, Integer> attributes;
	private int STR;
	private int DEX;
	private int CON;
	private int INT;
	private int WIS;
	private int CHA;

	/**
	 * Instantiates a new leader.
	 *
	 * @param name the name
	 * @param role the role
	 * @param sTR the s tr
	 * @param dEX the d ex
	 * @param cON the c on
	 * @param iNT the i nt
	 * @param wIS the w is
	 * @param cHA the c ha
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

		attributes = new HashMap<KingdomAttributes, Integer>();
		for (KingdomAttributes attribute : KingdomAttributes.values()) {
			attributes.put(attribute, 0);
		}
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
	 * Gets the str.
	 *
	 * @return the str
	 */
	public int getSTR() {
		return STR;
	}

	/**
	 * Gets the bonus str.
	 *
	 * @return the bonus str
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
	 * Sets the str.
	 *
	 * @param sTR the new str
	 */
	public void setSTR(int sTR) {
		STR = sTR;
		if (STR < 0)
			STR = 0;
	}

	/**
	 * Gets the dex.
	 *
	 * @return the dex
	 */
	public int getDEX() {
		return DEX;
	}

	/**
	 * Gets the bonus dex.
	 *
	 * @return the bonus dex
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
	 * Sets the dex.
	 *
	 * @param dEX the new dex
	 */
	public void setDEX(int dEX) {
		DEX = dEX;
		if (DEX < 0)
			DEX = 0;
	}

	/**
	 * Gets the con.
	 *
	 * @return the con
	 */
	public int getCON() {
		return CON;
	}

	/**
	 * Gets the bonus con.
	 *
	 * @return the bonus con
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
	 * Sets the con.
	 *
	 * @param cON the new con
	 */
	public void setCON(int cON) {
		CON = cON;
		if (CON < 0)
			CON = 0;
	}

	/**
	 * Gets the int.
	 *
	 * @return the int
	 */
	public int getINT() {
		return INT;
	}

	/**
	 * Gets the bonus int.
	 *
	 * @return the bonus int
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
	 * Sets the int.
	 *
	 * @param iNT the new int
	 */
	public void setINT(int iNT) {
		INT = iNT;
		if (INT < 0)
			INT = 0;
	}

	/**
	 * Gets the wis.
	 *
	 * @return the wis
	 */
	public int getWIS() {
		return WIS;
	}

	/**
	 * Gets the bonus wis.
	 *
	 * @return the bonus wis
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
	 * Sets the wis.
	 *
	 * @param wIS the new wis
	 */
	public void setWIS(int wIS) {
		WIS = wIS;
		if (WIS < 0)
			WIS = 0;
	}

	/**
	 * Gets the cha.
	 *
	 * @return the cha
	 */
	public int getCHA() {
		return CHA;
	}

	/**
	 * Gets the bonus cha.
	 *
	 * @return the bonus cha
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
	 * Sets the cha.
	 *
	 * @param cHA the new cha
	 */
	public void setCHA(int cHA) {
		CHA = cHA;
		if (CHA < 0)
			CHA = 0;
	}

	/**
	 * Gets the role.
	 *
	 * @return the role
	 */
	public LeadershipRoles getRole() {
		return role;
	}

	/**
	 * Sets the role.
	 *
	 * @param role the new role
	 */
	public void setRole(LeadershipRoles role) {
		this.role = role;
	}

	/**
	 * Gets the attributes.
	 *
	 * @return the attributes
	 */
	public Map<KingdomAttributes, Integer> getAttributes() {
		return attributes;
	}

	/**
	 * Adds the attribute to attributes.
	 *
	 * @param attribute the attribute to add
	 * @param bonus the bonus stats to add
	 */
	public void addAttribute(KingdomAttributes attribute, Integer bonus) {
		attributes.put(attribute, bonus);
	}

	/**
	 * Sets the attributes.
	 *
	 * @param attributes the new attributes
	 */
	public void setAttributes(Map<KingdomAttributes, Integer> attributes) {
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
