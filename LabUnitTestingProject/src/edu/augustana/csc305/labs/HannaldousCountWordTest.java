package edu.augustana.csc305.labs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class HannaldousCountWordTest {

	@Test
	public void countWordsTest() {
		String[] words = new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat" };
		assertEquals(4, Hannaldous.countWords(8, words));
		
	}

}
