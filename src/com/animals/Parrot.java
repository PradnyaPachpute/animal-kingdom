package com.animals;

import com.constants.TYPE_OF_PARROT;

public class Parrot extends Birds {
	
	private TYPE_OF_PARROT type;
	
	public Parrot(TYPE_OF_PARROT parrot){
		this.type = parrot;
	}
	
	@Override
	public void sing() {
		System.out.println(type.getSound());
	}
}
