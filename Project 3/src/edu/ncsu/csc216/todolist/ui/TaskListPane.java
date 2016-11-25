package edu.ncsu.csc216.todolist.ui;

import java.util.Observable;

import javax.swing.JTable;

import edu.ncsu.csc216.todolist.model.TaskList;

public class TaskListPane {
	
	private TaskTableModel ttm;

	private static final long serialVersionUID = -2210716111020406799L;

	private TaskList tasks;
	
	private JTable table;
	
	private int[] colWidths;

	public TaskListPane(TaskList tL) {
		
	}
	
	public TaskTableModel getTaskTableModel() {
		return this.ttm;
	}
	
	public JTable getTable() {
		return this.table;
	}
	
	private void initView() {
		//unimplemented
	}
	
	public void clearSelection() {
		//unimplemented
	}
	
	public void update(Observable o, Object arg) {
		//unimplemented
	}
}













