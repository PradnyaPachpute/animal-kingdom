package com.animals;

import com.behaviors.Flyable;
import com.behaviors.Singable;
import com.behaviors.Swimmer;
import com.behaviors.Walkable;
import com.constants.ROOSTER_LANGUAGE;
import com.constants.TYPE_OF_PARROT;

public class CountAnimals {

	private Animal[] animals = null;
	
	public CountAnimals(Animal[] animals){
		this.animals = animals;
	}
	public void getAnimalBehaviorCount(){
		int flyCount = 0; 
		int walkCount =0;
		int swimCount = 0;
		int singCount =0;
		
		for (Animal animal : animals) {
			if(animal instanceof Flyable){
				System.out.println(animal);
				flyCount += 1;
			}
			if(animal instanceof Walkable){
				walkCount += 1;
			}
			if(animal instanceof Swimmer){
				swimCount += 1;
			}
			if(animal instanceof Singable){
				singCount += 1;
			}
		}
		
		System.out.println("Number of animals that can fly : "+flyCount);
		System.out.println("Number of animals that can walk : "+walkCount);
		System.out.println("Number of animals that can sing : "+singCount);
		System.out.println("Number of animals that can swim : "+swimCount);
	}
	
	public static void main(String[] args) {
		 Animal[] animals = {
				new Birds(),new Duck(),new Chicken(),new Chicken(ROOSTER_LANGUAGE.MARATHI),new Parrot(TYPE_OF_PARROT.PARROT_WITH_DOG),
				new Fish(), new Shark(),new ClownFish(),new Dolphin(),new Butterfly()
		};
		 
		 CountAnimals count = new CountAnimals(animals);
		 count.getAnimalBehaviorCount();
		
		
	}

}
