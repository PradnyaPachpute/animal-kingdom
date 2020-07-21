package com.animals;


public class Chicken extends Birds{
	
	@Override
	public void sing() {
		System.out.println("Cluck,cluck");
	}
	
	@Override
	public void fly() {
		System.out.println("I can not fly");
	}
}
