/**
 * @author Keller Payne
 * @version 1.0.0
 * @since November 25, 2024
 * 
 * A class that contains methods that compare Strings based on alphabetical order.
 * 
 */

import java.util.ArrayList;

public class RecursiveStringComparer {

	/**
	 * Recursive method that compares two strings
	 * This method is case insensitive, as it converts both parameters to lowercase before performing
	 * the checks.
	 * 
	 * @param s1 string that s2 will be compared to
	 * @param s2 string that s1 will be compared to
	 * 
	 * @custom.require s1 and s2 are Strings
	 * 
	 * @return -1, 0 , or 1 depending on if s1 comes before, is equal to, or comes after s2.
	 * 
	 */
	public static int compare(final String s1, final String s2) {

		// To ensure the comparison is case insensitive:
		String string1 = s1.toLowerCase();									// saves the lowercase of s1 in a local variable
		String string2 = s2.toLowerCase();									// saves the lowercase of s2 in a local variable

		//checks if either or both strings are empty
		if (string1.length() == 0 || string2.length() == 0) {
			if (string1.length() == 0 && string2.length() == 0) {			// if both are empty
				return 0;													// returns 0 as they both match
			} else if (string1.length() != 0) {								// if string1 is not empty but string2 is
				return 1;													// returns 1 since string1 comes after an empty string
			} else {														// else if string1 is empty and string2 is not
				return -1;													// returns -1 since empty string comes before a string with data
			}
		}

		//checks if the first letter is the same
		if (string1.charAt(0) == string2.charAt(0)) {
			return compare(string1.substring(1), string2.substring(1));		// if so, recursive call is made to check second letter in strings
		} else if (string1.charAt(0) < string2.charAt(0)) {					// if not, compares the first letters
			return -1;														// returns -1 if string1 comes before string2
		} else if (string1.charAt(0) > string2.charAt(0)) {					// else
			return 1;														// returns 1 if string1 comes after string2
		} else {															// else
			return 0;														// returns 0 if strings match
		}
	}

	/**
	 * Method that finds the minimum (first by alphabetical order) string in an
	 * array of Strings. Uses the above compare(final String s1, final String s2)
	 * method to identify smallest string
	 * 
	 * @param stringArray an array of Strings
	 * @custom.require stringArray is an array of Strings.
	 * 
	 * @return the string that is the first by alphabetical order in stringArray
	 * 
	 */

	public static String findMinimum(final String[] stringArray, int numStrings){
		
		if(numStrings == 1){												// checks if stringArray contains only 1 element
			return stringArray[0];											// returns that element if so
		}

		String minimum = findMinimum(stringArray, numStrings-1);			// sets minimum to findMinimum(stringArray, numStrings-1)0

		if(compare(stringArray[numStrings-1], minimum) > 0){				// if compare(stringArray[numStrings-1], minimum) greater than 0
			return minimum;													// returns minimum
		}

		return stringArray[numStrings-1];									// returns stringArray[numStrings-1] to be compared with minimum
	}
} // end class RecursiveStringComparer