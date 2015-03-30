/**
 * 
 */
package org.glytch.kingmaker.Kingmaker;

import org.glytch.kingmaker.model.City;
import org.glytch.kingmaker.model.Quarter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class CityTestCase.
 *
 * @author Matthieu
 */
public class CityTestCase {

	private City city;

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		city = new City("My city");
	}

	/**
	 * Test constructor.
	 */
	@Test
	public void testConstructor() {
		city = new City("My city");
		Assert.assertTrue(city != null);
	}

	/**
	 * Test name.
	 */
	@Test
	public void testName() {
		city.setName("City");
		Assert.assertTrue(city.getName().equals("City"));
	}

	/**
	 * Test quarter.
	 */
	@Test
	public void testQuarter() {
		city.getQuarters().add(new Quarter("My quarter"));
		Assert.assertTrue(city.getQuarters().get(0).getName()
				.equals("My quarter"));
	}
}
