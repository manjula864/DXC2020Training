package com.test;

import org.springframework.stereotype.Service;

@Service
public class Car implements Vehicle {

	public void move() {
		// TODO Auto-generated method stub
		System.out.println("lets go to hyd");
	}

}
