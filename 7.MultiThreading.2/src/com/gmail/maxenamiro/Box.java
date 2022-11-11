package com.gmail.maxenamiro;

public class Box {
	private int number;
	private String shipName;
	
	public Box(int number, String shipName) {
		super();
		this.number = number;
		this.shipName = shipName;
	}

	public int getNumber() {
		return number;
	}

	public String getShipName() {
		return shipName;
	}

	@Override
	public String toString() {
		return "Box [number=" + number + ", shipName=" + shipName + "]";
	}
	
	
}
