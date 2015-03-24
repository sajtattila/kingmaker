package org.glytch.kingmaker.kingdom;

import java.util.ArrayList;
import java.util.List;

import org.glytch.kingmaker.util.KingdomAttributes;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class LeaderTestDrive.
 */
public class LeaderTestCase {

	/** The leaders. */
	private List<Leader> leaders;

	/**
	 * Inits the.
	 */
	@Before
	public void init() {
		leaders = new ArrayList<Leader>();
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
	}

	/**
	 * Test kingdom attributes.
	 */
	@Test
	public void testKingdomAttributes() {
		Leader amiri = new Leader("Amiri", null, 18, 17, 16, 15, 14, 10);
		List<KingdomAttributes> attributes = new ArrayList<KingdomAttributes>();
		attributes.add(KingdomAttributes.Economy);
		amiri.setAttributes(attributes);
		Assert.assertTrue(amiri.getAttributes().equals(attributes));

	}

	/**
	 * Tear down.
	 */
	@After
	public void tearDown() {
		/*
		 * for (Leader leader : leaders) { System.out.println(leader);
		 * System.out.println("STR: " + leader.getSTR() + "(" +
		 * leader.getBonusSTR() + ")"); System.out.println("DEX: " +
		 * leader.getDEX() + "(" + leader.getBonusDEX() + ")");
		 * System.out.println("CON: " + leader.getCON() + "(" +
		 * leader.getBonusCON() + ")"); System.out.println("INT: " +
		 * leader.getINT() + "(" + leader.getBonusINT() + ")");
		 * System.out.println("WIS: " + leader.getWIS() + "(" +
		 * leader.getBonusWIS() + ")"); System.out.println("CHA: " +
		 * leader.getCHA() + "(" + leader.getBonusCHA() + ")"); }
		 */
	}
}
