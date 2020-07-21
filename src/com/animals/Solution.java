package com.animals;

import com.constants.TYPE_OF_PARROT;

public class Solution {
	public static void main(String[] args) {
		Birds bird = new Parrot(TYPE_OF_PARROT.PARROT_WITH_ROOSTER);
		bird.sing();
		
		Dolphin dolphin = new Dolphin();
		dolphin.swim();
	}
}
