/**
 * 
 */
package org.glytch.kingmaker.Kingmaker;

import org.glytch.kingmaker.model.City;
import org.glytch.kingmaker.model.Hex;
import org.glytch.kingmaker.model.Square;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class HexTestCase.
 */
public class HexTestCase {

	private Hex hex;

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		hex = new Hex(new Square('A', 1));
	}

	/**
	 * Test constructor1.
	 */
	@Test
	public void testConstructor1() {
		hex = new Hex(new Square('A', 1));
		Assert.assertTrue(hex != null);
	}

	/**
	 * Test constructor2.
	 */
	@Test
	public void testConstructor2() {
		hex = new Hex(new Square('A', 1), "My hex", true);
		Assert.assertTrue(hex.isHasRiver() && hex.getName().equals("My hex"));
	}

	/**
	 * Test square.
	 */
	@Test
	public void testSquare() {
		hex.setSquare(new Square('B', 1));
		Assert.assertTrue(hex.getSquare().getLetter() == 'B');
	}

	/**
	 * Test city.
	 */
	@Test
	public void testCity() {
		hex.setCity(new City("My city"));
		Assert.assertTrue(hex.getCity().getName().equals("My city"));
	}

	/**
	 * Test claimed.
	 */
	@Test
	public void testClaimed() {
		hex.setClaimed(true);
		Assert.assertTrue(hex.isClaimed());
	}

	/**
	 * Test cleaned.
	 */
	@Test
	public void testCleaned() {
		hex.setCleaned(true);
		Assert.assertTrue(hex.isCleaned());
	}

	/**
	 * Test explored.
	 */
	@Test
	public void testExplored() {
		hex.setExplored(true);
		Assert.assertTrue(hex.isExplored());
	}

	/**
	 * Test has river.
	 */
	@Test
	public void testHasRiver() {
		hex.setHasRiver(true);
		Assert.assertTrue(hex.isHasRiver());
	}

	/**
	 * Test has road.
	 */
	@Test
	public void testHasRoad() {
		hex.setHasRoad(true);
		Assert.assertTrue(hex.isHasRoad());
	}

	/**
	 * Test has farm.
	 */
	@Test
	public void testHasFarm() {
		hex.setHasFarm(true);
		Assert.assertTrue(hex.isHasFarm());
	}
}
