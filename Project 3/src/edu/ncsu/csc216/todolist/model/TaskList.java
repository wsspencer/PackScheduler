package edu.ncsu.csc216.todolist.model;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;

import edu.ncsu.csc216.todolist.util.LinkedList;

public class TaskList extends Observable implements Tabular, Observer {

	private LinkedList list;
	
	private static final long serialVersionUID = 98734509L;
	
	private String name;
	
	private int nextTaskNum;
	
	private String taskListID;
	
	public TaskList(String listName, String listId) {
		//unimplemented
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String newName) {
		//unimplemented
	}

	public String getTaskListID() {
		return this.taskListID;
	}
	
	private void setTaskListID(int newId) {
		//unimplemented
	}
	
	private int getNextTaskNum() {
		return this.nextTaskNum;
	}
	
	private void incNextTaskNum() {
		this.nextTaskNum++;
	}
	
	public boolean addTask(String title, String details, Date startDateTime, Date endDateTime, Category c) {
		//unimplemented
		//Make sure I imported the correct date....sql or java.util?
		return false;
	}
	
	public Task getTaskAt(int taskNum) {
		//unimplemented
		return null;
	}
	
	public int indexOf(String taskTitle) {
		//unimplemented
		return 0;
	}
	
	public int size() {
		//unimplemented
		return 0;
	}
	
	public boolean isEmpty() {
		//unimplemented
		return false;
	}
	
	public Task removeTaskAt(int taskNum) {
		//unimplemented
		return null;
	}
	
	public boolean removeTask(String taskTitle) {
		//unimplemented
		return false;
	}
	
	public Object[][] get2DArray() {
		//unimplemented
		return null;
	}
	
	public void update(Observable o, Object arg) {
		//unimplemented
	}
}
















