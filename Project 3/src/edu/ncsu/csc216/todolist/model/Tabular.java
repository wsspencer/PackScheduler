package edu.ncsu.csc216.todolist.model;
/**
 * This is an interface used to ensure the classes that implement it have a method
 * to retrieve their data in the form of a 2D object array.
 * @author Scott Spencer
 *
 */
public interface Tabular {

	/**
	 * This is a method for returning a 2D array of objects representing the data in 
	 * a given class
	 * @return Object[][] a 2D array representation of the data in the list
	 */
	public Object[][] get2DArray();
}
