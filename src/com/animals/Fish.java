package com.animals;

import com.behaviors.Swimmer;

public class Fish extends Animal implements Swimmer{
	@Override
	public void swim() {
		System.out.println("I am swimming");
	}

}
