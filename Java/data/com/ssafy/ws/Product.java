package com.ssafy.ws;

public class Product {
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	String isbn;
	String title;
	int price;
	int stock;
	
	Product(String isb, String tl, int p, int s){
		isbn=isb; title = tl; price = p; stock=s;
	}
	public void print() {
		System.out.println("제품번호 : " + isbn);
		System.out.println("제품명 : " + title);
		System.out.println("가격 : " + price);
		System.out.println("재고 : " + stock);
	}
	
	
}
