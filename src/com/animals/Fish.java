package com.animals;

import com.behaviors.Swimmer;

public class Fish implements Swimmer{
	@Override
	public void swim() {
		System.out.println("I am swimming");
	}

}
