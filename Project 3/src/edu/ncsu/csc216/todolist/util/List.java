package edu.ncsu.csc216.todolist.util;

public interface List {
	
	public int size();
	
	public boolean isEmpty();
	
	public boolean contains(Object o);
	
	public boolean add(Object o);
	
	public Object get(int index);
	
	public void add(int index, Object o);
	
	public Object remove(int index);
	
	public int indexOf(Object o);
}
