package com.model;

public class Employee
{

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
	System.out.println("this is from bean class:"+name);
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
int id;
String name;
	
	
	
	
	
	
}
