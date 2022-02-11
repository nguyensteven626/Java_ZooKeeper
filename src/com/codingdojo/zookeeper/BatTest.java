package com.codingdojo.zookeeper;

public class BatTest {

	public static void main(String[] args) {
		
		Bat dracula = new Bat();
		dracula.setEnergy(300);
		
		System.out.println(dracula.displayEnergy());
		dracula.attackTown();
		
		System.out.println(dracula.displayEnergy());
		dracula.attackTown();
		
		System.out.println(dracula.displayEnergy());
		
		dracula.attackTown();
		
		System.out.println(dracula.displayEnergy());
		dracula.eatHumans();
		
		System.out.println("eating - " + dracula.displayEnergy());
		dracula.eatHumans();
		
		System.out.println(dracula.displayEnergy());
		dracula.fly();
		
	

	}


	

}
