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
		//initialize our instance of an arraylist
		this.nextCategoryNum = 1;
		this.list = new ArrayList();
		this.name = "New List";
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
		Category c = new Category(name, desc, "C" + (this.getNextCategoryNum()));
		//increment nextCategoryNum since we used the current one as an identifier for "c"
		this.incNextCategoryNum();
		//add this instance as an observer to our "c" Category
		c.addObserver(this);
		//add "c" to our instance of an arraylist and return whether or not it was successful to do so
		this.list.add(c);
		
		if (this.list.contains(c)) {
			//notify the observers that the list has changed
			this.setChanged();
			this.notifyObservers();
			return true;
		}
		return false;
	}
	/**
	 * This is a simple getter method for returning the category at the parameterized index
	 * @param index the index at which we want to return the category of.
	 * @return Category instance we want to retrieve from the list
	 */
	public Category getCategoryAt(int index) {
		return (Category) this.list.get(index);
	}
	/**
	 * This is an integer method used to return the index at which the category with the parameterized
	 * info is stored
	 * @param iD a String representing the unique identifier of the desired category we want the index of
	 * @return int index of the desired category
	 */
	public int indexOf(String iD) {
		for (int i = 0; i < this.list.size(); i++) {
			//check if the category at the index of i has the same ID as the parameter
			if (((Category) this.list.get(i)).getCategoryID().equals(iD)) {
				return i;
			}
		}
		//return -1 if a category with that ID isn't found in the list
		return -1;
	}
	/**
	 * This is an integer method used to return the index at which a category of the parameterized name is stored
	 * @param name the name of the desired Category
	 * @return the index where the desired Category is stored
	 */
	public int indexOfName(String name) {
		for (int i = 0; i < this.list.size(); i++) {
			//check if the category at the index of i has the same name as the parameter
			if (((Category) this.list.get(i)).getName().equals(name)) {
				return i;
			}
		}
		//return -1 if a category with that name isn't found in the list
		return -1;
	}
	/**
	 * This is an integer method for returning the number of elements in this list
	 * @return integer representing how many elements are in this instance of the list
	 */
	public int size() {
		//unimplemented
		return this.list.size();
	}
	/**
	 * This is a boolean method for returning whether or not the list is empty.
	 * @return boolean stating true/false if the list is/isn't empty
	 */
	public boolean isEmpty() {
		if (this.size() == 0) {
			return true;
		}
		return false;
	}
	/**
	 * This is a Category method for removing a category at the given index from the list
	 * @param index the index at which the category we want to remove is stored
	 * @return Category the category stored at the parameterized index
	 */
	public Category removeCategoryAt(int index) {
		//call our instance of arraylist and return whether or not we were able to remove the parameterized
		//index from the arraylist
		Category temp = (Category) this.list.get(index);
		//delete the category as an observer and remove it from our list instance
		this.list.remove(index);
		temp.deleteObserver(this);
		//notify the observers of the change
		this.setChanged();
		this.notifyObservers();
		
		return temp;
	}
	/**
	 * This is a boolean method for removing a category with the given identifier
	 * @param iD the unique identifier of the category we want to remove
	 * @return boolean stating whether or not the category was removed from the list
	 */
	public boolean removeCategory(String iD) {
		//run the loop until we find a category ID equal to the parameter, if it is not found, return false
		for (int i = 0; i < this.list.size(); i++) {
			if (((Category) this.list.get(i)).getCategoryID().equals(iD)) {
				//remove the indexed category from our observer and remove it from the list.
				Category temp = (Category) this.list.get(i);
				this.list.remove(i);
				temp.deleteObserver(this);

				//notify the observers about it
				this.setChanged();
				this.notifyObservers();
				return true;
			}
		}
		return false;
	}
	/**
	 * This is a simple getter method for retrieving the next category number in line
	 * @return int the integer representing the "number" of the next category in line
	 */
	private int getNextCategoryNum() {
		return this.nextCategoryNum;
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
		//Returns an Object[][] array. Each row, i, contains a Category.
		//this will be what's printed to the GUI table
		Object[][] panel = new Object[this.list.size()][3];
		
		for (int i = 0; i < this.list.size(); i++) {
			panel[i][0] = ((Category) this.list.get(i)).getCategoryID();
			panel[i][1] = ((Category) this.list.get(i)).getName();
			panel[i][2] = ((Category) this.list.get(i)).getDescription();
		}
		return panel;
	} 
	/**
	 * This is a method for updating the list with the parameterized observable and object
	 * @param o the observable we want updated
	 * @param arg the object we want updated
	 */
	@Override
	public void update(Observable o, Object arg) {
		o.notifyObservers(arg);
	}

}










