package com.codingdojo.zookeeper;

public class Gorilla extends Mammal{
	
	public void throwSomething() {
		System.out.println("Gorilla throw banana");
		int energy = super.displayEnergy() - 5;
		setEnergy(energy);
	}
	
	public void eatBananas() {
		System.out.println("Gorilla eat bananna.");
		int energy = super.displayEnergy() + 10;
		setEnergy(energy);
		
	}
	
	public void climb() {
		System.out.println("Gorilla climbing building.");
		int energy = super.displayEnergy() - 10;
		setEnergy(energy);
		
	}
}
