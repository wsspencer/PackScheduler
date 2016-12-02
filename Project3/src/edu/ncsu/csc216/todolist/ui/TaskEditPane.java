package edu.ncsu.csc216.todolist.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.io.Serializable;
import java.sql.Date;
import java.util.EventListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentListener;

import edu.ncsu.csc216.todolist.model.Category;
import edu.ncsu.csc216.todolist.model.CategoryList;
/**
 * This is a class used to display the pane we use to edit tasks
 * @author Scott Spencer
 *
 */
//EXTEND COMPONENT OR JPANEL....FIGURE OUT WHICH YOU SHOULD USE AND WHICH WORKS BEST
public class TaskEditPane extends JPanel implements Serializable, Observer {
	/**
	 * This is a nested helper class for our jspinners to have a model of how they should look and behave (and format the date)
	 * @author Scott Spencer
	 *
	 */
	private class SpinnerDateModel {
		
	}
	
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
		//call the constructor with a default value for data and the parameterized list
		this(new TaskData("", "", null, null, null, null, false, ""), list);
	}
	/**
	 * This is a constructor method for creating an instance of TaskEditPane with the given parameter
	 * @param list the Category List of the task we are trying to edit
	 * @param data the Task Data of the task we are trying to edit
	 */
	public TaskEditPane(TaskData data, CategoryList list) {
		//call the super method, set the data for taskdata, set the list for our category list, set it to neither add nor edit mode, and call
		//the initializer method
		super();
		this.data = data;
		this.categories = list;
		this.add = false;
		this.edit = false;
		//initialize our instances of some of the spinners and fields the GUI will use
		this.taskCat = new JComboBox<Category>();
		this.taskTitle = new JTextField(data.getTitle());
		//create these from the nested class you added
		this.taskStart = new JSpinner();
		this.taskCompleted = new JSpinner();
		this.taskDue = new JSpinner();
		this.complete = new JCheckBox();
		this.taskDetails = new JTextArea();
		init();
	}
	/**
	 * This is a void method for initializing the pane
	 */
	private void init() {
		//set our layout and border for the panel, call our initiate view method, and fill our empty fields

		//these are methods used in category edit pane.  It extends jpanel instead of component so it can call these methods...You need to figure out what the component equivalent is to these jpanel methods
		//setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		//setBorder(BorderFactory.createLineBorder(Color.black));
		initView();
		fillFields();
	}
	/**
	 * This is a void method for initializing the view of the pane
	 */
	private void initView() {
		//set up our initial view of the pane
		//Add the ID texfield with label to the pane
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEADING));
		p.add(new JLabel("Task ID: ", SwingConstants.LEFT));
		p.add(getTaskID());
		this.add(p);
		//add the Task name textfield to the pane
		p = new JPanel(new FlowLayout(FlowLayout.LEADING));
		p.add(new JLabel("Task Name: ", SwingConstants.LEFT));
		p.add(getTaskTitle());
		this.add(p);
		//add the Task category JComboBox to the pane
		p = new JPanel(new FlowLayout(FlowLayout.LEADING));
		p.add(new JLabel("Task Category: ", SwingConstants.LEFT));
		p.add(getCategory());
		this.add(p);
		//add the Task start date JSpinner to the pane
		p = new JPanel(new FlowLayout(FlowLayout.LEADING));
		p.add(new JLabel("Task Start Date: ", SwingConstants.LEFT));
		p.add(getTaskStartSpinner());
		this.add(p);
		//add the Task due date JSpinner to the pane
		p = new JPanel(new FlowLayout(FlowLayout.LEADING));
		p.add(new JLabel("Task Due Date: ", SwingConstants.LEFT));
		p.add(getTaskDueSpinner());
		this.add(p);
		//add the Task completed date JSpinner to the pane
		p = new JPanel(new FlowLayout(FlowLayout.LEADING));
		p.add(new JLabel("Task Completion Date: ", SwingConstants.LEFT));
		p.add(getTaskCompletedSpinner());
		this.add(p);
		//add the Task completed status checkbox to the pane
		p = new JPanel(new FlowLayout(FlowLayout.LEADING));
		p.add(new JLabel("Task Completion Status: ", SwingConstants.LEFT));
		p.add(getComplete());
		this.add(p);
		//add the Task details JTextArea to the pane
		p = new JPanel(new FlowLayout(FlowLayout.LEADING));
		p.add(new JLabel("Task Details: ", SwingConstants.LEFT));
		this.add(p);
		p = new JPanel(new FlowLayout(FlowLayout.LEADING));
		p.add(getTaskDetails());
		this.add(p);
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
		//get value from the task start Jspinner
		return (Date) this.taskStart.getValue();
	}
	/**
	 * This is a simple getter method for retrieving the Date of the due date and time
	 * @return Date the task due date and time
	 */
	protected Date getTaskDue() {
		//get value from the task start 
		return (Date) this.taskDue.getValue();
	}
	/**
	 * This is a simple getter method for retrieving the Date of the completed date and time
	 * @return Date the task completed date and time
	 */
	protected Date getTaskCompleted() {
		//unimplemented
		return (Date) this.taskCompleted.getValue();
	}
	/**
	 * This is a simple getter method for retrieving the unique identifier of the task we are editing
	 * @return JTextField of the task unique identifier
	 */
	protected JTextField getTaskID() {
		//make a jtextfield out of the string from data's ID
		return new JTextField(this.data.getTaskID());
	}
	/**
	 * This is a simple getter method for retrieving the title of the task we are editing
	 * @return JTextField of the task title
	 */
	protected JTextField getTaskTitle() {
		//make a jtextfield out of the string from data's Title
		return this.taskTitle;
	}
	/**
	 * This is a simple getter method for retrieving the category of the task we are editing
	 * @return JComboBox (category specific) of the task category
	 */
	protected JComboBox<Category> getCategory() {
		//return our instance of a category object jcombobox
		return this.taskCat;
	}
	/**
	 * This is a simple getter method for retrieving the task details  of the task we are trying to edit
	 * @return JTextArea of the task details test
	 */
	protected JTextArea getTaskDetails() {
		//return our instance of the task's details
		return this.taskDetails;
	}
	/**
	 * This is a simple getter method for retrieving the task completion status of the task we are trying to edit
	 * @return JCheckBox of the task completion status test
	 */
	protected JCheckBox getComplete() {
		//return our instance of a jcheckbox
		return this.complete;
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
		//return add mode instance
		return add;
	}
	/**
	 * This is a boolean method for if the pane is in edit mode
	 * @return boolean stating whether or not the pane is in edit mode
	 */
	protected boolean isEditMode() {
		//return edit mode instance
		return edit;
	}
	/**
	 * This is a void method for enabling the add mode 
	 */
	protected void enableAdd() {
		//set add mode instance to true
		this.add = true;
	}
	/**
	 * This is a void method for disabling the add mode
	 */
	protected void disableAdd() {
		//set add mode instance to false
		this.add = false;
	}
	/**
	 * This is a void method for enabling the edit mode
	 * @param data the data of the task we want in edit mode
	 */
	protected void enableEdit(TaskData data) {
		//set the task data to the parameter and set edit mode instance to true
		this.data = data;
		this.edit = true;
	}
	/**
	 * This is a void method for disabling the edit mode
	 */
	protected void disableEdit() {
		//set edit mode instance to false
		this.edit = false;
	}
	/**
	 * This is a boolean method for whether or not the field is not empty
	 * @return whether or not the fields are not empty
	 */
	protected boolean fieldsNotEmpty() {
		//unimplemented
		return getTaskTitle().getDocument().getLength() != 0 && 
				//all the other fields we are checking whether or not 
				getTaskDetails().getDocument().getLength() != 0;
	}
	/**
	 * This is a simple setter method for setting the task data to the parameter
	 * @param data the TaskData we want to associate with the selected task
	 */
	protected void setTaskData(TaskData data) {
		this.data = data;
	}
	/**
	 * This is a void method for adding field listener to the selected task
	 * @param eL the event listener we want detecting events performed on the field
	 */
	protected void addFieldListener(EventListener eL) {
		//casting event listener to document listener..does documentlistener extend eventlistener?  these are just text oriented ones so you'll probably need other listeners for spinner and combobox and the like
		getTaskTitle().getDocument().addDocumentListener((DocumentListener) eL);
		//other events we want to listen to
		getTaskDetails().getDocument().addDocumentListener((DocumentListener) eL);
	}
	/**
	 * This is a void method for filling the text fields
	 */
	protected void fillFields() {
		if (null == data) {
			//task id will be what taskID is (don't think it needs to be filled...)
			taskTitle.setText("");
			taskDetails.setText("");
			taskTitle.setEditable(false);
			taskDetails.setEditable(false);
			
			//do I ned to fill fields of category, start/due/comp dates, completion status, etc?  if you do, make sure the else statements use them too
		}
		else {
			taskTitle.setText(data.getTitle());
			taskDetails.setText(data.getDetails());
		}
		if (add || edit) {
			taskTitle.setEditable(true);
			taskDetails.setEditable(true);
		}
	}
	/**
	 * This is a void method for clearing the text fields
	 */
	protected void clearFields() {
		data = null;
		fillFields();
	}
	/**
	 * This is simple getter method for retrieving the fields of the selected task int TaskData form
	 * @return TaskData representation of the fields of the selected task
	 */
	protected TaskData getFields() {
		//gather the information in the fields
		return new TaskData(getTaskID().getText(), getTaskTitle().getText(), (Category) getCategory().getSelectedItem(), getTaskStart(), getTaskDue(), getTaskCompleted(),
				 getComplete().isSelected(), getTaskDetails().getText());
	}
	/**
	 * This is a void method for updating the pane with the parameterized observable and object
	 * @param o the Observable we want to update the pane with
	 * @param arg the object we want to update the pane with
	 */
	public void update(Observable o, Object arg) {
		o.notifyObservers(arg);
	}
}




















