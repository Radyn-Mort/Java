package com.highway.carsanddrivers;

public class Driver extends Car {
	public Driver() {
		
	}
	public void drive() {
		this.gas-= 1;
	}
	public void boost() {
		if(this.gas>3) {
		this.gas-=3;
		}
		else {
			System.out.println("Not enough gas! \n Gas: "+this.gas+"/10");
		}
		
	}
	public void refuel() {
		if(this.gas<8) {
		this.gas+=2;
	}
		else {
			System.out.println("Too much gas! \n Gas: "+this.gas+"/10");
		}
}
}
