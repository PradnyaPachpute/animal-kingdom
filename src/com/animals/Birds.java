package com.animals;

import com.behaviors.Flyable;
import com.behaviors.Singable;
import com.behaviors.Walkable;

public class Birds extends Animal implements Flyable,Singable,Walkable{
	public void fly(){
		System.out.println("I am flying");
	}
	@Override
	public void sing() {
		System.out.println("I am singing");
		
	}
	
	@Override
	public void walk() {
		System.out.println("I am walking");
		
	}
}
