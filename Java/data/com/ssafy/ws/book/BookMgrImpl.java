package com.ssafy.ws.book;

import java.util.ArrayList;

public class BookMgrImpl implements IBookMgr {
	ArrayList<Book> brr = new ArrayList<Book>();

//	private int index=0;
	public void add(Book b) {
		brr.add(b);
	}

	public ArrayList<Book> search() {
		return brr;

	}

	public ArrayList<Book> search(String num) {
		int i = 0;

		for (i = 0; i < brr.size(); i++) {
			if (brr.get(i).getIsbn().contains(num)) {
				System.out.println(brr.get(i).toString());
				
			}
		}
		
		return brr;
	}

	public ArrayList<Book> searchTitle(String Title) {
		int i = 0;

		for (i = 0; i < brr.size(); i++) {
			if (brr.get(i).getTitle().contains(Title)) {
				System.out.println(brr.get(i).toString());
			}
		}
		return brr;
	}

	public ArrayList<Book> searchPub(String pub) {
		int i = 0;

		for (i = 0; i < brr.size(); i++) {
			if (brr.get(i).getPublisher().contains(pub)) {
				System.out.println(brr.get(i).toString());
			}
		}
		return brr;
	}

	public ArrayList<Book> search(int price) {

		for (int i = 0; i < brr.size(); i++) {
			if (brr.get(i).getPrice() <= price) {
				System.out.println(brr.get(i).toString());
			}
		}
		return brr;
	}

	public ArrayList<Book> isBook() {
		for (Book b : brr) {
			if (!(b instanceof Magazine)) {
				System.out.println(b.toString());
			}
		}
		return brr;
	}

	public ArrayList<Book> isMagazine() {
//		ArrayList<Book> temp = new ArrayList<>();
		for (Book b : brr) {
			if (b instanceof Magazine) {
				System.out.println(b.toString());
				}
		}
		return brr;
	}

	public ArrayList<Book> searchThisYear(int year) {
//		ArrayList<Book> temp = new ArrayList<>();
		for (int i = 0; i < brr.size(); i++) {
			Magazine m = (Magazine) brr.get(i);
			if (m.getYear() == year) {
				System.out.println(m.toString());
			}
		}
		return brr;
	}

	public int totalPrice() {
		int sum = 0;
		for (Book b : brr) {
			sum += b.getPrice();
		}
		return sum;
	}
	public int totalAvg() {
		return this.totalPrice()/brr.size();
	}
}