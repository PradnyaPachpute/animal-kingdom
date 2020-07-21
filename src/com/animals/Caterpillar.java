package com.animals;

import com.behaviors.Walkable;

/*As Caterpillar extends Animal class it has ability to walk
 * */
public class Caterpillar extends Animal implements Walkable{
	@Override
	public void walk() {
		System.out.println("I can crawl");
	}
}
