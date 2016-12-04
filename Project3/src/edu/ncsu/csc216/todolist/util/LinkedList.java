package edu.ncsu.csc216.todolist.util;

import java.io.Serializable;
import java.util.Observable;
/**
 * This is a class for defining the operations and characteristics of our custom Linked List
 * @author Scott Spencer
 *
 */
public class LinkedList extends Observable implements List, Serializable {
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
		protected Object value;
		/**
		 * This is the constructor method used for creating a new node with the given parameters
		 * @param data the object we want stored in this node of the list 
		 * @param next the Node we want next in line of the list
		 */ 
		public Node(Object data, Node next) {
			this.next = next;
			this.value = data;
		}
	}
	/** This is a class variable that will designate the first node in the list and serve as our only link to this instance for
	 * our recursive methods to use in their navigation */
	private Node head;
	/** This is our long constant for the serial version UID this class will utilize */
	private static final long serialVersionUID = 349987L;
	/**
	 * This is a constructor method for creating a new instance of a linked list
	 */
	public LinkedList() {
		this.head = null;
	}
	/**
	 * This is a Node method used to insert a node with the given data and the given "next" node reference 
	 * AT the given index
	 * @param index the index where we want the node
	 * @param data the object we want stored in the node
	 * @param head the next node for this node
	 * @return Node the Node we are inserting
	 */
	private Node insertAt(int index, Object data, Node n) {
		//return null if we go through the list without finding the index
		if (index < 0) {
			return null;
		}
		//add to front of empty list
		if (n == null) {
			n = new Node(data, null);
			return n;
		}
		//add to front of non-empty list
		if (index == 0 && n != null) {
			this.head = new Node(data, n);
			return this.head;
		}
		
		//Use recursion to insert the parameterized data at the parameterized index.  Calling the next node to navigate recursively 
		//we're basically counting the index down to 1. Every time we run the method recursively, simultaneously calling the method 
		//with the next node in line, so theoretically we should be able to get to the desired index, because when we are at 1, the
		//current node.next is the desired index we want to insert our data in (or, index 0 if we count down all the way to it)
		if (index == 1) {
			//set the node we are on's next node to a new node that contains the data we want to insert and has a next node that was
			//previously the next node of the node we are currently on, effectively just inserting a new node and tying it to the previous
			//node so as not to disrupt the rest of the list.  Also, we return the node we inserted.
			Node temp = n.next;
			n.next = new Node(data, temp);
			return n.next;
		}
		if (n.next == null) {
			Node ret = new Node (data, null);
			n.next = ret;
			return ret;
		}
		return insertAt(--index, data, n.next);
	}
	/**
	 * This is an int method used for retrieving the index of a node with the given
	 * constraints
	 * @param data the data stored in the node 
	 * @param n the next node in line
	 * @param index the number for the node
	 * @return 
	 */
	private int indexOf(Object data, Node n, int index) {
		//find the index of the info passed recursively (assuming the public method will pass us the head and index of 0 for our start
		if (n == null) {
			return -1;
		}
		if (n.value == data) {
			return index;
		}
		//call the method for recursion, with the same data we're looking for and the next node in list and incremented index 
		//(incrementing index so we can return the correct index when we find the appropriate data in the list node)
		return 1 + indexOf(data, n.next, ++index);

	}
	/**
	 * This is a Node method used for removing a node from the list, given the index we 
	 * want to remove and the node we want to come next
	 * @param index of the node
	 * @param n the node we will use as pointer
	 * @return Node that was removed
	 */
	private Node remove(int index, Node n) {
		//recursively find the right index and remove (I guess assuming we are passed the head to begin with from the public method?)
	
		
		//save the node for returning what's been removed
		Node returnNode = n;
		//remove in the case we are at the last element in the list
		if (index == 0) {
			this.head = null;
			return returnNode;
		}
		//if we get to 1 before 0, not the last element
		if (index == 1) {
			//leapfrog it 
			Node batrocZeLeaper = n.next;
			n.next = batrocZeLeaper.next;
			return returnNode; 
		}
		else {
			remove(--index, n.next);
		}
		return null;
	}
	/**
	 * This is an integer method for returning the size of (a section of the list?)
	 * @param n the node we need for finding the size (apparently)
	 * @return int representing the number of elements in he given section of the list?
	 */
	private int size(Node n) {
		//find size recursively
        if (n == null)
            return 0;
        else
        	//keep calling this method recursively, adding 1 to it, until our node.next is null
            return 1 + size(n.next);
	}
	/**
	 * This is an integer method for returning the size of the list
	 * @return int representing the number of elements in the list
	 */
	@Override
	public int size() {
		//call to our private recursive size method to find a publicly accessible size
		return size(head);
	}
	/**
	 * This is a boolean method for returning whether the list has any elements in it
	 * @return boolean stating whether or not the list is empty
	 */
	@Override
	public boolean isEmpty() {
		//check if the size is 0
		if (this.size() == 0) {
			return true;
		}
		return false;
	
	}
	/**
	 * This is a boolean method for checking if the list contains a certain object
	 * @param o the object we want to know is in a node in the list or not
	 * @return boolean stating if the list contains the element
	 */
	@Override
	public boolean contains(Object o) {
		if (this.isEmpty()) {
			return false;
		}
		//checks if the parameterized object has an index in the list
		if (indexOf(o) != -1) {
			return true;
		}
		//returns false if the index of the parameterized object is not found in the list
		return false;
	}
	/**
	 * This is a boolean method for adding an element to the list
	 * @param o the Object we want added to the list
	 * @return boolean stating whether or not the element was added
	 */
	@Override
	public boolean add(Object o) {
		// Walk to the end of the list and set the last value (currently null) to a new node containing the desired 
		//data.  Unless size is zero, then just set head to what we want it to be.
		//insertAt(0, o, this.head);
		if (o == null) {
			throw new NullPointerException();
		}
		if (this.size() == 0) {
			this.head = new Node(o, null);
		}
		else {
			Node walker = head;
			for (int i = 1; i < this.size(); i++) {
				walker = walker.next;
			}
			walker.next = new Node(o, null);
		}
		if (contains(o)) {
			return true;
		}
		return false;
	}
	/**
	 * This is an Object method for retrieving an Object stored at a given index
	 * @param index integer representing the index we want the object at
	 * @return Object at the given index
	 */
	@Override
	public Object get(int index) {
		//walk the list until you get to the desired index (or call the recursive method? do we have one? too lazy to check...)
		Node walker = this.head;
		for (int i = 0; i < index; i++) {
			walker = walker.next;
		}
		//since we stopped at the index just before our parameter, walker was still set to walker.next so it holds 
		//the node stored at the desired index
		return walker.value;
		//do we need to return the node or the value in the node?  find that out.  probably value, right?
	}
	/**
	 * This is a void method used to add an element to a specific index in the list
	 * @param index the place in the list we want to add an object to
	 * @param o the object we want to add to the list
	 */
	@Override
	public void add(int index, Object o) {
		// call recursive method insert at with the given parameters and our instance's head node
		if (index >= 0 && index < this.size()) {
			insertAt(index, o, this.head);	
		}
		
	}
	/**
	 * This is an Object method for removing an element stored at the given index
	 * @param index the index where the elemenet we want removed from the list is stored
	 * @return Object the object that is removed from the list
	 */
	@Override
	public Object remove(int index) {
		//call the private recursive method to navigate the list starting with the head node we have
		return this.remove(index, this.head);
	}
	/**
	 * This is an integer method for retrieving the index where a given object is stored in the list
	 * @param o the object we want to find the index of in the list
	 * @return int representing the index where the parameterized data is stored
	 */
	@Override
	public int indexOf(Object o) {
		// call private indexOf that uses to find the index holding the parameterized data. 
		//(Needs this instance's head node and a starting index of 0 to begin the recursion)
		return indexOf(o, head, 0);
	}
}
