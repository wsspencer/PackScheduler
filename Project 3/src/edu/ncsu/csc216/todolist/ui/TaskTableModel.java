package edu.ncsu.csc216.todolist.ui;

import java.io.Serializable;

public class TaskTableModel implements Serializable {

	private static final long serialVersionUID = 5954551753060998701L;

	private String[] colNames;
	
	private Object[][] data;
	
	public TaskTableModel(Object[][] taskTableData) {
		//unimplemented
	}
	
	public int getRowCount() {
		//unimplemented
		return 0;
	}
	
	public int getColumnCount() {
		//unimplemented
		return 0;
	}
	
	public Object getValueAt(int rowIndex, int colIndex) {
		//unimplemented
		return null;
	}
	
	public void setValueAt(Object data, int rowIndex, int colIndex) {
		//unimplemented
	}
	
	public TaskData getTaskRowData(int rowIndex) {
		//unimplemented
		return null;
	}
	
	public void setTaskRowData(int rowIndex, TaskData data) {
		//unimplemented
	}
	
	
}













