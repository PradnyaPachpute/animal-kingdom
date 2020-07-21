package com.animals;


public class Chicken extends Birds{
	
	private boolean isRooster;
	
	public Chicken() {
		super();
	}
	
	public Chicken(boolean isRooster){
		this.isRooster=isRooster;
	}
	
	@Override
	public void sing() {
		if(!isRooster)
			System.out.println("Cluck,cluck");
		else
			System.out.println("Cock-a-doodle-doo");
	}
	
	@Override
	public void fly() {
		System.out.println("I can not fly");
	}
}
