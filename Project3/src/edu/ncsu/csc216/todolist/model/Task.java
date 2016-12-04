package edu.ncsu.csc216.todolist.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Observable;
/**
 * This is a class for outlining the tasks and characteristics of a Task
 * 
 * @author Scott Spencer
 *
 */
public class Task extends Observable implements Serializable {
	/** This is a class variable for the category of this Task */
	private Category category;
	/** This is our long constant for the serial version UID this class will utilize */
	private static final long serialVersionUID = 7459L;
	/** This is a class variable for the title of this task */
	private String title;
	/** This is a class variable for the details of this task */
	private String details;
	
	/** This is a class variable for the start date and time of this task */
	private Date startDateTime;
	/** This is a class variable for the due date and time of this task */
	private Date dueDateTime;
	/** This is a class variable for the completed date and time of this task */
	private Date completedDateTime;
	/** This is a class variable for keeping track of whether or not the task is completed */
	private boolean completed;
	/** This is a class variable for the unique identifier of the task */ 
	private String taskID;
	/**
	 * This is a constructor method for defining the instance of a Task
	 * @param title This is the title of the task
	 * @param details This is the details of the task
	 * @param startDateTime This is the start date and time of the task
	 * @param endDateTime This is the end date and time of the task
	 * @param c This is the category of the task
	 * @param id This is the unique identifier of the task
	 */
	public Task(String title, String details, Date startDateTime, Date endDateTime, Category c, String id) {
		setTitle(title);
		setDetails(details);
		setStartDateTime(startDateTime);
		setDueDateTime(endDateTime);
		setCategory(c);
		setTaskID(id);
	}
	/**
	 * This is a simple getter method for retrieving a string representation of the title
	 * @return String representing the title of the task
	 */
	public String getTitle() {
		return this.title;
	}
	/**
	 * This is a  simple setter method for the title of the course
	 * @param title the String title we want to set to our task
	 */
	public void setTitle(String title) {
		this.title = title;
		this.setChanged();
		this.notifyObservers();
	}
	/**
	 * This is a simple getter method from retrieving the details of the task
	 * @return String representation of 
	 */
	public String getDetails() {
		return this.details;
	}
	/**
	 * This is a simple setter method for setting the value of the task details
	 * @param details String representation of the task details
	 */
	public void setDetails(String details) {
		this.details = details;
		this.setChanged();
		this.notifyObservers();
	}
	/**
	 * This is a simple getter method for retrieving the start date and time of 
	 * this task
	 * @return Date representation of the start date and time
	 */
	public Date getStartDateTime() {
		return this.startDateTime;
	}
	/**
	 * This is a simple setter method for setting this tasks start date and time
	 * to the parameterized one.
	 * @param startDate The start date and time we want the task's set to
	 */
	public void setStartDateTime(Date startDate) {
		this.startDateTime = startDate;
		this.setChanged();
		this.notifyObservers();
	}
	/**
	 * This is a simple getter method for retrieving the due date and time of this task
	 * @return Date containing the due date and time of the task
	 */
	public Date getDueDateTime() {
		return this.dueDateTime;
	}
	/**
	 * This is a simple setter method for setting the due date and time to that in the 
	 * parameter
	 * @param dueDate the due date and time
	 */
	public void setDueDateTime(Date dueDate) {
		this.dueDateTime = dueDate;
		this.setChanged();
		this.notifyObservers();
	}
	/**
	 * This is a simple getter method for retrieving the completed date and time of this task
	 * @return Date containing the completed date and time of the task
	 */
	public Date getCompletedDateTime() {
		return this.completedDateTime;
	}
	/**
	 * This is a simple setter method for setting the completed date and time to that in the 
	 * parameter
	 * @param compDate the completed date and time
	 */
	public void setCompletedDateTime(Date compDate) {
		this.completedDateTime = compDate;
		this.setChanged();
		this.notifyObservers();
	}
	/**
	 * This is a boolean method for telling if the task is completed
	 * @return boolean saying whether or not the task is completed
	 */
	public boolean isCompleted() {
		return this.completed;
	}
	/**
	 * This is a simple setter method for setting the completed status to the parameter
	 * @param compStatus true/false of if the task should be set to complete or not
	 */
	public void setCompleted(boolean compStatus) {
		this.completed = compStatus;
		this.setChanged();
		this.notifyObservers();
	}
	/**
	 * This is a simple setter method for setting the category to the parameterized one
	 * @param c the category we want to set this task to
	 */
	public void setCategory(Category c) {
		this.category = c;
		this.setChanged();
		this.notifyObservers();
	}
	/**
	 * This is a simple getter method for retrieving this task's category
	 * @return Category of this task
	 */
	public Category getCategory() {
		return this.category;
	}
	/**
	 * This is a simple getter method for retrieving this task's unique identifier
	 * @return String representation of the unique identifier
	 */
	public String getTaskID() {
		return this.taskID;
	}
	/**
	 * This is a simple setter method for setting the task's unique identifier to the 
	 * parameterized one
	 * @param iD the identifier we want to set this task to
	 */
	private void setTaskID(String iD) {
		this.taskID = iD;
		this.setChanged();
		this.notifyObservers();
	}
	/**
	 * This is a boolean method for returning if this task equals the parameter
	 * @return boolean stating whether or not the task equals the parameterized object
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	/**
	 * This is an integer method for hashing code
	 * @return int representation of that hashed code
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	/**
	 * This is an integer method for comparing this task to the parameter
	 * @param t the task we want to compare this instance to
	 * @return int representing the results of the comparison
	 */
	public int compareTo(Task t) {
		int equal = 0;
		
		if (this.title.equals(t.title) && this.details.equals(t.details)) {
			return equal;
		}
		
		int comparison = this.title.compareToIgnoreCase(t.title);
	    if (comparison != equal) return comparison;
	    
	    comparison = this.details.compareToIgnoreCase(t.details);
	    if (comparison != equal) return comparison;

	    return equal; 
	}
}
























