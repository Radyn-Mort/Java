package com.zookepper.animals;

public class Bat extends Mammal {
	public Bat(){
		super(300);
//		this.energyLevel = 300;
	}
	public void fly() {
		System.out.println("FLAP FLAP FLAP");
		this.setEnergyLevel(getEnergyLevel()-50);
		this.showEnergyLevel();
	}
	public void eatHuman() {
		this.setEnergyLevel(getEnergyLevel() + 25);
		this.showEnergyLevel();
	}
	public void attackTown() {
		System.out.println("CRACKLE CRACKLE AHHHHHHH");
		this.setEnergyLevel(getEnergyLevel()-100);
		this.showEnergyLevel();
	}
}
