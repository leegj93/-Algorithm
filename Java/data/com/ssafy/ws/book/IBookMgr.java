package com.ssafy.ws.book;

import java.util.ArrayList;

public interface IBookMgr {

	abstract void add(Book b);
	
	abstract ArrayList<Book> search();
	
	abstract ArrayList<Book> search(String num);
	
	abstract ArrayList<Book> searchTitle(String Title);
	
	abstract int totalPrice();
	
	abstract int totalAvg();

	
}

