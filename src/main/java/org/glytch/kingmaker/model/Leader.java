/**
 * 
 */
package org.glytch.kingmaker.model;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;

import org.glytch.kingmaker.model.enums.KingdomAttributes;
import org.glytch.kingmaker.model.enums.LeadershipRoles;

/**
 * The Class Leader.
 */
@Data
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
	 * Adds the attribute.
	 *
	 * @param attribute the attribute
	 * @param bonus the bonus
	 */
	public void addAttribute(KingdomAttributes attribute, Integer bonus) {
		attributes.put(attribute, bonus);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
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
