package edu.augustana.csc305.labs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class HannaldousCheckWordTest {

	@Test
	public void checkWordTest() {
		assertEquals("Invalid", Hannaldous.checkWords("bigmoose$"));
		assertEquals("Valid", Hannaldous.checkWords("emusareawesome"));
		assertEquals("Invalid", Hannaldous.checkWords("17$"));
	}

}
