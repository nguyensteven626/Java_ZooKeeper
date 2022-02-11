package com.codingdojo.zookeeper;

public class Bat extends Mammal{
	public void fly() {
		System.out.println("FLY");
		int energy = super.displayEnergy() - 50;
		setEnergy(energy);
	}
	
	public void eatHumans() {
		int energy = super.displayEnergy() + 25;
		setEnergy(energy);
	}
	
	public void attackTown() {
		System.out.println("ATTACK");
		int energy = super.displayEnergy() - 50;
		setEnergy(energy);
	}
}
