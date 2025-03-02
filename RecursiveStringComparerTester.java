/**
 * @author Keller Payne
 * @since November 25, 2024
 * @see RecursiveStringComparer.java
 * 
 * A Junit Test class to test RecursiveStringComparer class methods
 * 
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class RecursiveStringComparerTester {
	private String string1;
	private String string2;
	private String string3;
	private String string4;
	private String string5;
	private String string6;

	private String[] array1 = {"please", "let", "these", "methods", "pass", "these", "tests"};
	private String[] array2 = {"hello", "world", "my", "name", "is", "robot"};
	private String[] array3 = {"Write", "a", "JUnit", "test", "class", "that", "fully", "tests", "each", "of", "these", "two", "methods",};
	private String[] array4 = {"Thanks", "for", "using", "JUnit"};
	private String[] array5 = {"Recursive", "String", "Comparer", "Will", "Work", "Correctly"};


	/**
	 * Initializes string1-6 before each test case 
	 */

	@BeforeEach
	public void initialize(){

		string1 = "hello";
		string2 = "hi";
		string3 = "Chao";
		string4 = "Hola";
		string5 = "Bonjour";
		string6 = "Hello";

	}

	/**
	 * Tests the .compare() method from RecursiveStringComparer.java 
	 */

	@Test
	public void testCompare() {
		assertEquals(-1, RecursiveStringComparer.compare(string1, string2));
		assertEquals(-1, RecursiveStringComparer.compare(string3, string2));
		assertEquals(1, RecursiveStringComparer.compare(string2, string1));
		assertEquals(1, RecursiveStringComparer.compare(string2, string3));
		assertEquals(0, RecursiveStringComparer.compare(string1, string6));
		assertEquals(0, RecursiveStringComparer.compare(string6, string1));
		assertEquals(-1, RecursiveStringComparer.compare(string5, string4));
		assertEquals(-1, RecursiveStringComparer.compare(array2[0], array2[1]));
	}

	/**
	 * Tests the findMinimum() method from RecursiveStringComparer.java
	 */

	@Test
	public void testFindMinimum(){
		assertEquals("let", RecursiveStringComparer.findMinimum(array1, array1.length));
		assertEquals("hello", RecursiveStringComparer.findMinimum(array2, array2.length));
		assertEquals("a", RecursiveStringComparer.findMinimum(array3, array3.length));
		assertEquals("for", RecursiveStringComparer.findMinimum(array4, array4.length));
		assertEquals("Comparer", RecursiveStringComparer.findMinimum(array5, array5.length));

	}
}