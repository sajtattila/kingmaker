package org.glytch.kingmaker.Kingmaker;

import org.glytch.kingmaker.model.Kingdom;
import org.glytch.kingmaker.model.Leader;
import org.glytch.kingmaker.model.util.Alignment;
import org.glytch.kingmaker.model.util.LeadershipRoles;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class KingdomTestCase.
 */
public class KingdomTestCase {

	/** The kingdom. */
	private Kingdom kingdom;
	private Kingdom kingdom2;

	/**
	 * Inits the.
	 */
	@Before
	public void init() {
		kingdom = new Kingdom("My Kingdom");
		kingdom2 = new Kingdom("My second kingdom");
		kingdom2.setAlignment(Alignment.LAWFUL_GOOD);
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
	 * Test leader warden.
	 */
	@Test
	public void testLeaderWarden() {
		kingdom.setLeader(LeadershipRoles.Warden, new Leader("Hayato",
				LeadershipRoles.Warden, -5, 1500, 1, 3, 5, 0));
	}

	/**
	 * Test leader viceroy.
	 */
	@Test
	public void testLeaderViceroy() {
		kingdom.setLeader(LeadershipRoles.Viceroy, new Leader("Mérisiel",
				LeadershipRoles.Viceroy, 18, 17, 16, 15, 14, 13));
	}

	/**
	 * Test leader treasurer.
	 */
	@Test
	public void testLeaderTreasurer() {
		kingdom.setLeader(LeadershipRoles.Treasurer, new Leader("Harsk",
				LeadershipRoles.Treasurer, 3, 2, 1, 0, -1, -2));
	}

	/**
	 * Test leader spy master.
	 */
	@Test
	public void testLeaderSpyMaster() {
		kingdom.setLeader(LeadershipRoles.Spymaster, new Leader("Kyra",
				LeadershipRoles.Spymaster, 9, 8, 7, 6, 5, 0));
	}

	/**
	 * Test leader royal enforcer.
	 */
	@Test
	public void testLeaderRoyalEnforcer() {
		kingdom.setLeader(LeadershipRoles.Royal_Enforcer, new Leader(
				"Lyrianne", LeadershipRoles.Royal_Enforcer, 9, 8, 7, 18, 17, 1));
	}

	/**
	 * Test leader marshal.
	 */
	@Test
	public void testLeaderMarshal() {
		kingdom.setLeader(LeadershipRoles.Marshal, new Leader("Seelah",
				LeadershipRoles.Marshal, 10, 9, 8, 7, 18, 2));
	}

	/**
	 * Test leader magister.
	 */
	public void testLeaderMagister() {
		kingdom.setLeader(LeadershipRoles.Magister, new Leader("Reiko",
				LeadershipRoles.Magister, 11, 10, 9, 8, 7, 3));
	}

	/**
	 * Test leader high priest.
	 */
	@Test
	public void testLeaderHighPriest() {
		kingdom.setLeader(LeadershipRoles.High_Priest, new Leader("Sajan",
				LeadershipRoles.High_Priest, 12, 11, 10, 9, 8, 4));
	}

	/**
	 * Test leader heir.
	 */
	public void testLeaderHeir() {
		kingdom.setLeader(LeadershipRoles.Heir, new Leader("Ezren",
				LeadershipRoles.Heir, 13, 12, 11, 10, 9, 5));
	}

	/**
	 * Test leader grand diplomat.
	 */
	@Test
	public void testLeaderGrandDiplomat() {
		kingdom.setLeader(LeadershipRoles.Grand_Diplomat, new Leader("Valéros",
				LeadershipRoles.Grand_Diplomat, 14, 13, 12, 11, 10, 6));
	}

	/**
	 * Test leader general.
	 */
	@Test
	public void testLeaderGeneral() {
		kingdom.setLeader(LeadershipRoles.General, new Leader("Séoni",
				LeadershipRoles.General, 15, 13, 12, 11, 10, 7));
	}

	/**
	 * Test leader councilor.
	 */
	@Test
	public void testLeaderCouncilor() {
		kingdom.setLeader(LeadershipRoles.Councilor, new Leader("Lini",
				LeadershipRoles.Councilor, 16, 15, 13, 12, 11, 8));
	}

	/**
	 * Test leader consort.
	 */
	@Test
	public void testLeaderConsort() {
		kingdom.setLeader(LeadershipRoles.Consort, new Leader("Lem",
				LeadershipRoles.Consort, 17, 16, 15, 14, 13, 9));
	}

	/**
	 * Test leader ruler.
	 */
	@Test
	public void testLeaderRuler() {
		kingdom.setLeader(LeadershipRoles.Ruler, new Leader("Amiri",
				LeadershipRoles.Ruler, 18, 17, 16, 15, 14, 10));
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

	@Test
	public void testAddStability() {
		kingdom2.addStability(5);
		Assert.assertTrue(kingdom2.getStability() == 5);
	}

	@Test
	public void testAddEconomy() {
		kingdom2.addEconomy(10);
		Assert.assertTrue(kingdom2.getEconomy() == 12);
	}

	@Test
	public void testAddLoyalty() {
		kingdom2.addLoyalty(7);
		Assert.assertTrue(kingdom2.getLoyalty() == 9);
	}

	@Test
	public void testAddPopulation() {
		kingdom2.addPopulation(5000);
		Assert.assertTrue(kingdom2.getPopulation() == 5000);
	}

	@Test
	public void testAddConsumption() {
		kingdom2.setConsumption(5);
		Assert.assertTrue(kingdom2.getConsumption() == 5);
	}

	@Test
	public void testTreasury() {
		kingdom2.addTreasury(10000);
		kingdom2.addTreasury(-5000);
		Assert.assertTrue(kingdom2.getTreasury() == 5000);
	}

	@Test
	public void testTurn() {
		int turn = 0;
		for (int i = 0; i < 20; i++) {
			kingdom2.addTurn();
			turn++;
		}
		Assert.assertTrue(kingdom2.getTurn() == turn);
	}

	@Test
	public void testAddUnrest() {
		kingdom2.addUnrest(10);
		Assert.assertTrue(kingdom2.getUnrest() == 10);
	}

	@Test
	public void testAddUnrestNegativeValue() {
		kingdom2.addUnrest(10);
		kingdom2.addUnrest(-20);
		Assert.assertTrue(kingdom2.getUnrest() == 0);
	}

	@Test
	public void testAddUnrestSoAnarchy() {
		kingdom2.addUnrest(21);
		Assert.assertTrue(kingdom2.isAnarchy());
		kingdom2.addUnrest(-50);
		kingdom2.setAnarchy(false);
	}

	@Test
	public void testAddSize() {
		kingdom2.addSize(10);
		Assert.assertTrue(kingdom2.getSize() == 11);
		kingdom.addSize(-10);
	}

	@Test
	public void testAddSizeToAugmentControlDC() {
		kingdom2.addSize(10);
		Assert.assertTrue(kingdom2.getControlDC() == 31);
		kingdom.addSize(-10);
	}

	@Test
	public void testControlDC() {
		kingdom2.setControlDC(10);
		Assert.assertTrue(kingdom2.getControlDC() == 10);
		kingdom2.setControlDC(21);
	}
}
