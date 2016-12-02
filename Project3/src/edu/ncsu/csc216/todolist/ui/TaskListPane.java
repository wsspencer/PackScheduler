package edu.ncsu.csc216.todolist.ui;

import java.awt.Component;
import java.io.Serializable;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JTable;

import edu.ncsu.csc216.todolist.model.TaskList;
/**
 * This is a class used to display the pane of the task list in the GUI
 * @author Scott Spencer
 *
 */
public class TaskListPane extends Component implements Serializable, Observer {
	/** This is our instance of the TaskTableModel that we are working with */
	private TaskTableModel ttm;
	/** This is our long constant for the serial version UID this class will utilize */
	private static final long serialVersionUID = -2210716111020406799L;
	/** This is the instance of a list of Tasks that we will be working with */
	private TaskList tasks;
	/** This is the instance of a java table we will be working in */
	private JTable table;
	/** This is the variable we will use to hold the widths of the columns in the pane */
	private int[] colWidths;
	/**
	 * This is the constructor method we use to create a new instance of a TaskList pane
	 * @param tL the task list we want displayed
	 */
	public TaskListPane(TaskList tL) {
		this.ttm = new TaskTableModel(tasks.get2DArray());
		this.table = new JTable(this.ttm);
	}
	/**
	 * This is a simple getter method for returning our instance of the task table model
	 * @return TaskTableModel that is our instance of task table model
	 */
	public TaskTableModel getTaskTableModel() {
		return this.ttm;
	}
	/**
	 * This is a simple getter method used to return the java table we are working with
	 * @return JTable of the table we are working in
	 */
	public JTable getTable() {
		return this.table;
	}
	/**
	 * This is a void method for initializing our view of the pane
	 */
	private void initView() {
		//unimplemented
	}
	/**
	 * This is a void method used to clear the current selection in the GUI
	 */
	public void clearSelection() {
		//unimplemented
	}
	/**
	 * This is a void method used to update the view with the given params
	 * @param o the Observable we are updating the pane with
	 * @param arg the Object we are updating the pane with
	 */
	public void update(Observable o, Object arg) {
		//unimplemented
	}
}













