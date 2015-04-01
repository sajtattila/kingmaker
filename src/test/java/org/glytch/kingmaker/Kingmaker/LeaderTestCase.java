package org.glytch.kingmaker.Kingmaker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.glytch.kingmaker.model.Leader;
import org.glytch.kingmaker.model.enums.KingdomAttributes;
import org.glytch.kingmaker.model.enums.LeadershipRoles;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class LeaderTestCase.
 */
public class LeaderTestCase {

	private List<Leader> leaders;
	private Leader amiri;

	/**
	 * Inits the.
	 */
	@Before
	public void init() {
		leaders = new ArrayList<Leader>();
		amiri = new Leader("", null, 0, 0, 0, 0, 0, 0);
	}

	/**
	 * Test new leaders.
	 */
	@Test
	public void testNewLeaders() {
		leaders.add(new Leader("Amiri", null, 18, 17, 16, 15, 14, 10));
		leaders.add(new Leader("Lem", null, 17, 16, 15, 14, 13, 9));
		leaders.add(new Leader("Lini", null, 16, 15, 13, 12, 11, 8));
		leaders.add(new Leader("Séoni", null, 15, 13, 12, 11, 10, 7));
		leaders.add(new Leader("Valéros", null, 14, 13, 12, 11, 10, 6));
		leaders.add(new Leader("Ezren", null, 13, 12, 11, 10, 9, 5));
		leaders.add(new Leader("Sajan", null, 12, 11, 10, 9, 8, 4));
		leaders.add(new Leader("Reiko", null, 11, 10, 9, 8, 7, 3));
		leaders.add(new Leader("Seelah", null, 10, 9, 8, 7, 18, 2));
		leaders.add(new Leader("Lyrianne", null, 9, 8, 7, 18, 17, 1));
		leaders.add(new Leader("Kyra", null, 9, 8, 7, 6, 5, 0));
		leaders.add(new Leader("Harsk", null, 3, 2, 1, 0, -1, -2));
		leaders.add(new Leader("Mérisiel", null, 18, 17, 16, 15, 14, 13));
		leaders.add(new Leader("Hayato", null, -5, 1500, -1500, 3, 5, 0));

		Assert.assertFalse(leaders.isEmpty());
	}

	/**
	 * Test kingdom attributes.
	 */
	@Test
	public void testKingdomAttributes() {
		Map<KingdomAttributes, Integer> attributes = new HashMap<KingdomAttributes, Integer>();
		attributes.put(KingdomAttributes.Economy, amiri.getBonusCHA());
		amiri.setAttributes(attributes);
		Assert.assertTrue(amiri.getAttributes().equals(attributes)
				&& amiri.getAttributes().get(KingdomAttributes.Economy) == amiri
						.getBonusCHA());

	}

	/**
	 * Test name.
	 */
	@Test
	public void testName() {
		amiri.setName("Amiri");
		Assert.assertTrue(amiri.getName().equals("Amiri"));
	}

	/**
	 * Test str.
	 */
	@Test
	public void testSTR() {
		amiri.setSTR(18);
		Assert.assertTrue(amiri.getSTR() == 18 && amiri.getBonusSTR() == 4);
	}

	/**
	 * Test dex.
	 */
	@Test
	public void testDEX() {
		amiri.setDEX(21);
		Assert.assertTrue(amiri.getDEX() == 21 && amiri.getBonusDEX() == 5);
	}

	/**
	 * Test con.
	 */
	@Test
	public void testCON() {
		amiri.setCON(16);
		Assert.assertTrue(amiri.getCON() == 16 && amiri.getBonusCON() == 3);
	}

	/**
	 * Test int.
	 */
	@Test
	public void testINT() {
		amiri.setINT(15);
		Assert.assertTrue(amiri.getINT() == 15 && amiri.getBonusINT() == 2);
	}

	/**
	 * Test wis.
	 */
	@Test
	public void testWIS() {
		amiri.setWIS(12);
		Assert.assertTrue(amiri.getWIS() == 12 && amiri.getBonusWIS() == 1);
	}

	/**
	 * Test cha.
	 */
	@Test
	public void testCHA() {
		amiri.setCHA(10);
		Assert.assertTrue(amiri.getCHA() == 10 && amiri.getBonusCHA() == 0);
	}

	/**
	 * Test role.
	 */
	@Test
	public void testRole() {
		amiri.setRole(LeadershipRoles.Ruler);
		Assert.assertTrue(amiri.getRole().equals(LeadershipRoles.Ruler));
	}
}
