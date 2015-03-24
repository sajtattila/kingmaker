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
		Assert.assertTrue(testSucceed > 1);
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
		Assert.assertTrue(testSucceed > 1);
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
		Assert.assertTrue(testSucceed > 1);
	}
}
