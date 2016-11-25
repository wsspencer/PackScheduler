package edu.ncsu.csc216.todolist.model;

import java.io.Serializable;
import java.util.Observable;
import java.util.Observer;

import edu.ncsu.csc216.todolist.util.ArrayList;

public class CategoryList extends Observable implements Tabular, Serializable, Observer {

	private ArrayList list;
	
	private static final long serialVersionUID = 984509L;
	
	private String name;
	
	private int nextCategoryNum;
	
	public CategoryList() { 
		//unimplemented
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean addCategory(String name, String desc) {
		//unimplemented
		return false;
	}
	
	public Category getCategoryAt(int index) {
		//unimplemented
		return null;
	}
	
	public int indexOf(String s) {
		//unimplemented
		return 0;
	}

	public int indexOfName(String name) {
		//unimplemented
		return 0;
	}
	
	public int size() {
		//unimplemented
		return 0;
	}
	
	public boolean isEmpty() {
		//unimplemented
		return false;
	}
	
	public Category removeCategoryAt(int index) {
		//unimplemented
		return null;
	}
	
	public boolean removeCategory(String name) {
		//unimplemented
		return false;
	}
	
	private int getNextCategoryNum() {
		//unimplemented
		return 0;
	}
	
	private void incNextCategoryNum() {
		this.nextCategoryNum++;
	}
	
	@Override
	public Object[][] get2DArray() {
		// TODO Auto-generated method stub
		return null;
	} 
	
	public void update(Observable o, Object arg) {
		//unimplemented
	}

}










