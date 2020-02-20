package com.ssafy.ws.book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTest {
	static int idx = 0;
	static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Book> temp;
		Book b;
		BookMgrImpl bmgr = new BookMgrImpl();
		bmgr.add(new Book("21424", "Java Pro", "김하나", "Jaen.kr", 15000, "Java 기본 문법"));
		bmgr.add(new Book("35355", "분석 설계", "소나무", "Jaen.kr", 30000, "SW 모델링"));
		bmgr.add(new Magazine("35535", "Java World", "편집부", "java.com", 7000, "첫걸음", 2018, 2));
		boolean toggle = true;
		while (toggle) {
			System.out.println("사용하고 싶은 메뉴 번호를 선택해주세요");
			System.out.println(
					"1. 도서입력  2.전체검색  3.isbn검색  4.제목검색  5.Book검색  6.Magazine검색  7.올해 Magazine 검색  8.출판사검색  9.가격검색  10.가격합계  11.가격평균");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("책이면 b, 잡지면 m 입력");
				String type = sc.next();
				if (type.charAt(0) == 'b') {
					bmgr.add(insertBookInfo());
				} else {
					bmgr.add(insertMagazineInfo());
				}
				System.out.println();
				break;
			case 2:
				System.out.println("************* 도서목록 ***************");
				temp = bmgr.search();
				for (int i = 0; i < temp.size(); i++) {
					System.out.println(temp.get(i).toString());
				}
				System.out.println();
				break;
			case 3:
				System.out.println("isbn 입력");
				String isbn = sc.next();
				bmgr.search(isbn);
				System.out.println();
				break;
			case 4:
				System.out.println("title 입력");
				String title = sc.next();
				bmgr.searchTitle(title);
				System.out.println();
				break;
			case 5:
				bmgr.isBook();
				System.out.println();
				break;
			case 6:
				bmgr.isMagazine();
				System.out.println();
				break;
			case 7:
				bmgr.searchThisYear(2018);
				System.out.println();
				break;
			case 8:
				System.out.println("publisher 입력");
				String publisher = sc.next();
				bmgr.searchPub(publisher);
				System.out.println();
				break;
			case 9:
				System.out.println("price 입력");
				int price = sc.nextInt();
				bmgr.search(price);
				System.out.println();
				break;
			case 10:
				System.out.println(bmgr.totalPrice());
				break;
			case 11:
				System.out.println(bmgr.totalAvg());
				System.out.println();
				break;
			default:
				System.out.println("잘못된입력!");
				toggle = false;
			}
		}
	}

	static Book insertBookInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("isbn, title, author, publisher, price, desc 순으로 정보 입력");
		String isbn = sc.next();
		String title = sc.next();
		String author = sc.next();
		String publisher = sc.next();
		int price = sc.nextInt();
		String desc = sc.next();
		return new Book(isbn, title, author, publisher, price, desc);
	}

	static Magazine insertMagazineInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("isbn, title, author, publisher, price, desc, year, month 순으로 정보 입력");
		String isbn = sc.next();
		String title = sc.next();
		String author = sc.next();
		String publisher = sc.next();
		int price = sc.nextInt();
		String desc = sc.next();
		int year = sc.nextInt();
		int month = sc.nextInt();
		return new Magazine(isbn, title, author, publisher, price, desc, year, month);
	}
}
