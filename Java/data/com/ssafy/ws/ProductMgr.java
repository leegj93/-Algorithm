package com.ssafy.ws;

import java.util.Scanner;

public class ProductMgr {
	
	
	public static int inputTvInfo(Product[] P, int count ){
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
			System.out.println("===== TV 정보 입력 ==== " );
			System.out.print("isbn: ");
			String tmpin= sc.next();
			System.out.print("제품명: ");
			String tmptl= sc.next();
			System.out.print("가격: ");
			int tmpP = sc.nextInt();
			System.out.print("재고: ");
			int tmpS = sc.nextInt();
			System.out.print("인치: ");
			int tmpI = sc.nextInt();
			System.out.print("디스플레이 타입: ");
			String tmpdis= sc.next();
			P[count++]= new Tv(tmpin, tmptl, tmpP,tmpS, tmpI, tmpdis);
			return count;
	}
	public static int inputRFInfo(Product[] P, int count ){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
			System.out.println("===== 냉장고 정보 입력 ==== " );
			System.out.print("isbn: ");
			String tmpin= sc.next();
			System.out.print("제품명: ");
			String tmptl= sc.next();
			System.out.print("가격: ");
			int tmpP = sc.nextInt();
			System.out.print("재고: ");
			int tmpS = sc.nextInt();
			System.out.print("용량: ");
			String tmpV = sc.next();
			
			P[count++]= new Refrigerator(tmpin, tmptl, tmpP,tmpS, tmpV);
			return count;
	}
	public static void findAll(Product[] P, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("======================");
			P[i].print();	
		}
	}
	public static void findIsbn(Product[] P,String isbn, int count) {
		System.out.println("해당 isbn으로 검색..");
		for (int i = 0; i < count; i++) {
			if (P[i].isbn.equals(isbn)) {
				P[i].print();
				
			}
		}
	}
	public static void findTitle(Product[] P,String title, int count) {
		System.out.println("해당 제품명으로 검색..");
		for (int i = 0; i < count; i++) {
			if (P[i].title.equals(title)) {
				P[i].print();
				
			}
		}
	}
	public static void findTV(Product[] P, int count) {
		System.out.println("TV만 검색");
		for (int i = 0; i < count; i++) {
			if ((P[i] instanceof Tv)) {
				P[i].print();
				
			}
		}
	}
	public static void findRF(Product[] P, int count) {
		System.out.println("냉장고만 검색");
		for (int i = 0; i < count; i++) {
			if ((P[i] instanceof Refrigerator)) {
				P[i].print();
				
			}
		}
	}
	public static void removePr(Product[] P, int count,String isbn) {
		System.out.println("해당 제품 삭제");
		int i;
		boolean toggle = false;
		for (i = 0; i < count; i++) {
			if (P[i].isbn.equals(isbn)) {
				toggle = true;
				break;
				
			}
		}
		if(toggle) {
			for(; i<count; i++) {
				P[i]=P[i+1];
			}
			count--;
		}
	}
	public static int sumPrice(Product[] P, int count) {
		System.out.println("재고 금액의 총합..");
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += P[i].price*P[i].stock;
		}
		return sum;
	
	}
	
			
	

}//end of class

