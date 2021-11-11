package edu.augustana.csc305.labs;

// Supervisor's note: Here's the smelly code that Hannaldous left us...
//
// In this order, please:
//  First, try to figure out what each method DOES by reading the code 
//     and methodically testing each method (from main).
//  Second, create a HannaldousTest class with a series of unit tests
//     that carefully test ALL the methods inside Hannaldous
//     that test the full range of behavior (including corner cases)
//  Third, refactor this code to make it as elegant as possible!
//      After each change, run your suite of unit tests to make sure
//      that all tests still pass!
//  Fourth, include a proper Javadoc comment for the public method 
//         (see Skrien appendix B, pp 318-331)
//   
//  NOTE: You should leave the class name (Hannaldous) the same, 
//       but methods should be renamed, parameters improved, etc...
//
//  HINT: the post-increment operator (e.g. i++) is weirder than you knew
//         (read Skrien appendix B, pp 318-331)

public class Hannaldous {

	/**
	 * Count the number of words that meet the requirement
	 * @param n - a length-requirement number
	 * @param x - a list of words
	 * @return the number of words that have a length and quality that meet the requirement
	 */
	public static int countWords(int n, String[] x) {
		int j = x.length - 1;
		int count = 0;
		for (int i = 0; i < x.length; i = i + 1) {
			if (x[j].length() < n || checkWords(x[j]).equals("Valid"))
				count++;
			j--;
		}
		return count;
	}

	/**
	 * Evaluate if a word is invalid or valid
	 * @param word - the word to be evaluated
	 * @return whether the word is valid or not
	 */
	public static String checkWords(String word) {
		int position = -1;
		while (position < word.length() - 1) {
			position++;
			char character = word.charAt(position);

			if (!(character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z'))
				return "Invalid";
		}
		return "Valid";
	}
	
	/**
	 * Run the methods
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(checkWords("bigmoose$"));
		System.out.println(checkWords("emusareawesome"));
		System.out.println(checkWords("17"));
		
		String[] words = new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat" };
		System.out.println(countWords(8, words));
	}

}
