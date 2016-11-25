package edu.ncsu.csc216.todolist.util;

import java.io.Serializable;

public class LinkedList implements List, Serializable {
	
	public class Node implements Serializable{
		
		private Node next;
		
		private static final long serialVersionUID = 484909840L;
		
		protected Object value;
		
		public Node(Object data, Node next) {
			//unimplemented
		}
	}
	
	private Node head;
	
	private static final long serialVersionUID = 349987L;
	
	public LinkedList() {
		//unimplemented
	}
	
	private Node insertAt(int index, Object data, Node next) {
		//unimplemented
		return null;
	}

	private int indexOf(Object data, Node next, int number) {
		//unimplemented
		//not sure what that integer parameter is suppose to be...
		return 0;
	}
	
	private Node remove(int index, Node next) {
		//unimplemented
		//params may be wrong
		return null;
	}
	
	private int size(Node listNode) {
		//unimplemented
		//param may be wrong
		return 0;
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
