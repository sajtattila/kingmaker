/**
 * 
 */
package org.glytch.kingmaker.Kingmaker;

import org.glytch.kingmaker.model.Square;
import org.junit.Assert;
import org.junit.Test;

/**
 * The Class SquareTestCase.
 */
public class SquareTestCase {

	/**
	 * Test constructor.
	 */
	@Test
	public void testConstructor() {
		Square square = new Square('A', 1);
		Assert.assertTrue(square != null);
	}

	/**
	 * Test letter.
	 */
	@Test
	public void testLetter() {
		Square square = new Square('A', 1);
		square.setLetter('B');
		Assert.assertTrue(square.getLetter() == 'B');
	}

	/**
	 * Test number.
	 */
	@Test
	public void testNumber() {
		Square square = new Square('A', 1);
		square.setNumber(2);
		Assert.assertTrue(square.getNumber() == 2);
	}
}
