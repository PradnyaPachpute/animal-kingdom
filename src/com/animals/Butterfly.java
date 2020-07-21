package com.animals;

import com.behaviors.Flyable;

/*
 * Butterfly Extends from caterpillar 
 * */

public class Butterfly extends Caterpillar implements Flyable{

	@Override
	public void fly() {
		System.out.println("I can Fly");
	}
	
	@Override
	public void walk() {
		System.out.println("I can not walk");
	}

}
