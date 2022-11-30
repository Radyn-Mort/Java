package com.zookepper.animals;

public class Gorilla extends Mammal {
	
	public Gorilla() {
		
	}
	public void throwSomthing() {
		System.out.println("The Gorilla has Thrown a Tree");
		this.energyLevel-=5;
		this.showEnergyLevel();
	}
	public void eatBanana() {
		System.out.println("HAPPY GORILLA");
		this.energyLevel+=10;
		this.showEnergyLevel();
	}
	public void climb() {
		System.out.println("The gorilla climbs a tree!");
		this.energyLevel-=10;
		this.showEnergyLevel();
//		
	}
}
