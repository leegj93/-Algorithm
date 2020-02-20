package com.ssafy.ws;

public class Refrigerator extends Product {
	
	String volume;

	Refrigerator(String isb, String tl, int p, int s,  String vol){
		super(isb, tl, p, s);
		volume = vol;
	}
	public String toString() {
		String str= isbn +"	|"+
							title +"	|"+
							price +"	|"+
							stock+"	|"+
							volume ;
		return str;
	}
	void print() {
		super.print();
		System.out.println("용량 : " + volume);
		
	}

}
