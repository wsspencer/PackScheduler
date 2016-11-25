package edu.ncsu.csc216.todolist.util;

/**
 * This is an interface used to ensure the classes that implement it use the methods
 * therein
 * @author Scott Spencer
 *
 */
public interface List {
	/**
	 * This is a method used to return the number of elements stored in a list
	 * @return integer representation of the number of elements in a list
	 */
	public int size();
	/**
	 * This is a boolean method for returning whether or not a list is empty
	 * @return boolean stating whether or not the list has an element in it
	 */
	public boolean isEmpty();
	/**
	 * This is a method used to return whether or not the list contains the given object
	 * @param o the object we want to know whether or not list contains
	 * @return boolean stating whether or not the list contains the object
	 */
	public boolean contains(Object o);
	/**
	 * This is a method for adding an element to the list
	 * @param o the data we want added to the list
	 * @return boolean stating true or false whether or not the object is added
	 */
	public boolean add(Object o);
	/**
	 * This is a simple getter method for retrieving the data stored in a given index
	 * @param index the index where the element we want is stored in the list
	 * @return Object stored at the given index
	 */
	public Object get(int index);
	/**
	 * This is a voided method for adding the parameterized object to the parameterized index
	 * @param index the number in the list we want the object added to
	 * @param o the object we want to add to the list
	 */
	public void add(int index, Object o);
	/**
	 * This is an Object method for removing the object at a given index from the list
	 * @param index we want the data removed from
	 * @return Object the object that is removed from the list
	 */
	public Object remove(int index);
	/**
	 * This is an integer method for returning the index where the parameterized object is found
	 * @param o the Object that we want the index of
	 * @return int the index of the list that the object is stored in
	 */
	public int indexOf(Object o);
}
