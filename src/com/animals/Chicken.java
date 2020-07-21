package com.animals;

import com.constants.ROOSTER_LANGUAGE;

public class Chicken extends Birds{
	
    private ROOSTER_LANGUAGE language;
	
	public Chicken() {
		super();
	}
	
	public Chicken(ROOSTER_LANGUAGE language){
		this.language=language;
	}
	
	@Override
	public void sing() {
		if(language == null)
			System.out.println("Cluck,cluck");
		else
			System.out.println(language.getLanguage());
	}
	
	@Override
	public void fly() {
		System.out.println("I can not fly");
	}
}
