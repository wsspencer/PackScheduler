package edu.ncsu.csc216.todolist.util;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc216.todolist.model.Category;
import edu.ncsu.csc216.todolist.model.Task;
/**
 * This is a test class for testing the functionality of the LinkedList class
 * @author Scott Spencer
 *
 */
public class LinkedListTest {
	/**
	 * This is a test method for testing all the methods in the LinkedList class
	 */
	@Test
	public void test() {
		LinkedList ll = new LinkedList();
		Category testCat = new Category("Cat1", "deets1", "C1");
		Task tsk1 = new Task("Task1", "deets1", null, null, testCat, "T1");
		Task tsk2 = new Task("Task2", "deets2", null, null, testCat, "T2");
		Task tsk3 = new Task("Task3", "deets3", null, null, testCat, "T3");
		Task tsk4 = new Task("Task4", "deets4", null, null, testCat, "T4");
		Task tsk5 = new Task("Task5", "deets5", null, null, testCat, "T5");
		Task tsk6 = new Task("Task6", "deets6", null, null, testCat, "T6");
		assertTrue(ll.isEmpty());
		ll.add(tsk1);
		ll.add(tsk2);
		ll.add(tsk3);
		assertEquals(ll.size(), 3);
		assertEquals(ll.indexOf(tsk2), 1);
		assertEquals(ll.indexOf(tsk3), 2);
		ll.add(0, tsk4);
		ll.add(0, tsk5);
		ll.add(0, tsk6);
		assertEquals(ll.indexOf(tsk6), 0);
		assertFalse(ll.isEmpty());
		 
		Task tsk7 = new Task("Task7", "deets7", null, null, testCat, "T7");
		ll.add(3, tsk7);
		assertEquals(3, ll.indexOf(tsk7));
		
		Task tsk8 = new Task("Task 8", "deets8", null, null, testCat, "T8");
		assertEquals(ll.indexOf(tsk8), -1);
		
		ll.remove(3);
		assertEquals(ll.indexOf(tsk1), 3);
	}

}
