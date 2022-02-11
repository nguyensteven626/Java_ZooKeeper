package com.codingdojo.zookeeper;

public class GorillaTest {

	public static void main(String[] args) {
		
		Gorilla kingKong = new Gorilla();
		System.out.println(kingKong.displayEnergy());
		
		kingKong.throwSomething();
		System.out.println(kingKong.displayEnergy());
		
		kingKong.throwSomething();
		System.out.println(kingKong.displayEnergy());
		
		kingKong.throwSomething();
		System.out.println(kingKong.displayEnergy());
		
		kingKong.eatBananas();
		System.out.println(kingKong.displayEnergy());
		
		kingKong.eatBananas();
		System.out.println(kingKong.displayEnergy());
		
		kingKong.climb();
		System.out.println(kingKong.displayEnergy());

	}
	

}
