package com.ssafy;

public class Bus extends Car {
	private int seat;
	
	public Bus() {
		super();
	}
	public Bus(String num, String model, int price, int seat) {
		super(num, model, price);
		this.setSeat(seat);
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public String toString() {
		return super.toString()+String.format("%-10d",seat);
	}

}
