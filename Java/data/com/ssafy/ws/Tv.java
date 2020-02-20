package com.ssafy.ws;

public class Tv extends Product{
	
	int inch;
	String Display;

	Tv(String isb, String tl, int p, int s, int in, String Dis){
		super(isb, tl, p, s);
		inch =in; Display=Dis;
		
		
	}
	public String toString() {
		String str= isbn +"	|"+
							title +"	|"+
							price +"	|"+
							stock+"	|"+
							inch +"	|"+
							Display ;
		return str;
	}
	void print() {
		super.print();
		System.out.println("inch : " + inch);
		System.out.println("디스플레이 타입 : " + Display);
	}

}
