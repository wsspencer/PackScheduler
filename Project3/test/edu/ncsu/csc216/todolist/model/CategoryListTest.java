package edu.ncsu.csc216.todolist.model;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * This is a test class for testing the CategoryList class' functionality
 * @author Scott Spencer
 *
 */
public class CategoryListTest {
	/**
	 * This is a test method for testing all the methods in CategoryList
	 */
	@Test 
	public void test() {
		CategoryList tester = new CategoryList();
		tester.addCategory("cat1", "description");
		assertEquals(tester.size(), 1);
		assertEquals(tester.getCategoryAt(0).getName(), "cat1");
		assertEquals(tester.getCategoryAt(0).getDescription(), "description");
		assertEquals(tester.getCategoryAt(0).getCategoryID(), "C1");
		tester.removeCategoryAt(0);
		assertEquals(tester.size(), 0);
		assertTrue(tester.isEmpty());
		tester.addCategory("cat2", "desc");
		assertEquals(tester.size(), 1);
		assertEquals(tester.getCategoryAt(0).getName(), "cat2");
		assertEquals(tester.getCategoryAt(0).getDescription(), "desc");
		assertEquals(tester.getCategoryAt(0).getCategoryID(), "C2");
		tester.removeCategory("C2");
		tester.addCategory("cat3", "descriptor");
		tester.addCategory("cat4", "descriptio");
		tester.addCategory("cat5", "internetcable");
		tester.addCategory("cat6", "betterinternetcable");
		assertEquals(tester.size(), 4);
		assertEquals(tester.getCategoryAt(2).getName(), "cat5");
		assertEquals(tester.getCategoryAt(2).getCategoryID(), "C5");
		tester.removeCategory("C5");
		assertEquals(tester.getCategoryAt(2).getName(), "cat6");
		assertEquals(tester.getCategoryAt(2).getCategoryID(), "C6");
		
		assertFalse(tester.isEmpty());
		assertEquals(1, tester.indexOf("C4"));
		assertEquals(2, tester.indexOfName("cat6"));
	}
}
