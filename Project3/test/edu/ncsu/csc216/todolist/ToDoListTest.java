package edu.ncsu.csc216.todolist;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc216.todolist.model.TaskList;
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
		ToDoList tester = new ToDoList();
		assertEquals(tester.getNumTaskLists(), 1);
		tester.addTaskList();
		assertEquals(tester.getNumTaskLists(), 2);
		tester.removeTaskList(0);
		assertEquals(tester.getNumTaskLists(), 1);
		
		tester.setChanged(false);
		assertEquals(tester.isChanged(), false);
		tester.setChanged(true);
		assertEquals(tester.isChanged(), true);
		
		assertEquals(tester.getTaskList(0).getName(), "New List");
		assertEquals(tester.getTaskList(0).getTaskListID(), "TL1");
	}

}
