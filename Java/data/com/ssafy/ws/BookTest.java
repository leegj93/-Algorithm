package com.ssafy.ws;

import java.util.Scanner;

public class BookTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book[] bk = new Book[20];
		bk[0] = new Book("21424", "Java Pro", "김하나", "Jaen.kr", 15000, "Java 기본 문법");
		bk[1] = new Book("35355", "분석설계", "소나무", "Jaen.kr", 30000, "SW 모델링");
		bk[2] = new Magazine("35535", "Java World", "편집부", "Java.com", 7000, 2018, 2, "첫걸음");

//		System.out.println(b1.toString());
//		System.out.println(b2.toString());
//		System.out.println(m1.toString());
		int menuNo = 0;
		
		int idx = 3;
		while (true) {
		
			System.out.println("********** 메뉴목록 *************");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 데이터 전체출력");
			System.out.println("3. isbn으로 검색");
			System.out.println("4. 제목으로 검색");
			System.out.println("5. 책만 검색");
			System.out.println("6. 잡지만 검색");
			System.out.println("7. 출판사로 검색");
			System.out.println("8. 가격 검색");
			System.out.println("9. 금액 합계");
			System.out.println("10. 금액 평균");

			menuNo = sc.nextInt();
			switch (menuNo) {
			case 1:
				int choice=0;
				System.out.println("종류를 선택하세요");
				System.out.println("1. 책	2.잡지");
				choice = sc.nextInt();
				if (choice==1) {
					System.out.println("===== 책 정보 입력 ==== " );
					System.out.print("isbn: ");
					String tmpin= sc.next();
					System.out.print("제목: ");
					String tmptl= sc.next();
					System.out.print("작가: ");
					String tmpath= sc.next();
					System.out.print("출판사: ");
					String tmppb= sc.next();
					System.out.print("가격: ");
					int tmpP = sc.nextInt();
					System.out.print("설명: ");
					String tmpdc= sc.next();
					bk[idx++]= new Book(tmpin, tmptl, tmpath, tmppb, tmpP,tmpdc);
					
					
				} else if(choice==2){
					System.out.println("===== 잡지 정보 입력 ==== " );
					System.out.print("isbn: ");
					String tmpin= sc.next();
					System.out.print("제목: ");
					String tmptl= sc.next();
					System.out.print("작가: ");
					String tmpath= sc.next();
					System.out.print("출판사: ");
					String tmppb= sc.next();
					System.out.print("가격: ");
					int tmpP = sc.nextInt();
					System.out.print("년: ");
					int y= sc.nextInt();
					System.out.print("월: ");
					int m = sc.nextInt();
					System.out.print("설명: ");
					String tmpdc= sc.next();
					bk[idx++]= new Magazine(tmpin, tmptl, tmpath, tmppb, tmpP, y , m,tmpdc);

				}else {
					System.out.println("Wrong input");
				}
				
				break;
			case 2:
				for (int i = 0; i < idx; i++) {
					System.out.println(bk[i].toString());
				}
		

				break;
			case 3:
				System.out.print("isbn 입력: ");
				String searcht =sc.next();
				for (int i = 0; i < idx; i++) {
					if(bk[i].isbn.equals(searcht)) {
						System.out.println(bk[i]);
					}
					
				}

				break;
			case 4:
				System.out.print("제목입력: ");
				String search =sc.next();
				for (int i = 0; i < idx; i++) {
					if(bk[i].isbn.equals(search)) {
						System.out.println(bk[i]);
					}
					
				}

				break;
			case 5:		
				for (int i = 0; i < idx; i++) {
					if(!(bk[i] instanceof Magazine)) {
						System.out.println(bk[i]);
					}
					
				}

				break;
			case 6:
				for (int i = 0; i < idx; i++) {
					if((bk[i] instanceof Magazine)) {
						System.out.println(bk[i]);
					}
					
				}

				break;
			case 7:
				System.out.print("출판사 입력 : ");
				String searchpb =sc.next();
				for (int i = 0; i < idx; i++) {
					if(bk[i].isbn.equals(searchpb)) {
						System.out.println(bk[i]);
					}
					
				}

				break;
			case 8:
				System.out.print("가격 입력 : ");
				int searchp =sc.nextInt();
				for (int i = 0; i < idx; i++) {
					if(bk[i].price< searchp) {
						System.out.println(bk[i]);
					}
					
				}

				break;
			case 9:
				System.out.println("가격 합계");
				int sum=0;
				for (int i = 0; i < idx; i++) {
					sum+=bk[i].price;
				}
				System.out.println(sum);

				break;
			case 10:
				System.out.println("가격 평균");
				int sum1=0;
				for (int i = 0; i < idx; i++) {
					sum1+=bk[i].price;
				}
				System.out.println(sum1/idx);
				break;

			default:
				System.out.println("잘못된 입력입니다");
				break;
			}

		}
	}

}
