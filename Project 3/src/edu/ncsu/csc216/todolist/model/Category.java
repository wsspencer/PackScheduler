package edu.ncsu.csc216.todolist.model;

public class Category {

	private static final long serialVersionUID = 459188L;
	
	private String name;
	
	private String description;
	
	private String categoryID;
	
	public Category(String name, String desc, String id) {
		//unimplemented
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String desc) {
		this.description = desc;
	}
	
	public String getCategoryID() {
		return this.categoryID;
	}
	
	private void setCategoryID(String id) {
		this.categoryID = id;
	}
	
	public boolean equals(Object o) {
		//unimplemented
		return false;
	}
	
	public int compareTo(Category c) {
		//unimplemented
		return 0;
	}
	
	public int hashCode() {
		//unimplemented
		return 0;
	}
	
	public String toString() {
		//unimplemented
		return "";
	}
}














