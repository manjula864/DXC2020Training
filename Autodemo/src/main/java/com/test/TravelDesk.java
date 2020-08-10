package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TravelDesk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cont= new ClassPathXmlApplicationContext("myspringnew.xml");

		TravellerService obj=(TravellerService)cont.getBean("travellerService");//getbean returns a object
		obj.startJourney();


	}

}
