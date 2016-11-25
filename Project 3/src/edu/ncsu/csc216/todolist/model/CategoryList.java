package edu.ncsu.csc216.todolist.model;

import java.io.Serializable;
import java.util.Observable;
import java.util.Observer;

import edu.ncsu.csc216.todolist.util.ArrayList;

/**
 * This is a class meant to define the methods and characteristics of a list of Categories
 * @author Scott Spencer
 *
 */
public class CategoryList extends Observable implements Tabular, Serializable, Observer {

	/** This is a class variable for the list of Categories in ArrayList form */
	private ArrayList list;
	/** This is our long constant for the serial version UID this class will utilize */
	private static final long serialVersionUID = 984509L;
	/** This is a String representation of the name of the category list instance */
	private String name;
	/** This is an integer class variable for the category number of the "next" category in line */
	private int nextCategoryNum;
	/**
	 * This is our constructor method for a new instance of a CategoryList
	 */
	public CategoryList() { 
		//unimplemented
	}
	/**
	 * This is a simple getter method for retrieving the name of this category list
	 * @return String representation of the category list's name
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * This is a boolean method for adding a category with the parameterized info and returning if
	 * the category was added or not.
	 * @param name a String representing the name of the category we want to add
	 * @param desc a String representing the description of the category we want to add
	 * @return boolean stating whether or not the category was added
	 */
	public boolean addCategory(String name, String desc) {
		//unimplemented
		return false;
	}
	/**
	 * This is a simple getter method for returning the category at the parameterized index
	 * @param index the index at which we want to return the category of.
	 * @return Category instance we want to retrieve from the list
	 */
	public Category getCategoryAt(int index) {
		//unimplemented
		return null;
	}
	/**
	 * This is an integer method used to return the index at which the category with the parameterized
	 * info is stored
	 * @param iD a String representing the unique identifier of the desired category we want the index of
	 * @return int index of the desired category
	 */
	public int indexOf(String iD) {
		//unimplemented
		return 0;
	}
	/**
	 * This is an integer method used to return the index at which a category of the parameterized name is stored
	 * @param name the name of the desired Category
	 * @return the index where the desired Category is stored
	 */
	public int indexOfName(String name) {
		//unimplemented
		return 0;
	}
	/**
	 * This is an integer method for returning the number of elements in this list
	 * @return integer representing how many elements are in this instance of the list
	 */
	public int size() {
		//unimplemented
		return 0;
	}
	/**
	 * This is a boolean method for returning whether or not the list is empty.
	 * @return boolean stating true/false if the list is/isn't empty
	 */
	public boolean isEmpty() {
		//unimplemented
		return false;
	}
	/**
	 * This is a Category method for removing a category at the given index from the list
	 * @param index the index at which the category we want to remove is stored
	 * @return Category the category stored at the parameterized index
	 */
	public Category removeCategoryAt(int index) {
		//unimplemented
		return null;
	}
	/**
	 * This is a boolean method for removing a category with the given identifier
	 * @param iD the unique identifier of the category we want to remove
	 * @return boolean stating whether or not the category was removed from the list
	 */
	public boolean removeCategory(String iD) {
		//unimplemented
		return false;
	}
	/**
	 * This is a simple getter method for retrieving the next category number in line
	 * @return int the integer representing the "number" of the next category in line
	 */
	private int getNextCategoryNum() {
		//unimplemented
		return 0;
	}
	/**
	 * This is avoid method for incrementing the "next" category number (for navigating the list)
	 */
	private void incNextCategoryNum() {
		this.nextCategoryNum++;
	}
	/**
	 * This is an Object[][] method for returning a 2D array of the data in the list
	 * @return Object[][] 2 dimensional array of data representing the data in the list
	 */
	@Override
	public Object[][] get2DArray() {
		// TODO Auto-generated method stub
		return null;
	} 
	/**
	 * This is a method for updating the list with the parameterized observable and object
	 * @param o the observable we want updated
	 * @param arg the object we want updated
	 */
	public void update(Observable o, Object arg) {
		//unimplemented
	}
}










