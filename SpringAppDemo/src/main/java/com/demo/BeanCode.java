package com.demo;

public class BeanCode {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void printHello()
	{
		System.out.println("hello!"+name);
	}
}
