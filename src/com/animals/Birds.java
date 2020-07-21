package com.animals;

import com.behaviors.Flyable;
import com.behaviors.Singable;

public class Birds extends Animal implements Flyable,Singable{
	public void fly(){
		System.out.println("I am flying");
	}
	@Override
	public void sing() {
		System.out.println("I am singing");
		
	}
}
