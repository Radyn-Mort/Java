package com.zookepper.animals;

public class Bat extends Mammal {
	public Bat(){
		this.energyLevel = 300;
	}
	public void fly() {
		System.out.println("FLAP FLAP FLAP");
		this.energyLevel -=50;
		this.showEnergyLevel();
	}
	public void eatHuman() {
		this.energyLevel+=25;
		this.showEnergyLevel();
	}
	public void attackTown() {
		System.out.println("CRACKLE CRACKLE AHHHHHHH");
		this.energyLevel -= 100;
		this.showEnergyLevel();
	}
}
