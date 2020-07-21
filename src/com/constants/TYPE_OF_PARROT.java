package com.constants;

public enum TYPE_OF_PARROT {
	PARROT_WITH_DOG("Woof,woof"),
	PARROT_WITH_CAT("Meow"),
	PARROT_WITH_ROOSTER("Cock-a-doodle-doo");
	
	String sound;
	
	private TYPE_OF_PARROT(String type){
		this.sound = type;
	}
	
	public String getSound(){
		return sound;
	}
}
