package edu.ncsu.csc216.todolist.ui;

import java.awt.Component;
import java.io.Serializable;
import java.sql.Date;
import java.util.EventListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import edu.ncsu.csc216.todolist.model.Category;
import edu.ncsu.csc216.todolist.model.CategoryList;
import edu.ncsu.csc216.todolist.model.TaskList;
/**
 * This is a class used to display the pane we use to edit tasks
 * @author Scott Spencer
 *
 */
public class TaskEditPane extends Component implements Serializable, Observer {
	
	//instance
	/** This is our instance of the task data of the task we are working with */
	private TaskData data;
	/** This is our long constant for the serial version UID this class will utilize */
	private static final long serialVersionUID = 5479139338455751629L;
	/** This is the instance of Category List we are working with for this task */
	private CategoryList categories;
	/** This is the class variable for the text field for our tasks title */
	private JTextField taskTitle;
	/** This is the variable for the combo box we are using to store the selections for task categories */
	private JComboBox<Category> taskCat;
	/** This is the variable for storing the text area for task details */
	private JTextArea taskDetails;
	/** This is the spinner we are using for setting the task start time and date */ 
	private JSpinner taskStart;
	/** This is the spinner we are using for setting the task due time and date */ 
	private JSpinner taskDue;
	/** This is the spinner we are using for setting the task completed time and date */ 
	private JSpinner taskCompleted;
	/** This is the variable for the check box of whether or not the task is complete */
	private JCheckBox complete;
	/** This is a variable for whether or not the task can add */
	private boolean add;
	/** This is a variable for whether or not the task can edit */
	private boolean edit;
	/**
	 * This is a constructor method for creating an instance of TaskEditPane with the given parameter
	 * @param list the Category List of the task we are trying to edit
	 */
	public TaskEditPane(CategoryList list) {
		//unimplemented
	}
	/**
	 * This is a constructor method for creating an instance of TaskEditPane with the given parameter
	 * @param list the Category List of the task we are trying to edit
	 * @param data the Task Data of the task we are trying to edit
	 */
	public TaskEditPane(TaskData data, CategoryList list) {
		//unimplemented
	}
	/**
	 * This is a void method for initializing the pane
	 */
	private void init() {
		//unimplemented
	}
	/**
	 * This is a void method for initializing the view of the pane
	 */
	private void initView() {
		//unimplemented
	}
	/**
	 * This is a simple getter method for retrieving the spinner of the start date and time
	 * @return JSpinner of the task start date and time
	 */
	protected JSpinner getTaskStartSpinner() {
		return this.taskStart;
	}
	/**
	 * This is a simple getter method for retrieving the spinner of the due date and time
	 * @return JSpinner of the task due date and time
	 */
	protected JSpinner getTaskDueSpinner() {
		return this.taskDue;
	}
	/**
	 * This is a simple getter method for retrieving the spinner of the completed date and time
	 * @return JSpinner of the task completed date and time
	 */
	protected JSpinner getTaskCompletedSpinner() {
		return this.taskCompleted;
	}
	/**
	 * This is a simple getter method for retrieving the Date of the start date and time
	 * @return Date the task start date and time
	 */
	protected Date getTaskStart() {
		//unimplemented
		//make sure we imported the right date
		return null;
	}
	/**
	 * This is a simple getter method for retrieving the Date of the due date and time
	 * @return Date the task due date and time
	 */
	protected Date getTaskDue() {
		//unimplemented
		return null;
	}
	/**
	 * This is a simple getter method for retrieving the Date of the completed date and time
	 * @return Date the task completed date and time
	 */
	protected Date getTaskCompleted() {
		//unimplemented
		return null;
	}
	/**
	 * This is a simple getter method for retrieving the unique identifier of the task we are editing
	 * @return JTextField of the task unique identifier
	 */
	protected JTextField getTaskID() {
		//unimplemented
		return null;
	}
	/**
	 * This is a simple getter method for retrieving the title of the task we are editing
	 * @return JTextField of the task title
	 */
	protected JTextField getTaskTitle() {
		//unimplemented
		return null;
	}
	/**
	 * This is a simple getter method for retrieving the category of the task we are editing
	 * @return JComboBox (category specific) of the task category
	 */
	protected JComboBox<Category> getCategory() {
		//unimplemented
		return null;
	}
	/**
	 * This is a simple getter method for retrieving the task details  of the task we are trying to edit
	 * @return JTextArea of the task details test
	 */
	protected JTextArea getTaskDetails() {
		//unimplemented
		return null;
	}
	/**
	 * This is a simple getter method for retrieving the task completion status of the task we are trying to edit
	 * @return JCheckBox of the task completion status test
	 */
	protected JCheckBox getComplete() {
		//unimplemented
		return null;
	}
	/**
	 * This is a simple setter method for setting the task start date and time
	 * @param start This is the date storing the time and date of the task's start time
	 */
	protected void setTaskStart(Date start) {
		//unimplemented
	}
	/**
	 * This is a simple setter method for setting the task due date and time
	 * @param due This is the date storing the time and date of the task's due time
	 */
	protected void setTaskDue(Date due) {
		//unimplemented
	}
	/**
	 * This is a simple setter method for setting the task completed date and time
	 * @param completed This is the date storing the time and date of the task's completed time
	 */
	protected void setTaskCompleted(Date completed) {
		//unimplemented
	}
	/**
	 * This is a boolean method for if the pane is in add mode
	 * @return boolean stating whether or not the pane is in add mode
	 */
	protected boolean isAddMode() {
		//unimplemented
		return false;
	}
	/**
	 * This is a boolean method for if the pane is in edit mode
	 * @return boolean stating whether or not the pane is in edit mode
	 */
	protected boolean isEditMode() {
		//unimplemented
		return false;
	}
	/**
	 * This is a void method for enabling the add mode 
	 */
	protected void enableAdd() {
		//unimplemented
	}
	/**
	 * This is a void method for disabling the add mode
	 */
	protected void disableAdd() {
		//unimplemented
	}
	/**
	 * This is a void method for enabling the edit mode
	 * @param data the data of the task we want in edit mode
	 */
	protected void enableEdit(TaskData data) {
		//unimplemented
	}
	/**
	 * This is a void method for disabling the edit mode
	 */
	protected void disableEdit() {
		//unimplemented
	}
	/**
	 * This is a boolean method for whether or not the field is not empty
	 * @return whether or not the fields are not empty
	 */
	protected boolean fieldsNotEmpty() {
		//unimplemented
		return false;
	}
	/**
	 * This is a simple setter method for setting the task data to the parameter
	 * @param data the TaskData we want to associate with the selected task
	 */
	protected void setTaskData(TaskData data) {
		//unimplemented
	}
	/**
	 * This is a void method for adding field listener to the selected task
	 * @param eL the event listener we want detecting events performed on the field
	 */
	protected void addFieldListener(EventListener eL) {
		//unimplemented
	}
	/**
	 * This is a void method for filling the text fields
	 */
	protected void fillFields() {
		//unimplemented
	}
	/**
	 * This is a void method for clearing the text fields
	 */
	protected void clearFields() {
		//unimplemented
	}
	/**
	 * This is simple getter method for retrieving the fields of the selected task int TaskData form
	 * @return TaskData representation of the fields of the selected task
	 */
	protected TaskData getFields() {
		//unimplemented
		return null;
	}
	/**
	 * This is a void method for updating the pane with the parameterized observable and object
	 * @param o the Observable we want to update the pane with
	 * @param arg the object we want to update the pane with
	 */
	public void update(Observable o, Object arg) {
		//unimplemented
	}
}




















