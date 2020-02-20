package com.ssafy.ws.product;

import java.util.ArrayList;

public interface IProductMgr {
	
	abstract void add(Product p);
	
	abstract void findAll();
	
	abstract boolean findIsbn(String isbn) throws CodeNotFoundException;
	
	abstract void findTitle(String title);
	
	abstract ArrayList<Product> findTv();
	
	abstract ArrayList<Product> findRF();
	
	abstract ArrayList<Product> updatePr(String isbn, int price);
	
	abstract void findRFvol();
	
	abstract void findTvInch();
	
	abstract ArrayList<Product> removePr(String isbn);
	
	abstract int totalPrice();





	
	
}
