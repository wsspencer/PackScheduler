package edu.ncsu.csc216.todolist;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Observable;
import java.util.Observer;

import edu.ncsu.csc216.todolist.model.CategoryList;
import edu.ncsu.csc216.todolist.model.TaskList;
import edu.ncsu.csc216.todolist.util.ArrayList;

/**
 * This class functions as the engine of our to-do list.  It utilizes other classes in the model package to interact with an 
 * instance of a to-do list.
 * @author Scott Spencer
 *
 */
public class ToDoList extends Observable implements Serializable, Observer {
	
	//instances
	/** This is our instance of TaskList that holds tasks */
	private TaskList[] tasks;
	/** This is our instance of CategoryList that holds categories of tasks */
	private CategoryList categories;
	/** This is our long constant for the serial version UID this class will utilize */
	private static final long serialVersionUID = 34992L;
	/** This is our integer constant for resizing the list of lists */
	private static final int RESIZE = 3;
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
		//initializes nextTaskListNum at 1
		this.nextTaskListNum = 1;
		//creates a list of task lists with at least 3 elements
		this.tasks = new TaskList[RESIZE];
		//sets first element in our list of task lists to a new task list with the given parameters
		this.tasks[0] = new TaskList("New List", "TL" + this.nextTaskListNum);
		//increments nextTaskListNum since we used the current nextTaskListNum for the indentifier of index 0
		this.incNextTaskListNum();
		
		//constructs a new category list
		this.categories = new CategoryList();
		//add this todolist instance as an observer of the category list
		this.categories.addObserver(this);
		
		//set the changed status of this instance to false
		this.changed = false;
	}
	/**
	 * This is a method for checking if the to-do list has changed
	 * @return boolean stating whether or not the list has changed
	 */
	public boolean isChanged() {
		return this.changed;
	}
	/**
	 * This is a method for setting the changed boolean variable to the parameterized value
	 * @param changed boolean we want to set our changed variable to.
	 */
	public void setChanged(boolean changed) {
		this.changed = changed;
	}
	/**
	 * This is a method for retrieving the filename we are using for this instance of data
	 * @return String representation of the filename
	 */
	public String getFilename() {
		return this.filename;
	}
	/**
	 * This is a void method for setting the data's filename to the parameterized value
	 * @param filename the string filename we want to set our variable to
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}
	/**
	 * This is a method used to retrieve the number of the "next" task list (for ID #s.  Initiated at 1, then increments)
	 * @return int representing the index number of the "next" task list for the purpose of giving a unique identifier to new lists
	 */
	private int getNextTaskListNum() {
		return this.nextTaskListNum;
	}
	/**
	 * This is a void method for incrementing the index number of the "next" task list so that we may keep adding new tasks
	 */
	private void incNextTaskListNum() {
		this.nextTaskListNum++;
	}
	/**
	 * This is an integer method for retrieving the number of task lists we are storing
	 * @return int value representing the total task lists
	 */
	public int getNumTaskLists() {
		//dont want to just return length or it will count the null indexes in the array as well
		int counter = 0;
		for (int i = 0; i < this.tasks.length; i++) {
			if (this.tasks[i] != null) {
				counter++;
			}
		}
		return counter;
	}
	/**
	 * This is a method used to retrieve the TaskList object stored at the parameterized index
	 * @param listIndex the desired index we want to return the value at
	 * @return TaskList the task list stored at the parameterized index
	 */
	public TaskList getTaskList(int listIndex) {
		return this.tasks[listIndex];
	}
	/**
	 * This is the CategoryList method we use to retrieve the list of categories object corresponding
	 * to this dataset
	 * @return CategoryList corresponding to the current instance
	 */
	public CategoryList getCategoryList() {
		this.categories.addObserver(this);
		return this.categories;
	}
	/**
	 * This is the integer method used to add a new task list to our dataset
	 * @return integer index of the added task list
	 */
	public int addTaskList() {
		//create a task list to add with New List for name and "TL#" whatever the next tasklist number is and add this as an observer to it
		TaskList tL = new TaskList("New List", ("TL" + this.getNextTaskListNum()));
		//add this instance of ToDoList as an observer to our new task list
		tL.addObserver(this);
		//index we will put tL
		int index = this.getNumTaskLists();
		//check if array needs to be resized, does so if needed
		if (this.tasks.length == this.getNumTaskLists()) {
			TaskList[] tempTasks = new TaskList[this.tasks.length + RESIZE];
			for (int i = 0; i < index; i++) {
				tempTasks[i] = this.tasks[i];
			}
			this.tasks = tempTasks;
		}
		//since the size of tempTasks is one greater than our current instance, the length of our
		//instance should be the same as the last index in tempTasks
		this.tasks[index] = tL;
		//Now that we have used the next task list number in line for the above task's ID number and successfully added the task list to our list,
		//we will need to increment the next TaskListNum for later use
		this.incNextTaskListNum();
		//notify observers of this class to the change
		this.notifyObservers();
		this.update(this, tasks);
		//return the index of the added tasklist
		return index;
	}
	/**
	 * This is the void method we use to remove a task list stored at the parameterized index
	 * @param listIndex the integer representing the index of the task list we want to remove
	 */
	public void removeTaskList(int listIndex) {
		//check for index out of bounds exception
		if (listIndex < 0 || listIndex >= this.tasks.length) {
			throw new IndexOutOfBoundsException();
		}
		
		//remove this as an observer from the index we are removing 
		this.tasks[listIndex].deleteObserver(this);
		//notify the observers of todolist of the changes
		
		//make a new array of size one smaller than our current to replace our current instance
		TaskList[] tempTasks = new TaskList[this.tasks.length - 1];
		//make our new array a copy of our current instance up until the index we want removed
		for (int i = 0; i < listIndex; i++) {
			tempTasks[i] = this.tasks[i];
		}
		//skip over the index we want removed and continue making our copy (remember tempTasks is one
		//smaller than our current instance so its indexes will be exactly offset by one)
		for (int i = listIndex + 1; i < this.tasks.length; i++) {
			tempTasks[i - 1] = this.tasks[i];
		}
		//replace our current instance with tempTasks
		this.tasks = tempTasks;
		
		//notify observers of this class to the change
		this.notifyObservers();
		this.update(this, tasks);
	}
	/**
	 * Saves the CategoryList and the array of TaskLists to the given file using 
	 * object serialization.  
	 * @param fname filename to save ToDoList information to.
	 */
	public void saveDataFile(String fname) {
		try {
			FileOutputStream fileOut = new FileOutputStream(fname);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			for (int i = 0; i < numLists; i++) {
				out.writeObject(tasks[i]);
			}
			out.writeObject(categories);
			out.writeObject(filename);
			out.writeInt(nextTaskListNum);
			changed = false;
			out.close();
			fileOut.close();
		}
		catch (IOException e) {
			System.err.println("An error occurred while saving file " + fname);
			e.printStackTrace(System.err);
		}
	}
	/**
	 * Opens a data file with the given name and creates the data structures from 
	 * the serialized objects in the file.
	 * @param fname filename to create ToDoList information from.
	 */
	public void openDataFile(String fname) {
		if (changed) {
			saveDataFile(filename);
		}
		try {
			FileInputStream fileIn = new FileInputStream(fname);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			ArrayList temp = new ArrayList(); 
			Object tl = in.readObject();
			while (tl instanceof TaskList) {
				TaskList l = (TaskList)tl;
				l.addObserver(this);
				temp.add(l);
				tl = in.readObject();
			}
			tasks = new TaskList[RESIZE];
			tasks = (TaskList[]) temp.toArray(tasks);
			numLists = temp.size();
			categories = (CategoryList)tl;
			categories.addObserver(this);
			filename = (String)in.readObject();
			nextTaskListNum = (int)in.readInt();
			changed = false;
			in.close();
			fileIn.close();
			
		}
		catch (IOException e) {
			System.err.println("An error occurred while reading file " + fname);
			e.printStackTrace(System.err);
		}
		catch (ClassNotFoundException c) {
			System.err.println("Error reconstructing ToDoList from file " + fname);
			c.printStackTrace(System.err);
		}
	}
	/**
	 * This is the void method that is automatically called when a task list changes.  TaskList 
	 * should propagate the notification of the change to its observers IF the observable "o" 
	 * is contained in the list of tasks.  The arg parameter is passed to notifyObservers().
	 * @param o the Observable that may or may not be used in the task list 
	 * @param arg an object argument passed to notifyObservers().
	 */
	@Override
	public void update(Observable o, Object arg) {
		// Is automatically called? Do I implement that or is it implicitly part of the code?
		o.notifyObservers(arg);
		setChanged(true);
	}
}






















