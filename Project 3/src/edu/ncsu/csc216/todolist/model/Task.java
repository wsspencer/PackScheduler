package edu.ncsu.csc216.todolist.model;

import java.io.Serializable;
import java.util.Date;

public class Task implements Serializable {

	private Category category;

	private static final long serialVersionUID = 7459L;
	
	private String title;
	
	private String details;
	
	//make sure you're importing the right "Date"
	private Date startDateTime;
	
	private Date dueDateTime;
	
	private Date completedDateTime;
	
	private boolean completed;
	
	private String taskID;
	
	public Task(String title, String details, Date startDateTime, Date endDateTime, Category c, String id) {
		//unimplemented
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		//unimplemented
	}
	
	public String getDetails() {
		return this.details;
	}
	
	public void setDetails(String details) {
		//unimplemented
	}
	
	public Date getStartDateTime() {
		return this.startDateTime;
	}
	
	public void setStartDateTime(Date startDate) {
		//unimplemented
	}
	
	public Date getDueDateTime() {
		return this.dueDateTime;
	}
	
	public void setDueDateTime(Date dueDate) {
		//unimplemented
	}
	
	public Date getCompletedDateTime() {
		return this.completedDateTime;
	}
	
	public void setCompletedDateTime(Date compDate) {
		//unimplemented
	}
	
	public boolean isCompleted() {
		return this.completed;
	}
	
	public void setCompleted(boolean compStatus) {
		//unimplemented
	}
	
	public void setCategory(Category c) {
		//unimplemented
	}
	
	public Category getCategory() {
		return this.getCategory();
	}
	
	public String getTaskID() {
		return this.taskID;
	}
	
	private void setTaskID(String iD) {
		//unimplemented
	}
	
	public boolean equals(Object o) {
		//unimplemented
		return false;
	}
	
	public int hashCode() {
		//unimplemented
		return 0;
	}
	
	public int compareTo(Task t) {
		//unimplemented
		return 0;
	}
}
























