package edu.ncsu.csc216.todolist.ui;

import java.io.Serializable;
/**
 * This is a UI class for displaying the table of tasks in the GUI
 * @author Scott Spencer
 *
 */
public class TaskTableModel implements Serializable {
	/** This is our long constant for the serial version UID this class will utilize */
	private static final long serialVersionUID = 5954551753060998701L;
	/** This is a class variable for the table column names stored in an array of Strings */
	private String[] colNames;
	/** This is a class variable for storing the data in an easily accessible 2D array of objects */
	private Object[][] data;
	/**
	 * This is a constructor method used for creating an instance of the tabl eof tasks with the parameterized data
	 * @param taskTableData the data we want displayed in the table
	 */
	public TaskTableModel(Object[][] taskTableData) {
		//unimplemented
	}
	/**
	 * This is a simple getter method for retrieving the number of rows in the table
	 * @return integer representation of the number of rows in the table
	 */
	public int getRowCount() {
		//unimplemented
		return 0;
	}
	/**
	 * This is a simple getter method for retrieving the number of columns in the table
	 * @return integer representation of the number of columns in the table
	 */
	public int getColumnCount() {
		//unimplemented
		return 0;
	}
	/**
	 * This is a simple getter method for retrieving the value at a given row and column index
	 * @param rowIndex index of the row we want to find the data in
	 * @param colIndex index of the column we want to find the data in
	 * @return Object representation of the data stored at the given params
	 */
	public Object getValueAt(int rowIndex, int colIndex) {
		//unimplemented
		return null;
	}
	/**
	 * This is a simple setter method for setting the value of a given index with the given data
	 * @param data value we want to set at the index
	 * @param rowIndex index of the row we want the data set in
	 * @param colIndex index of the column we want the data set in
	 */
	public void setValueAt(Object data, int rowIndex, int colIndex) {
		//unimplemented
	}
	/**
	 * This is a simple getter method for retrieving the task data at a given row
	 * @param rowIndex the row index we want the data from
	 * @return TaskData the task data we want from the given index
	 */
	public TaskData getTaskRowData(int rowIndex) {
		//unimplemented
		return null;
	}
	/**
	 * This is a simple setter method for setting the data of a given row index to a given data
	 * @param rowIndex the index of the row we want set
	 * @param data the data we want to set to the given row
	 */
	public void setTaskRowData(int rowIndex, TaskData data) {
		//unimplemented
	}
	
	
}













