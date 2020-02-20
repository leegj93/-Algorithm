package com.ssafy.ws;

public class Book {
	String isbn;
	String title;
	String author;
	String publisher;
	int price;
	String desc;
	Book(String in, String tl, String ath, String pb, int p, String dc){
		isbn=in; title = tl; author = ath; publisher =pb; price=p; desc = dc;
	}
	
	public String toString() {
		String str= isbn +"	|"+
							title +"	|"+
							author +"	|"+
							publisher +"	|"+
							price +"	|"+
							desc;
		return str;
	}
}
