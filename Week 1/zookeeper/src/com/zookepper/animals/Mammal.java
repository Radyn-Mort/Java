package com.zookepper.animals;

public class Mammal {
	protected int energyLevel=100;
	
	
	public int showEnergyLevel() {
		System.out.println("Energy level: "+this.energyLevel);
		return this.energyLevel;
	}

	
}
