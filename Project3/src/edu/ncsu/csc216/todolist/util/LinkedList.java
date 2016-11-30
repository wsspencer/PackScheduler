package edu.ncsu.csc216.todolist.util;

import java.io.Serializable;
/**
 * This is a class for defining the operations and characteristics of our custom Linked List
 * @author Scott Spencer
 * @param E the abstract object that can be any object we want our linked list to contain
 *
 */
public class LinkedList<E> implements List, Serializable {
	/**
	 * This is a nested class for defining the characteristics of a Node to be used in this linked list
	 * @author Scott Spencer
	 *
	 */
	public class Node implements Serializable {
		/** This is a self-referential variable for referencing the "next" node in the list (recursive data structure) */
		private Node next;
		/** This is our long constant for the serial version UID this class will utilize */
		private static final long serialVersionUID = 484909840L;
		/** This is a package-private (protected) class variable for the value held in this node */
		protected E value;
		/**
		 * This is the constructor method used for creating a new node with the given parameters
		 * @param data the object we want stored in this node of the list
		 * @param next the Node we want next in line of the list
		 */
		public Node(Object data, Node next) {
			//unimplemented
		}
	}
	/** This is a class variable that will designate the first node in the list */
	private Node head;
	/** This is our long constant for the serial version UID this class will utilize */
	private static final long serialVersionUID = 349987L;
	/**
	 * This is a constructor method for creating a new instance of a linked list
	 */
	public LinkedList() {
		//unimplemented
	}
	/**
	 * This is a Node method used to insert a node with the given data and the given "next" node reference 
	 * AT the given index
	 * @param index the index where we want the node
	 * @param data the object we want stored in the node
	 * @param next the next node for this node
	 * @return the Node we are inserting?
	 */
	private Node insertAt(int index, Object data, Node next) {
		//unimplemented
		return null;
	}
	/**
	 * This is an int method used for retrieving the index of a node with the given
	 * constraints
	 * @param data the data stored in the node 
	 * @param next the next node in line
	 * @param number the number for the node
	 * @return 
	 */
	private int indexOf(Object data, Node next, int number) {
		//unimplemented
		//not sure what that integer parameter is suppose to be...
		return 0;
	}
	/**
	 * This is a Node method used for removing a node from the list, given the index we 
	 * want to remove and the node we want to come next
	 * @param index of the node
	 * @param next the next node
	 * @return Node that was removed
	 */
	private Node remove(int index, Node next) {
		//unimplemented
		//params may be wrong
		return null;
	}
	/**
	 * This is an integer method for returning the size of (a section of the list?)
	 * @param listNode the node we need for finding the size (apparently)
	 * @return int representing the number of elements in he given section of the list?
	 */
	private int size(Node listNode) {
		//unimplemented
		//param may be wrong
		return 0;
	}
	/**
	 * This is an integer method for returning the size of the list
	 * @return int representing the number of elements in the list
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * This is a boolean method for returning whether the list has any elements in it
	 * @return boolean stating whether or not the list is empty
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * This is a boolean method for checking if the list contains a certain object
	 * @param o the object we want to know is in a node in the list or not
	 * @return boolean stating if the list contains the element
	 */
	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
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
		//walk the list until you get to the desired index
		return null;
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
}
