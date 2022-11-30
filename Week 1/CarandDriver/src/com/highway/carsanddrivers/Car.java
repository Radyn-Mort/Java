package com.highway.carsanddrivers;

public class Car {
	protected int gas;
	
	public Car() {
		this.gas = 10;
	}
	
	public void status() {
		System.out.println(this.gas+"/10");
	}

}
