package com.codingdojo.zookeeper;

public class Mammal {
	private int energyLevel = 100;
	
	public int displayEnergy() {
		return energyLevel;
	}
	
	public void setEnergy(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
}

