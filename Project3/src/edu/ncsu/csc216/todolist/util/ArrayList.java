package edu.ncsu.csc216.todolist.util;

import java.io.Serializable;
import java.util.Arrays;

/**
 * This is a class used to define the methods and characteristics of a custom ArrayList
 * @author Scott Spencer
 * @param E abstract object used to define what this will be an arraylist of
 *
 */
public class ArrayList implements List, Serializable {
	/** This is our long constant for the serial version UID this class will utilize */
	private static final long serialVersionUID = 28592L;
	/** This is a class variable of an integer we use to resize the list */
	private static final int RESIZE = 10;
	/** This is a class variable used to store the elements of the list in an Object array */
	private Object[] list;
	/** This is a class variable used to store the size of the list */
	private int size;
	/**
	 * This is a constructor method used to create a new instance of an ArrayList
	 */
	public ArrayList() {
		this(RESIZE);
	}
	/**
	 * This is a constructor method used to create a new instance of an ArrayList of a specific size
	 * @param initSize integer representation of the number of elements in the list
	 */
	public ArrayList(int initSize) {
		//unimplemented
		//not sure if size is correct param
		this.list = new Object[initSize];
		this.size = initSize;
	}

	/**
	 * This is an integer method for returning the size of the list
	 * @return int representing the number of elements in the list
	 */
	@Override
	public int size() {
		return this.size;
//		int size = 0;
//		for (int i = 0; i < this.list.length; i++) {
//			if (this.list[i] != null) {
//				size++;
//			}
//		}
//		return size;
	}
	/**
	 * This is a boolean method for returning whether the list has any elements in it
	 * @return boolean stating whether or not the list is empty
	 */
	@Override
	public boolean isEmpty() {
		if (this.size == 0) {
			return true;
		}
		return false;
		//this will be our check to see if there are any elements in our array of objects
//		boolean emptyCheck = true;
		//this will loop for the entirety of our array and check each index to see if it holds a value
//		for (int i = 0; i < this.list.length; i++) {
//			if (this.list[i] != null) {
				//updates our emptycheck to false if the index at i in our array holds a value
//				emptyCheck = false;
//			}
//		}
//		return emptyCheck;
	}
	/**
	 * This is a boolean method for checking if the list contains a certain object
	 * @param o the object we want to know is in a node in the list or not
	 * @return boolean stating if the list contains the element
	 */
	@Override
	public boolean contains(Object o) {
		//this will be our check to see if an element in our array is equal to the parameter
		boolean contains = false;
		// this will loop for the entirety of our array and check each index for objects equal to our parameter
		for (int i = 0; i < this.list.length; i++) {
			if (this.list[i] == o) {
				//updates our contain check to true if the object at i is equal to our parameter
				contains = true;
			}
		}
		return contains;
	}
	/**
	 * This is a boolean method for adding an element to the list
	 * @param o the Object we want added to the list
	 * @return boolean stating whether or not the element was added
	 */
	@Override
	public boolean add(Object o) {
		//MUST occur before the check if index > size, so we know if we need to grow the array or not
		//variable to count non-null elements in list
		int counter = 0;
		for (int i = 0; i < this.size(); i++) {
			if (this.get(i) != null) {
				counter++;
			}
		}
		//ensures capacity doubles if size reaches the cap.
		if (counter == this.size()) {
			this.size = this.size + RESIZE; 
			this.list = Arrays.copyOf(this.list, this.size());
		}	
		if (o == null) {
			return false;
		}
		int i = 0;
		//walks the list array until we get our first empty slot (should be the end of the list
		while (this.list[i] != null) {
			i++;
		}
		//add our parameter to index at integer i
		this.add(i, o);
		return true;
	}
	/**
	 * This is an Object method for retrieving an Object stored at a given index
	 * @param index integer representing the index we want the object at
	 * @return Object at the given index
	 */
	@Override
	public Object get(int index) {
		return this.list[index];
	}
	/**
	 * This is a void method used to add an element to a specific index in the list
	 * @param index the place in the list we want to add an object to
	 * @param o the object we want to add to the list
	 */
	@Override
	public void add(int index, Object o) {
		//MUST occur before the check if index > size, so we know if we need to grow the array or not
		//variable to count non-null elements in list
		int counter = 0;
		for (int i = 0; i < this.size(); i++) {
			if (this.get(i) != null) {
				counter++;
			}
		}
		//ensures capacity doubles if size reaches the cap.
		if (counter == this.size()) {
			this.size = this.size + RESIZE; 
			this.list = Arrays.copyOf(this.list, this.size());
		}	
		
		if (index < 0 || index >= this.size()) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		if (o == null) {
			throw new NullPointerException();
		}
		
		for (int i = this.size() - 1; i > index; i--) {
			list[i] = list[i - 1];
		}
		list[index] = o;
	}
	/**
	 * This is an Object method for removing an element stored at the given index
	 * @param index the index where the elemenet we want removed from the list is stored
	 * @return Object the object that is removed from the list
	 */
	@Override
	public Object remove(int index) {
		if (index < 0 || index >= this.size()) {
			throw new ArrayIndexOutOfBoundsException(index);
		}

		//Because if you're just removing the last element of the list there's no reason to move anything
		if (index != this.size() -1) {
			for (int i = index; i <= this.size() - 2; i++) {
				list[i] = list[i + 1];
			}
		}
		//removes that last element
		list[this.size() - 1] = null;
		
		Object temp = list[index];

		return temp;
		
	}
	/**
	 * This is an integer method for retrieving the index where a given object is stored in the list
	 * @param o the object we want to find the index of in the list
	 * @return int representing the index where the parameterized data is stored
	 */
	@Override
	public int indexOf(Object o) {
		for (int i = 0; i < this.size; i++) {
			if (this.list[i] == o) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * I don't even know if this is right...
	 * @param tasks some tasks
	 * @return E[] an array of objects
	 */
	public Object[] toArray(Object[] tasks) {
		// TODO Auto-generated method stub
		return this.list;
	}
}
