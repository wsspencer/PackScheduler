package edu.ncsu.csc216.todolist.model;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
/**
 * This is a test class for testing the functionality of the Task class
 * @author Scott Spencer
 *
 */
public class TaskTest {
	/**
	 * This is a test method for testing all the methods in the Task class
	 */
	@Test
	public void test() {
		Category ctgy = new Category("cat", "deets", "C1");
		Task tsk = new Task("new", "blah", null, null, ctgy, "T1");
		Task copyTsk = new Task("new", "blah", null, null, ctgy, "T1");
		assertEquals(0, tsk.compareTo(copyTsk));
		tsk.equals(copyTsk);
		tsk.hashCode();
		tsk.setCompleted(true);
		assertTrue(tsk.isCompleted());
		
		Date compDate = new Date();
		tsk.setCompletedDateTime(compDate);
		assertEquals(tsk.getCompletedDateTime(), compDate);
	}
}
