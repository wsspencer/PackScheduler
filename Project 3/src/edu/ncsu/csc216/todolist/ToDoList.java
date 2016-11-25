package edu.ncsu.csc216.todolist;

import java.util.Observable;

import edu.ncsu.csc216.todolist.model.CategoryList;
import edu.ncsu.csc216.todolist.model.TaskList;

/**
 * This class functions as the engine of our to-do list.  It utilizes other classes in the model package to interact with an 
 * instance of a to-do list.
 * @author Scott Spencer
 *
 */
public class ToDoList {
	
	//instances
	/** This is our instance of TaskList that holds tasks */
	private TaskList tasks;
	/** This is our instance of CategoryList that holds categories of tasks */
	private CategoryList categories;
	/** This is our long constant for the serial version UID this class will utilize */
	private static final long serialVersionUID = 34992L;
	/** This is our integer constant for resizing the list of lists */
	private static final int RESIZE = 0;
	/** This is our integer variable for the number of lists we have */
	private int numLists;
	/** This is our string variable for the filename we will use for this data */
	private String filename;
	/** This is our boolean variable for telling us whether or not the list has changed */
	private boolean changed;
	/** This is our integer variable for the index of the next task list */
	private int nextTaskListNum;
	/**
	 * This is our constructor method for the to-do list
	 */
	public ToDoList() {
		//unimplemented
	}
	/**
	 * This is a method for checking if the to-do list has changed
	 * @return boolean stating whether or not the list has changed
	 */
	public boolean isChanged() {
		//unimplemented
		return false;
	}
	/**
	 * This is a method for setting the changed boolean variable to the parameterized value
	 * @param changed boolean we want to set our changed variable to.
	 */
	public void setChanged(boolean changed) {
		//unimplemented
	}
	/**
	 * This is a method for retrieving the filename we are using for this instance of data
	 * @return String representation of the filename
	 */
	public String getFilename() {
		//unimplemented
		return "";
	}
	/**
	 * This is a void method for setting the data's filename to the parameterized value
	 * @param filename the string filename we want to set our variable to
	 */
	public void setFilename(String filename) {
		//unimplemented
	}
	/**
	 * This is a method used to retrieve the number of the "next" task list
	 * @return int representing the index number of the "next" task list
	 */
	private int getNextTaskListNum() {
		//unimplemented
		return 0;
	}
	/**
	 * This is a void method for incrementing the index number of the "next" task list
	 */
	private void incNextTaskListNum() {
		//unimplemented
	}
	/**
	 * This is an integer method for retrieving the number of task lists we are storing
	 * @return int value representing the total task lists
	 */
	public int getNumTaskLists() {
		//unimplemented
		return 0;
	}
	/**
	 * This is a method used to retrieve the TaskList object stored at the parameterized index
	 * @param listIndex the desired index we want to return the value at
	 * @return TaskList the task list stored at the parameterized index
	 */
	public TaskList getTaskList(int listIndex) {
		//unimplemented
		return null;
	}
	/**
	 * This is the CategoryList method we use to retrieve the list of categories object corresponding
	 * to this dataset
	 * @return CategoryList corresponding to the current instance
	 */
	public CategoryList getCategoryList() {
		//unimplemented
		return null;
	}
	/**
	 * This is the integer method used to add a task list to our dataset
	 * @return integer index of the added task list
	 */
	public int addTaskList() {
		//unimplemented
		return 0;
	}
	/**
	 * This is the void method we use to remove a task list stored at the parameterized index
	 * @param listIndex the integer representing the index of the task list we want to remove
	 */
	public void removeTaskList(int listIndex) {
		//unimplemented
	}
	/**
	 * This is the void method we use to save our dataset with the parameterized filename
	 * @param fileName the String representing the filename we want to associate to this dataset
	 */
	public void saveDataFile(String fileName) {
		//unimplemented
	}
	/**
	 * This is the void method we use to open a data file stored under the parameterized filename
	 * @param fileName the String representing the name associated with our desired dataset
	 */
	public void openDataFile(String fileName) {
		//unimplemented
	}
	/**
	 * This is the void method that is automatically called when a task list changes.  TaskList 
	 * should propagate the notification of the change to its observers IF the observable "o" 
	 * is contained in the list of tasks.  The arg parameter is passed to notifyObservers().
	 * @param o the Observable that may or may not be used in the task list 
	 * @param arg an object argument passed to notifyObservers().
	 */
	public void update(Observable o, Object arg) {
		//unimplemented
	}
}






















