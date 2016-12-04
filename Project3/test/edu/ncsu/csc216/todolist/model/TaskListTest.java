package edu.ncsu.csc216.todolist.model;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * This is a test class for testing the functionality of the TaskList class
 * @author Scott Spencer
 *
 */
public class TaskListTest {

	/**
	 * This is a test method for testing all the methods in the TaskList class
	 */
	@Test
	public void test() {
		TaskList tester = new TaskList("New List", "T1");
		
		assertEquals("New List", tester.getName());
		assertEquals("T1", tester.getTaskListID());
		
		Category testCat = new Category("testCat", "deets", "C1");
		//test it's building the array and adding right
		tester.addTask("title", "details", null, null, testCat);
		assertEquals(tester.getTaskAt(0).getTitle(), "title");
		assertEquals(tester.get2DArray()[0][0], "TL1");
		assertEquals(tester.get2DArray()[0][1], "title");
		assertEquals(tester.get2DArray()[0][7], "details");

		//test remove one element from list of size 1
		tester.removeTaskAt(0);
		
		//test remove from larger list
		tester.addTask("title1", "details", null, null, testCat);
		tester.addTask("title2", "details", null, null, testCat);
		tester.addTask("title3", "details", null, null, testCat);
		tester.addTask("title4", "details", null, null, testCat);
		tester.addTask("title5", "details", null, null, testCat);
		assertEquals(tester.size(), 5);
		assertEquals(tester.getTaskAt(0).getTitle(), "title1");
		assertEquals(tester.getTaskAt(1).getTitle(), "title2");
		assertEquals(tester.getTaskAt(2).getTitle(), "title3");
		assertEquals(tester.getTaskAt(3).getTitle(), "title4");
		assertEquals(tester.getTaskAt(4).getTitle(), "title5");
		tester.removeTaskAt(3);
		assertEquals(tester.getTaskAt(3).getTitle(), "title5");
	}

}
