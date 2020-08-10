package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppDemo {

	public static void main(String[] args) {
		
	// TODO Auto-generated method stub
		//loads xml file to spring container
	
	
ApplicationContext cont= new ClassPathXmlApplicationContext("demo.xml");

BeanCode obj=(BeanCode)cont.getBean("obj");//getbean returns a object
obj.printHello();


Employee empl=(Employee)cont.getBean("emp");//returing an object of type employee hence typecasting 
empl.printName();//calling the void method

	}

}
