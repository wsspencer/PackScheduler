package edu.ncsu.csc216.todolist.util;

import java.io.Serializable;

public class ArrayList implements List, Serializable {
	
	private static final long serialVersionUID = 28592L;
	
	private static final int RESIZE = 0;
	
	private Object[] list;
	
	private int size;
	
	public ArrayList() {
		//unimplemented
	}
	
	public ArrayList(int size) {
		//unimplemented
		//not sure if size is correct param
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
