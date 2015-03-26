/**
 * 
 */
package org.glytch.kingmaker.Kingmaker;

import org.glytch.kingmaker.model.util.Square;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Matthieu
 *
 */
public class SquareTestCase {

	@Test
	public void testConstructor() {
		Square square = new Square('A', 1);
		Assert.assertTrue(square != null);
	}

	@Test
	public void testLetter() {
		Square square = new Square('A', 1);
		square.setLetter('B');
		Assert.assertTrue(square.getLetter() == 'B');
	}

	@Test
	public void testNumber() {
		Square square = new Square('A', 1);
		square.setNumber(2);
		Assert.assertTrue(square.getNumber() == 2);
	}
}
