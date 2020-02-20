package com.ssafy.ws;

public class Magazine extends Book{
	
	 int year;
	private int month;
	
	private String desc;

	Magazine(String in, String tl, String ath, String pb, int p,int y, int m, String dc){
		super(in, tl, ath, pb, p, dc);
		year= y; month = m; price=p; desc = dc;
	}
	public String toString() {
		String str= isbn +"	|"+
							title +"	|"+
							author +"	|"+
							publisher +"	|"+
							price +"	|"+
							desc +"	|"+
							year +"."+
							month;
		return str;
	}

}
