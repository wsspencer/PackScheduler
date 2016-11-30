package edu.ncsu.csc216.todolist.util;

import java.io.Serializable;

/**
 * This is a class used to define the methods and characteristics of a custom ArrayList
 * @author Scott Spencer
 * @param E abstract object used to define what this will be an arraylist of
 *
 */
public class ArrayList<E> implements List, Serializable {
	/** This is our long constant for the serial version UID this class will utilize */
	private static final long serialVersionUID = 28592L;
	/** This is a class variable of an integer we use to resize the list */
	private static final int RESIZE = 0;
	/** This is a class variable used to store the elements of the list in an Object array */
	private E[] list;
	/** This is a class variable used to store the size of the list */
	private int size;
	/**
	 * This is a constructor method used to create a new instance of an ArrayList
	 */
	public ArrayList() {
		//unimplemented
	}
	/**
	 * This is a constructor method used to create a new instance of an ArrayList of a specific size
	 * @param initSize integer representation of the number of elements in the list
	 */
	public ArrayList(int initSize) {
		//unimplemented
		//not sure if size is correct param
	}

	/**
	 * This is an integer method for returning the size of the list
	 * @return int representing the number of elements in the list
	 */
	@Override
	public int size() {
		int size = 0;
		for (int i = 0; i < this.list.length; i++) {
			if (this.list[i] != null) {
				size++;
			}
		}
		return size;
	}
	/**
	 * This is a boolean method for returning whether the list has any elements in it
	 * @return boolean stating whether or not the list is empty
	 */
	@Override
	public boolean isEmpty() {
		//this will be our check to see if there are any elements in our array of objects
		boolean emptyCheck = true;
		//this will loop for the entirety of our array and check each index to see if it holds a value
		for (int i = 0; i < this.list.length; i++) {
			if (this.list[i] != null) {
				//updates our emptycheck to false if the index at i in our array holds a value
				emptyCheck = false;
			}
		}
		return emptyCheck;
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
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * This is an Object method for retrieving an Object stored at a given index
	 * @param index integer representing the index we want the object at
	 * @return Object at the given index
	 */
	@Override
	public E get(int index) {
		return this.list[index];
	}
	/**
	 * This is a void method used to add an element to a specific index in the list
	 * @param index the place in the list we want to add an object to
	 * @param o the object we want to add to the list
	 */
	@Override
	public void add(int index, Object o) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * This is an Object method for removing an element stored at the given index
	 * @param index the index where the elemenet we want removed from the list is stored
	 * @return Object the object that is removed from the list
	 */
	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * This is an integer method for retrieving the index where a given object is stored in the list
	 * @param o the object we want to find the index of in the list
	 * @return int representing the index where the parameterized data is stored
	 */
	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * I don't even know if this is right...
	 * @param tasks some tasks
	 * @return E[] an array of objects
	 */
	public E[] toArray(E[] tasks) {
		// TODO Auto-generated method stub
		return null;
	}
}
