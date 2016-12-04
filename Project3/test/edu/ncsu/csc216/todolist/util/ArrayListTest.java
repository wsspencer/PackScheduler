package edu.ncsu.csc216.todolist.util;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc216.todolist.model.Category;
import edu.ncsu.csc216.todolist.model.CategoryList;
/**
 * This is a test class for testing the functionality of the ArrayList class
 * @author Scott Spencer
 *
 */
public class ArrayListTest {

	/**
	 * This is a test method for testing all the methods in ArrayList
	 */
	@Test
	public void test() {
		ArrayList al = new ArrayList();
		//add enough to force the list to resize (to cover that portion of the method)
		Category cat1 = new Category("cat", "details", "C1");
		Category cat2 = new Category("cat", "details", "C2");
		Category cat3 = new Category("cat", "details", "C3");
		Category cat4 = new Category("cat", "details", "C4");
		Category cat5 = new Category("cat", "details", "C5");
		Category cat6 = new Category("cat", "details", "C6");
		Category cat7 = new Category("cat", "details", "C7");
		Category cat8 = new Category("cat", "details", "C8");
		Category cat9 = new Category("cat", "details", "C9");
		Category cat10 = new Category("cat", "details", "C10");
		Category cat11 = new Category("cat", "details", "C11");
		Object[] tasks = new Object[2];
		assertTrue(al.isEmpty());
		al.add(0, cat1);
		al.add(0, cat2);
		al.add(0, cat3);
		al.add(0, cat4);
		al.add(0, cat5);
		al.add(0, cat6);
		al.add(0, cat7);
		al.add(0, cat8);
		al.add(0, cat9);
		al.add(0, cat10);
		al.add(0, cat11);
		assertEquals(al.size(), 11);
		assertEquals(al.indexOf(cat1), 0);
		al.toArray(tasks);
	}

}
