package com.animals;

import com.behaviors.Swimmer;

public class Duck extends Birds implements Swimmer{
	@Override
	public void sing() {
		System.out.println("Quack,quack");
	}
	
	@Override
	public void swim() {
		System.out.println("I can swim");
		
	}
}
