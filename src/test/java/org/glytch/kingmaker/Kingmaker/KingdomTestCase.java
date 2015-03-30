package org.glytch.kingmaker.Kingmaker;

import java.util.HashMap;
import java.util.Map;

import org.glytch.kingmaker.model.Kingdom;
import org.glytch.kingmaker.model.Leader;
import org.glytch.kingmaker.model.util.Alignment;
import org.glytch.kingmaker.model.util.KingdomAttributes;
import org.glytch.kingmaker.model.util.LeadershipRoles;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class KingdomTestCase.
 */
public class KingdomTestCase {

	private Kingdom kingdom;

	/**
	 * Inits the.
	 */
	@Before
	public void init() {
		kingdom = new Kingdom("My Kingdom");
	}

	/**
	 * Test alignment chaotic evil.
	 */
	@Test
	public void testAlignmentChaoticEvil() {
		kingdom.setAlignment(Alignment.CHAOTIC_EVIL);
		Assert.assertTrue(kingdom.getEconomy() == 2
				&& kingdom.getLoyalty() == 2);
	}

	/**
	 * Test alignment neutral evil.
	 */
	@Test
	public void testAlignmentNeutralEvil() {
		kingdom.setAlignment(Alignment.NEUTRAL_EVIL);
		Assert.assertTrue(kingdom.getEconomy() == 2
				&& kingdom.getStability() == 2);
	}

	/**
	 * Test alignment lawful evil.
	 */
	@Test
	public void testAlignmentLawfulEvil() {
		kingdom.setAlignment(Alignment.LAWFUL_EVIL);
		Assert.assertTrue(kingdom.getEconomy() == 4);
	}

	/**
	 * Test alignment chaotic neutral.
	 */
	@Test
	public void testAlignmentChaoticNeutral() {
		kingdom.setAlignment(Alignment.CHAOTIC_NEUTRAL);
		Assert.assertTrue(kingdom.getStability() == 2
				&& kingdom.getLoyalty() == 2);
	}

	/**
	 * Test alignment neutral neutral.
	 */
	@Test
	public void testAlignmentNeutralNeutral() {
		kingdom.setAlignment(Alignment.NEUTRAL_NEUTRAL);
		Assert.assertTrue(kingdom.getStability() == 4);
	}

	/**
	 * Test alignment lawful neutral.
	 */
	@Test
	public void testAlignmentLawfulNeutral() {
		kingdom.setAlignment(Alignment.LAWFUL_NEUTRAL);
		Assert.assertTrue(kingdom.getEconomy() == 2
				&& kingdom.getStability() == 2);
	}

	/**
	 * Test alignment chaotic good.
	 */
	@Test
	public void testAlignmentChaoticGood() {
		kingdom.setAlignment(Alignment.CHAOTIC_GOOD);
		Assert.assertTrue(kingdom.getLoyalty() == 4);
	}

	/**
	 * Test alignment neutral good.
	 */
	@Test
	public void testAlignmentNeutralGood() {
		kingdom.setAlignment(Alignment.NEUTRAL_GOOD);
		Assert.assertTrue(kingdom.getStability() == 2
				&& kingdom.getLoyalty() == 2);
	}

	/**
	 * Test alignment lawful good.
	 */
	@Test
	public void testAlignmentLawfulGood() {
		kingdom.setAlignment(Alignment.LAWFUL_GOOD);
		Assert.assertTrue(kingdom.getEconomy() == 2
				&& kingdom.getLoyalty() == 2);
	}

	/**
	 * Test add leader.
	 */
	@Test
	public void testAddLeader() {
		Leader leader = new Leader("Hayato", LeadershipRoles.Warden, 10, 12,
				14, 15, 9, 18);
		Map<KingdomAttributes, Integer> attributes = new HashMap<KingdomAttributes, Integer>();
		attributes.put(KingdomAttributes.Economy, leader.getBonusCHA());
		leader.setAttributes(attributes);
		kingdom.addLeader(leader);
		Assert.assertTrue(kingdom.getEconomy() == 4);
	}

	/**
	 * Test remove leader.
	 */
	@Test
	public void testRemoveLeader() {
		Leader leader = new Leader("Hayato", LeadershipRoles.Warden, 10, 12,
				14, 15, 9, 18);
		Map<KingdomAttributes, Integer> attributes = new HashMap<KingdomAttributes, Integer>();
		attributes.put(KingdomAttributes.Economy, leader.getBonusCHA());
		leader.setAttributes(attributes);
		kingdom.addLeader(leader);
		kingdom.removeLeader(leader);
		Assert.assertTrue(kingdom.getEconomy() == 0);
	}

	/**
	 * Economy test.
	 */
	@Test
	public void economyTest() {
		int testSucceed = 0;
		for (int i = 0; i < 1000; i++) {
			if (kingdom.economyTest())
				testSucceed++;
		}
		Assert.assertTrue(testSucceed > 30 && testSucceed < 970);
	}

	/**
	 * Loyalty test.
	 */
	@Test
	public void loyaltyTest() {
		int testSucceed = 0;
		for (int i = 0; i < 1000; i++) {
			if (kingdom.loyaltyTest())
				testSucceed++;
		}
		Assert.assertTrue(testSucceed > 30 && testSucceed < 970);
	}

	/**
	 * Stability test.
	 */
	@Test
	public void stabilityTest() {
		int testSucceed = 0;
		for (int i = 0; i < 1000; i++) {
			if (kingdom.stabilityTest())
				testSucceed++;
		}
		Assert.assertTrue(testSucceed > 30 && testSucceed < 970);
	}

	/**
	 * Test add stability.
	 */
	@Test
	public void testAddStability() {
		kingdom.addStability(5);
		Assert.assertTrue(kingdom.getStability() == 5);
	}

	/**
	 * Test add economy.
	 */
	@Test
	public void testAddEconomy() {
		kingdom.addEconomy(10);
		Assert.assertTrue(kingdom.getEconomy() == 10);
	}

	/**
	 * Test add loyalty.
	 */
	@Test
	public void testAddLoyalty() {
		kingdom.addLoyalty(7);
		Assert.assertTrue(kingdom.getLoyalty() == 7);
	}

	/**
	 * Test add population.
	 */
	@Test
	public void testAddPopulation() {
		kingdom.addPopulation(5000);
		Assert.assertTrue(kingdom.getPopulation() == 5000);
	}

	/**
	 * Test add consumption.
	 */
	@Test
	public void testAddConsumption() {
		kingdom.setConsumption(5);
		Assert.assertTrue(kingdom.getConsumption() == 5);
	}

	/**
	 * Test treasury.
	 */
	@Test
	public void testTreasury() {
		kingdom.addTreasury(10000);
		kingdom.addTreasury(-5000);
		Assert.assertTrue(kingdom.getTreasury() == 5000);
	}

	/**
	 * Test turn.
	 */
	@Test
	public void testTurn() {
		int turn = 0;
		for (int i = 0; i < 20; i++) {
			kingdom.addTurn();
			turn++;
		}
		Assert.assertTrue(kingdom.getTurn() == turn);
	}

	/**
	 * Test add unrest.
	 */
	@Test
	public void testAddUnrest() {
		kingdom.addUnrest(10);
		Assert.assertTrue(kingdom.getUnrest() == 10);
	}

	/**
	 * Test add unrest negative value.
	 */
	@Test
	public void testAddUnrestNegativeValue() {
		kingdom.addUnrest(10);
		kingdom.addUnrest(-20);
		Assert.assertTrue(kingdom.getUnrest() == 0);
	}

	/**
	 * Test add unrest so anarchy.
	 */
	@Test
	public void testAddUnrestSoAnarchy() {
		kingdom.addUnrest(21);
		Assert.assertTrue(kingdom.isAnarchy());
	}

	/**
	 * Test add size.
	 */
	@Test
	public void testAddSize() {
		kingdom.addSize(10);
		Assert.assertTrue(kingdom.getSize() == 11);
	}

	/**
	 * Test add size to augment control dc.
	 */
	@Test
	public void testAddSizeToAugmentControlDC() {
		kingdom.addSize(10);
		Assert.assertTrue(kingdom.getControlDC() == 31);
	}

	/**
	 * Test control dc.
	 */
	@Test
	public void testControlDC() {
		kingdom.setControlDC(10);
		Assert.assertTrue(kingdom.getControlDC() == 10);
	}
}
