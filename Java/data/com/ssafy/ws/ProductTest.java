package com.ssafy.ws;

import java.util.Scanner;

public class ProductTest {
	public static void main(String[] args) {
		Tv tv1=new Tv("1234", "Tv123", 15000, 5, 5,"lcd");
		Refrigerator rf1= new Refrigerator("1234", "rf1234", 50000, 8,  "500L");
		Scanner sc = new Scanner(System.in);
		Product[] pr = new Product[30];
		int menuNo = 0, pArrCnt = 0;
		while (true) {

			System.out.println("********** 메뉴목록 *************");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 데이터 전체출력");
			System.out.println("3. isbn으로 검색");
			System.out.println("4. 이름으로 검색");
			System.out.println("5. Tv만 검색");
			System.out.println("6. 냉장고만 검색");
			System.out.println("7. isbn으로 삭제");
			menuNo = sc.nextInt();
			switch (menuNo) {
			case 1:
				int choice=0;
				System.out.println("종류를 선택하세요");
				System.out.println("1. Tv	2. 냉장고");
				choice = sc.nextInt();
				if (choice==1) {
					pArrCnt=ProductMgr.inputTvInfo(pr, pArrCnt);
			
					
				} else if(choice==2){
					pArrCnt=ProductMgr.inputRFInfo(pr, pArrCnt);

				}else {
					System.out.println("Wrong input");
				}
				
				break;
			case 2:
				ProductMgr.findAll(pr, pArrCnt);
				break;
			case 3:
				System.out.print("isbn 입력: ");
				String searcht =sc.next();
				ProductMgr.findIsbn(pr, searcht, pArrCnt);
				

				break;
			case 4:
				System.out.print("제목입력: ");
				String search =sc.next();
				ProductMgr.findTitle(pr, search, pArrCnt);

				break;
			case 5:		
				ProductMgr.findTV(pr, pArrCnt);

				break;
			case 6:
				ProductMgr.findRF(pr, pArrCnt);

				break;
			case 7:
				System.out.print("isbn 입력: ");
				String searchin =sc.next();
				ProductMgr.removePr(pr, pArrCnt, searchin);
				break;
			case 8:
				ProductMgr.sumPrice(pr, pArrCnt);

				break;

			default:
				System.out.println("잘못된 입력입니다");
				break;
			}
		}
	}
}
