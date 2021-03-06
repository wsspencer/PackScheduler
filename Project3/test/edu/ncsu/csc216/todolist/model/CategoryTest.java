package edu.ncsu.csc216.todolist.model;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * This is a test class for testing the functionality of the Category class
 * @author Scott Spencer
 *
 */
public class CategoryTest { 
	/**
	 * This is a test method for testing all the methods in the Category class
	 */
	@Test
	public void test() {
		Category cat = new Category("C1", "cat", "deets");
		Category copyCat = new Category("C1", "cat", "deets");
		Category nonCopyCat = new Category("C2", "cat", "deets");
		cat.hashCode();
		assertEquals(cat.compareTo(copyCat), 0);
		assertTrue(cat.equals(copyCat)); 
		assertFalse(cat.equals(nonCopyCat));
		assertEquals(cat.toString(), "cat");
	}

}
