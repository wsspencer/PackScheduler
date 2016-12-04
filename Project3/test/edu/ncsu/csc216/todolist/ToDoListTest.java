package edu.ncsu.csc216.todolist;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This is a test class for testing the functionality of the ToDoList class
 * @author Scott Spencer
 *
 */ 
public class ToDoListTest {
	/**
	 * This is a test method for testing all the methods in the ToDoList class
	 */
	@Test
	public void test() {
		//test constructor and get number of tasklists and remove 
		//(CURRENTLY, WE ARE ADDING TO INDEX 0 AND SHIFTING ARRAY DOWNWARD.  MAKE SURE THAT'S THE RIGHT DIRECTION)
		ToDoList tester = new ToDoList();
		//should be initiated with one task list so requesting the list at 1 this early should throw an indexoutofbounds
		try {
			tester.getTaskList(1);
			fail();
		} catch (IndexOutOfBoundsException e) {
			assertEquals(tester.getNumTaskLists(), 1);
		}
		tester.removeTaskList(0);
		try {
			tester.removeTaskList(0);
			fail();
		} catch (IndexOutOfBoundsException e) {
			assertEquals(tester.getNumTaskLists(), 0);
		}
		tester.addTaskList();
		tester.addTaskList();
		assertEquals(tester.getNumTaskLists(), 2);
		tester.removeTaskList(0);
		assertEquals(tester.getNumTaskLists(), 1);
		
		//test change and its setter
		tester.setChanged(false);
		assertEquals(tester.isChanged(), false);
		tester.setChanged(true); 
		assertEquals(tester.isChanged(), true);
		
		//test that the array is working and getters are working
		assertEquals(tester.getTaskList(0).getName(), "New List");
		assertEquals(tester.getTaskList(0).getTaskListID(), "TL4");
		
		//test nexttasklistnum functionality (make sure it's not recycling numbers, etc)
		tester.addTaskList();
		assertEquals(tester.getTaskList(1).getTaskListID(), "TL5");
		assertEquals(tester.getTaskList(0).getTaskListID(), "TL4");
		
		
		//test file processing functionality
		tester.setFilename("test-files/changeName.txt"); 
		assertEquals(tester.getFilename(), "test-files/changeName.txt");
		try {
			tester.setFilename(null);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals(tester.getFilename(), "test-files/changeName.txt");
		}

		tester.openDataFile("test-files/testFile.txt");

		tester.saveDataFile("test-files/saveFile.txt");
		//make sure update doesn't throw anything
		tester.update(tester, tester.getCategoryList());
		
		//test addTL out of bounds throws
		tester.addTaskList();
		try {
			tester.removeTaskList(-1);
			fail();
		} catch (IndexOutOfBoundsException e) {
			assertEquals(tester.getNumTaskLists(), 1);
		}
		try {
			tester.removeTaskList(5);		
			fail();
		} catch (IndexOutOfBoundsException e) {
			assertEquals(tester.getNumTaskLists(), 1);
		}
		
		
	}
}
