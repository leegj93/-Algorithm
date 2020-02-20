package com.ssafy.ws.product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductMgrImpl pmgr = new ProductMgrImpl();
		pmgr.add(new Tv("1234", "Tv123", 15000, 5, 50, "lcd"));
		pmgr.add(new Refrigerator("1234", "rf1234", 50000, 8, "500"));
		pmgr.add(new Tv("1234", "Tv1212", 101000, 5, 30, "led"));
		pmgr.add(new Refrigerator("1534", "rf1434", 35000, 8, "300"));
		int menuNo = 0;
		while (true) {

			System.out.println("********** 메뉴목록 *************");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 데이터 전체출력");
			System.out.println("3. isbn로 검색");
			System.out.println("4. 이름으로 검색");
			System.out.println("5. Tv만 검색");
			System.out.println("6. 냉장고만 검색");
			System.out.println("7. 400L이상의 냉장고만 검색");
			System.out.println("8. 50인치 이상의 Tv 검색");
			System.out.println("9. isbn로 가격정보 갱신");
			System.out.println("10. isbn으로 삭제");
			System.out.println("11. 총 상품 금액");
			menuNo = sc.nextInt();
			switch (menuNo) {
			case 1:
				int choice = 0;
				System.out.println("종류를 선택하세요");
				System.out.println("1. Tv	2. 냉장고");
				choice = sc.nextInt();
				if (choice == 1) {
					pmgr.insertTvInfo(sc);

				} else if (choice == 2) {
					pmgr.insertRFInfo(sc);

				} else {
					System.out.println("Wrong input");
				}

				break;
			case 2:
				pmgr.findAll();
				break;
			case 3:
				System.out.print("isbn 입력: ");
				String searcht = sc.next();
				pmgr.findIsbn(searcht);

				break;
			case 4:
				System.out.print("제목입력: ");
				String search = sc.next();
				pmgr.findTitle(search);

				break;
			case 5:
				pmgr.findTv();

				break;
			case 6:
				pmgr.findRF();

				break;
			case 7:
				pmgr.findRFvol();

				break;
			case 8:
				pmgr.findTvInch();

				break;
			case 9:
				System.out.print("isbn 입력: ");
				String searchib = sc.next();
				System.out.print("가격 입력: ");
				int rpprice = sc.nextInt();
				pmgr.updatePr(searchib, rpprice);
				break;
			case 10:
				System.out.print("isbn 입력: ");
				String searchin = sc.next();
				pmgr.removePr(searchin);
				break;
			case 11:
				pmgr.totalPrice();

				break;

			default:
				System.out.println("잘못된 입력입니다");
				break;
			}
		}
	}

	static Tv insertTvInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("isbn, title, price, stock, inch, Display 순으로 정보 입력");
		String isbn = sc.next();
		String title = sc.next();
		int price = sc.nextInt();
		int stock = sc.nextInt();
		int inch = sc.nextInt();
		String Display = sc.next();
		return new Tv(isbn, title, price, stock, inch, Display);
	}

	static Refrigerator insertRFInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("isbn, title, price, stock, Volume 순으로 정보 입력");
		String isbn = sc.next();
		String title = sc.next();
		int price = sc.nextInt();
		int stock = sc.nextInt();
		String volume = sc.next();
		return new Refrigerator(isbn, title, price, stock, volume);
	}
}
