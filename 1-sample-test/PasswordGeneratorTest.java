package com.javacourse.homework1.reverse;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class that contains methods for testing the password generation.
 * 
 * @author insert-your-name-here.
 *
 */
public class PasswordGeneratorTest {

	private static final int LENGTH = 10;
	private String password = PasswordGenerator.generate(LENGTH);

	/**
	 * Tests if all symbols in the password are valid.
	 */
	@Test
	public void testValidSymbols() {
		Assert.assertEquals(true, password.matches("[a-zA-Z0-9]+"));
	}

	/**
	 * Tests if the length of the password is correct.
	 */
	@Test
	public void testGeneratedPasswordLength() {
		Assert.assertEquals(password.length(), LENGTH);
	}
}
