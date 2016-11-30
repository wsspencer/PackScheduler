package edu.ncsu.csc216.todolist.model;

import java.io.Serializable;
import java.util.Observable;

/**
 * This is a class meant to represent the properties and characteristics of a Category.
 * @author Scott Spencer
 *
 */
public class Category extends Observable implements Serializable {
	/** This is our long constant for the serial version UID this class will utilize */
	private static final long serialVersionUID = 459188L;
	/** This is the class variable for a category's name */
	private String name;
	/** This is the class variable for a category's description */
	private String description;
	/** This is the class variable for a category's unique identifier */
	private String categoryID;
	/**
	 * This is our constructor method for a Category
	 * @param name The String representation of a category's name
 	 * @param desc The String representation of a category's description
	 * @param id The String representation of a category's unique identifier
	 */
	public Category(String name, String desc, String id) {
		//unimplemented
	}
	/**
	 * This is a simple getter method for our category's name
	 * @return String representation of the name
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * This is a simple setter methoe for putting a value to our category's name variable
	 * @param name String representation of the name we want our category to have
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * This is a simple getter method for retrieving our category's description variable
	 * @return String representation of the description
	 */
	public String getDescription() {
		return this.description;
	}
	/**
	 * This is a simple setter method for our category's description
	 * @param desc the String value we want our description variable to have
	 */
	public void setDescription(String desc) {
		this.description = desc;
	}
	/**
	 * This is a simple getter method for retrieving our category's unique identifier
	 * @return String representation of the unique identifier
	 */
	public String getCategoryID() {
		return this.categoryID;
	}
	/**
	 * This is a simple setter method for setting our category's unique identifier to the desired value
	 * @param id String representation of the value we want our ID variable to have
	 */
	private void setCategoryID(String id) {
		this.categoryID = id;
	}
	/**
	 * This is a boolean method for returning whether or not our category equals the parameterized object
	 * @param obj the Object we want to compare to
	 * @return boolean a boolean representing whether the two objects are equal
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	/**
	 * This is an integer method used for comparing this instance of a Category to another
	 * @param c the Category we want to compare our instance to
	 * @return int representing our comparison
	 */
	public int compareTo(Category c) {
		//unimplemented
		return 0;
	}
	/**
	 * This is an integer method used for generating hash code
	 * @return int hashed code
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	/**
	 * This is a String method for generating a String represenation of our category's data
	 * @return String representation of our Category
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	
}














