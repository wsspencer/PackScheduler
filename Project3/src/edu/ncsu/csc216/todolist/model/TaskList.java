package edu.ncsu.csc216.todolist.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

import edu.ncsu.csc216.todolist.util.LinkedList;

/**
 * This is a class meant to define the methods and characteristics of a list of tasks
 * @author Scott Spencer
 *
 */
public class TaskList extends Observable implements Tabular, Serializable, Observer {
	/** This is a class variable for the list of Tasks in LinkedList form */
	private LinkedList<Task> list;
	/** This is our long constant for the serial version UID this class will utilize */
	private static final long serialVersionUID = 98734509L;
	/** This is a String representation of the name of the task list instance */
	private String name;
	/** This is an integer class variable for the task number of the "next" task in line */
	private int nextTaskNum;
	/** This is a class variable for the unique identifier of the task list */
	private String taskListID;
	/**
	 * This is our constructor method for building an instance of a task list
	 * @param listName the name of the list we want this task list to have
	 * @param listId the unique identifier of this task list
	 */
	public TaskList(String listName, String listId) {
		//unimplemented
	}
	/**
	 * This is a simple getter method for the name of this task list
	 * @return String representation of the name of this task list
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * This is a simple setter method for the name of this task list
	 * @param newName String representation of the name of this list
	 */
	public void setName(String newName) {
		this.name = newName;
	}
	/**
	 * This is a simple getter method for task list unique id
	 * @return String representation of the task list unique id
	 */
	public String getTaskListID() {
		return this.taskListID;
	}
	/**
	 * This is a simple setter method for the task list id
	 * @param newId the integer we want to set this task list id to
	 */
	private void setTaskListID(int newId) {
		this.taskListID = Integer.toString(newId);
	}
	/**
	 * This is a simple getter method for retrieving the next task number in line
	 * @return integer representing the next task number in sequence
	 */
	private int getNextTaskNum() {
		return this.nextTaskNum;
	}
	/**
	 * This is a void method for incrementing the next task number in sequence (to navigate list)
	 */
	private void incNextTaskNum() {
		this.nextTaskNum++;
	}
	/**
	 * This is a boolean method for adding a task to the list
	 * @param title String title of the task we want to add
	 * @param details String details of the task we want to add
	 * @param startDateTime Date start date and time of the task we want to add
	 * @param endDateTime date end date and time of the task we want to add
	 * @param c the category of the task we want to add
	 * @return boolean stating whether or not the task was added to the list
	 */
	public boolean addTask(String title, String details, Date startDateTime, Date endDateTime, Category c) {
		//unimplemented
		//Make sure I imported the correct date....sql or java.util?
		Task t = new Task(title, details, startDateTime, endDateTime, c, Integer.toString(this.nextTaskNum));
		t.addObserver(this);
		return false;
	}
	/**
	 * This is a simple getter method for retrieving the task at the given task number
	 * @param taskNum the number of the task we want to retrieve
	 * @return Task that is stored at that task number
	 */ 
	public Task getTaskAt(int taskNum) {
		return this.list.get(taskNum);
	}
	/**
	 * This is an int method for retrieving the index of the task with the title in the parameter
	 * @param taskTitle the title of the task we want the index of
	 * @return int representation of the index where our desired task is stored
	 */
	public int indexOf(String taskTitle) {
		//unimplemented
		return 0;
	}
	/**
	 * This is a method for retrieving the size of this list
	 * @return int representing the number of elements in the list
	 */
	public int size() {
		//unimplemented
		return 0;
	}
	/**
	 * This is a boolean method for returning whether or not the list is empty
	 * @return boolean stating whether or not the list is empty
	 */
	public boolean isEmpty() {
		//unimplemented
		return false;
	}
	/**
	 * This is a Task method for removing a task from the list
	 * @param taskNum the index of the task we want to remove
	 * @return the Task that was removed
	 */
	public Task removeTaskAt(int taskNum) {
		//unimplemented
		return null;
	}
	/**
	 * This is a boolean method for removing the task from the list with a given title
	 * @param taskTitle the title of the task we want removed from the list
	 * @return boolean stating whether or not the task was removed from the list
	 */
	public boolean removeTask(String taskTitle) {
		//unimplemented
		return false;
	}
	/**
	 * This is a method for returning a 2D object array of the data stored in the list
	 * @return Object[][] 2D object array of the data in the list
	 */
	public Object[][] get2DArray() {
		//unimplemented
		return null;
	}
	/**
	 * This is a void method for updating the task list given the obsevable and object
	 * @param o the Observable we are updating the list with
	 * @param arg the object we are updating the list with
	 */
	public void update(Observable o, Object arg) {
		//unimplemented
	}
}
















