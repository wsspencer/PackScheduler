package edu.ncsu.csc216.todolist.ui;

import java.awt.Color;
import java.io.Serializable;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

import edu.ncsu.csc216.todolist.model.TaskList;
/**
 * This is a class used to display the pane of the task list in the GUI
 * @author Scott Spencer
 *
 */
public class TaskListPane extends JScrollPane implements Serializable, Observer {
	/** This is our instance of the TaskTableModel that we are working with */
	private TaskTableModel ttm;
	/** This is our long constant for the serial version UID this class will utilize */
	private static final long serialVersionUID = -2210716111020406799L;
	/** This is the instance of a list of Tasks that we will be working with */
	private TaskList tasks;
	/** This is the instance of a java table we will be working in */
	private JTable table;
	/** This is the variable we will use to hold the widths of the columns in the pane */
	//need columns for all our task fields
	private int[] colWidths = {100, 100, 100, 100, 100, 100, 100, 100};
	/**
	 * This is the constructor method we use to create a new instance of a TaskList pane
	 * @param tL the task list we want displayed
	 */
	public TaskListPane(TaskList tL) {
		super();
		this.tasks = tL;
		this.tasks.addObserver(this);
		ttm = new TaskTableModel(tasks.get2DArray());
		
		initView();
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
		//Associates the TaskTableModel with the JTable.
		table = new JTable(ttm);
		//Set up the column widths so the table is even
		for (int i = 0; i < colWidths.length; i++) {
			TableColumn col = table.getColumnModel().getColumn(i);
			col.setPreferredWidth(colWidths[i]);
		}
		//Set the table so that only one row can be selected at a time.
		table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		table.setFillsViewportHeight(false);
		setViewportView(table);
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	/**
	 * This is a void method used to clear the current selection in the GUI
	 */
	public void clearSelection() {
		table.clearSelection();;
		//won't need fillfields method like others since it's a list of non-editing objects
	}
	/**
	 * This is a void method used to update the view with the given params
	 * @param o the Observable we are updating the pane with
	 * @param arg the Object we are updating the pane with
	 */
	public void update(Observable o, Object arg) {
		if (o instanceof TaskList) {
			TaskList tL = (TaskList)o;
			//If there is a different number of rows, create a show new TaskTableModel.
			if (tL.size() != ttm.getRowCount()) {
				 ttm = new TaskTableModel(tL.get2DArray());
				 table.setModel(ttm);
			} else {
				//Otherwise, just update the values directly.
				Object[][] arr = tL.get2DArray();
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < ttm.getColumnCount(); j++) {
						ttm.setValueAt(arr[i][j], i, j);
					}
				}
			}
		}
	}
}













