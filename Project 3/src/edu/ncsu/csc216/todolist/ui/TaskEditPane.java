package edu.ncsu.csc216.todolist.ui;

import java.sql.Date;
import java.util.EventListener;
import java.util.Observable;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import edu.ncsu.csc216.todolist.model.Category;
import edu.ncsu.csc216.todolist.model.CategoryList;
import edu.ncsu.csc216.todolist.model.TaskList;

public class TaskEditPane {
	
	//instance
	private TaskData data;
	
	private static final long serialVersionUID = 5479139338455751629L;

	private CategoryList categories;
	
	private JTextField taskTitle;
	
	private JComboBox<Category> taskCat;
	
	private JTextArea taskDetails;
	
	private JSpinner taskStart;
	
	private JSpinner taskDue;
	
	private JSpinner taskCompleted;
	
	private JCheckBox complete;
	
	private boolean add;
	
	private boolean edit;
	
	public TaskEditPane(CategoryList list) {
		//unimplemented
	}
	
	public TaskEditPane(TaskData data, CategoryList list) {
		//unimplemented
	}
	
	private void init() {
		//unimplemented
	}
	
	private void initView() {
		//unimplemented
	}
	
	protected JSpinner getTaskStartSpinner() {
		return this.taskStart;
	}
	
	protected JSpinner getTaskDueSpinner() {
		return this.taskDue;
	}
	
	protected JSpinner getTaskCompletedSpinner() {
		return this.taskCompleted;
	}
	
	protected Date getTaskStart() {
		//unimplemented
		//make sure we imported the right date
		return null;
	}
	
	protected Date getTaskDue() {
		//unimplemented
		return null;
	}
	
	protected Date getTaskCompleted() {
		//unimplemented
		return null;
	}
	
	protected JTextField getTaskID() {
		//unimplemented
		return null;
	}
	
	protected JTextField getTaskTitle() {
		//unimplemented
		return null;
	}
	
	protected JComboBox<Category> getCategory() {
		//unimplemented
		return null;
	}
	
	protected JTextArea getTaskDetails() {
		//unimplemented
		return null;
	}
	
	protected JCheckBox getComplete() {
		//unimplemented
		return null;
	}
	
	protected void setTaskStart(Date start) {
		//unimplemented
	}
	
	protected void setTaskDue(Date due) {
		//unimplemented
	}
	
	protected void setTaskCompleted(Date completed) {
		//unimplemented
	}
	
	protected boolean isAddMode() {
		//unimplemented
		return false;
	}
	
	protected boolean isEditMode() {
		//unimplemented
		return false;
	}
	
	protected void enableAdd() {
		//unimplemented
	}
	
	protected void disableAdd() {
		//unimplemented
	}
	
	protected void enableEdit(TaskData data) {
		//unimplemented
	}
	
	protected void disableEdit() {
		//unimplemented
	}
	
	protected boolean fieldsNotEmpty() {
		//unimplemented
		return false;
	}
	
	protected void setTaskData(TaskData data) {
		//unimplemented
	}
	
	protected void addFieldListener(EventListener eL) {
		//unimplemented
	}
	
	protected void fillFields() {
		//unimplemented
	}
	
	protected void clearFields() {
		//unimplemented
	}
	
	protected TaskData getFields() {
		//unimplemented
		return null;
	}
	
	public void update(Observable o, Object arg) {
		//unimplemented
	}
}




















