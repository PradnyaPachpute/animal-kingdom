package com.behaviors;

public interface Swimmer {

	default void swim(){
		System.out.println("I can swim");
	};
}
