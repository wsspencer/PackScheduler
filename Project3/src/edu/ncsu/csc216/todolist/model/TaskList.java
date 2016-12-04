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
	private LinkedList list;
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
		this.name = listName;
		this.taskListID = listId;
		//initialize our instance of a linked list
		this.list = new LinkedList();
		//initialize nextTaskNum
		this.nextTaskNum = 1;		
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
		setChanged();
		notifyObservers();
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
	private void setTaskListID(String newId) {
		this.taskListID = newId;
		setChanged();
		notifyObservers();
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
		setChanged();
		notifyObservers();
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
		String taskId = "TL" + this.getNextTaskNum();
		//unimplemented
		Task t = new Task(title, details, startDateTime, endDateTime, c, taskId);
		//increment next task num since we used the current one on "t"
		this.incNextTaskNum();
		//add this as observer to our "t" task
		t.addObserver(this);
		//add and return if it was added or not
		this.list.add(t);
		if (this.list.contains(t)) {
			//tell the observers it was added
			setChanged();
			notifyObservers();
			return true;
		}
		return false;
		
	}
	/**
	 * This is a simple getter method for retrieving the task at the given task number
	 * @param taskNum the number of the task we want to retrieve
	 * @return Task that is stored at that task number
	 */ 
	public Task getTaskAt(int taskNum) {
		//call the build in get method in our linkedlist instance
		return (Task) this.list.get(taskNum);
	}
	/**
	 * This is an int method for retrieving the index of the task with the title in the parameter
	 * @param taskTitle the title of the task we want the index of
	 * @return int representation of the index where our desired task is stored
	 */
	public int indexOf(String taskTitle) {
		//run loop to get titles at indexes of list until correct title is found
		for (int i = 0; i < this.list.size(); i++) {
			if (((Task) this.list.get(i)).getTitle().equals(taskTitle)) {
				return i;
			}
		}
		//if loop runs out without finding appropriate title, return -1
		return -1;
	}
	/**
	 * This is a method for retrieving the size of this list
	 * @return int representing the number of elements in the list
	 */
	public int size() {
		//call the build in size method in our linkedlist instance
		return this.list.size();
	}
	/**
	 * This is a boolean method for returning whether or not the list is empty
	 * @return boolean stating whether or not the list is empty
	 */
	public boolean isEmpty() {
		if (this.list.isEmpty()) {
			return true;
		}
		return false;
	}
	/**
	 * This is a Task method for removing a task from the list
	 * @param taskNum the index of the task we want to remove
	 * @return the Task that was removed
	 */
	public Task removeTaskAt(int taskNum) {
		//call the build in remove method in our linkedlist instance
		Task ret = (Task) this.list.get(taskNum);
		this.list.remove(taskNum);
		setChanged();
		notifyObservers();
		return ret;
	}
	/**
	 * This is a boolean method for removing the task from the list with a given title
	 * @param taskTitle the title of the task we want removed from the list
	 * @return boolean stating whether or not the task was removed from the list
	 */
	public boolean removeTask(String taskTitle) {
		//loop increment until we reach our linked list's size, checking each increment index's title to 
		//see if it equals our parameter
		for (int i = 0; i < this.list.size(); i++) {
			if (((Task) this.list.get(i)).getTitle().equals(taskTitle)) {
				this.list.remove(i);
				setChanged();
				notifyObservers();
				return true;
			}
		}
		//if task with that title is not found in looping, return false
		return false;
	}
	/**
	 * This is a method for returning a 2D object array of the data stored in the list
	 * @return Object[][] 2D object array of the data in the list
	 */
	public Object[][] get2DArray() {
		//Returns an Object[][] array. Each row, i, contains a Category.
		//this will be what's printed to the GUI table
		Object[][] panel = new Object[this.list.size()][8];
		for (int i = 0; i < this.list.size(); i++) {
			panel[i][0] = ((Task) this.list.get(i)).getTaskID();
			panel[i][1] = ((Task) this.list.get(i)).getTitle();
			panel[i][2] = ((Task) this.list.get(i)).getCategory();
			panel[i][3] = ((Task) this.list.get(i)).getStartDateTime();
			panel[i][4] = ((Task) this.list.get(i)).getDueDateTime();
			panel[i][5] = ((Task) this.list.get(i)).getCompletedDateTime();
			panel[i][6] = ((Task) this.list.get(i)).isCompleted();
			panel[i][7] = ((Task) this.list.get(i)).getDetails();
		}
		return panel;
	}
	/**
	 * This is a void method for updating the task list given the obsevable and object
	 * @param o the Observable we are updating the list with
	 * @param arg the object we are updating the list with
	 */
	public void update(Observable o, Object arg) {
		setChanged();
		o.notifyObservers(arg);
	}
}
















