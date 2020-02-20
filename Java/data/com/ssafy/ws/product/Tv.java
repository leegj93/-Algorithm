package com.ssafy.ws.product;

public class Tv extends Product{
	
	private int inch;
	private String Display;
	public Tv() {
		super();
	}

	public Tv(String isbn, String title, int price, int stock, int inch, String Display){
		super();
		super.setIsbn(isbn);
		super.setTitle(title);
		super.setPrice(price);
		super.setStock(stock);
		this.inch =inch; 
		this.Display=Display;
		
		
	}
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	public String getDisplay() {
		return Display;
	}
	public void setDisplay(String display) {
		Display = display;
	}

	public void print() {
		super.print();
		System.out.println("inch : " + inch);
		System.out.println("디스플레이 타입 : " + Display);
	}

}
