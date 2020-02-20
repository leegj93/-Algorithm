package com.ssafy.ws.product;

public class Refrigerator extends Product {
	
	private String volume;

	public Refrigerator() {
		super();
	}
	public Refrigerator(String isbn, String title, int price, int stock,  String volume){
		super();
		super.setIsbn(isbn);
		super.setTitle(title);
		super.setPrice(price);
		super.setStock(stock);
		this.volume = volume;
	}
	
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public void print() {
		super.print();
		System.out.println("용량 : " + volume);
		
	}

}
