package edu.ncsu.csc216.todolist.ui;

import java.io.Serializable;
import java.util.Date;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import edu.ncsu.csc216.todolist.model.Category;
/**
 * This is a UI class for displaying the table of tasks in the GUI
 * @author Scott Spencer
 *
 */
public class TaskTableModel implements Serializable, TableModel {
	/** This is our long constant for the serial version UID this class will utilize */
	private static final long serialVersionUID = 5954551753060998701L;
	/** This is a class variable for the table column names stored in an array of Strings */
	private String[] colNames;
	/** This is a class variable for storing the data in an easily accessible 2D array of objects */
	private Object[][] data;
	/**
	 * This is a constructor method used for creating an instance of the table of tasks with the parameterized data
	 * @param taskTableData the data we want displayed in the table
	 */
	public TaskTableModel(Object[][] taskTableData) {
		this.data = taskTableData;
		this.colNames = (String[]) this.data[0];
	}
	/**
	 * This is a simple getter method for retrieving the number of rows in the table
	 * @return integer representation of the number of rows in the table
	 */
	public int getRowCount() {
		//length should be the number of rows in the 2D array
		return this.data.length;
	}
	/**
	 * This is a simple getter method for retrieving the number of columns in the table
	 * @return integer representation of the number of columns in the table
	 */
	public int getColumnCount() {
		//length of the first row should be the number of columns
		return this.data[0].length;
	}
	/**
	 * This is a simple getter method for retrieving the value at a given row and column index
	 * @param rowIndex index of the row we want to find the data in
	 * @param colIndex index of the column we want to find the data in
	 * @return Object representation of the data stored at the given params
	 */
	public Object getValueAt(int rowIndex, int colIndex) {
		//simply call our 2D array of data at the given indexes
		return this.data[rowIndex][colIndex];
	}
	/**
	 * This is a simple setter method for setting the value of a given index with the given data
	 * @param data value we want to set at the index
	 * @param rowIndex index of the row we want the data set in
	 * @param colIndex index of the column we want the data set in
	 */
	public void setValueAt(Object data, int rowIndex, int colIndex) {
		this.data[rowIndex][colIndex] = data;
	}
	/**
	 * This is a simple getter method for retrieving the task data at a given row
	 * @param rowIndex the row index we want the data from
	 * @return TaskData the task data we want from the given index
	 */
	public TaskData getTaskRowData(int rowIndex) {
		TaskData temp = new TaskData(((String) this.data[rowIndex][0]), ((String) this.data[rowIndex][1]), ((Category) this.data[rowIndex][2]), 
				((Date) this.data[rowIndex][3]), ((Date) this.data[rowIndex][4]),
				((Date) this.data[rowIndex][5]), ((boolean) this.data[rowIndex][6]), ((String) this.data[rowIndex][7]));
		return temp;
	}
	/**
	 * This is a simple setter method for setting the data of a given row index to a given data
	 * @param rowIndex the index of the row we want set
	 * @param data the data we want to set to the given row
	 */
	public void setTaskRowData(int rowIndex, TaskData data) {
		this.data[rowIndex][0] = data.getTaskID();
		this.data[rowIndex][1] = data.getTitle();
		this.data[rowIndex][2] = data.getCategory();
		this.data[rowIndex][3] = data.getStartDateTime();
		this.data[rowIndex][4] = data.getDueDateTime();
		this.data[rowIndex][5] = data.getCompletedDateTime();
		this.data[rowIndex][6] = data.isCompleted();
		this.data[rowIndex][7] = data.getDetails();
	}
	@Override
	public void addTableModelListener(TableModelListener arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Class<?> getColumnClass(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getColumnName(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isCellEditable(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void removeTableModelListener(TableModelListener arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}













