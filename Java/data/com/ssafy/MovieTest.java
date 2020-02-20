package com.ssafy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MovieTest {
	public static void main(String[] args) throws InputMismatchException {
		
		Scanner sc = new Scanner(System.in);
		int menuNo=0;
		
		MovieMgr MMgr= MovieMgr.getMgr();
		MMgr.add(new Movie("스타워즈1", "스티븐", 10, "SF", "빵야"));
		MMgr.add(new Movie("스타워즈2", "스티븐", 9, "SF","빵야2"));
		MMgr.add(new Movie("스타워즈3", "스티븐", 7, "SF", "빵야3"));
		MMgr.add(new Movie("기생충", "봉준호", 5, "스릴러", "기생충기생충기생충"));
		while (true) {
			
			System.out.println("********** 메뉴목록 *************");
			System.out.println("1. 영화 정보 입력");
			System.out.println("2. 영화 정보 전체 검색");
			System.out.println("3. 영화명 검색");
			System.out.println("4. 영화 감독별 검색");
			System.out.println("5. 영화 장르별 검색");
			System.out.println("6. 영화 정보 삭제");
			System.out.println("0. 종료");
			System.out.println("원하는 번호를 선택하세요");
			
			menuNo = sc.nextInt();
			switch (menuNo) {
			case 1:
				System.out.println("영화 정보를 입력하세요");
				System.out.println("제목 ");
				String tmpTitle = sc.next();
				System.out.println("감독 ");
				String tmpDirector = sc.next();
				System.out.println("평점 ");
				int tmpGrade= sc.nextInt();
				System.out.println("장르 ");
				String tmpGenre = sc.next();
				System.out.println("설명 ");
				String tmpSummary = sc.next();
				Movie m = new Movie(tmpTitle, tmpDirector,tmpGrade,tmpGenre,tmpSummary);
				MMgr.add(m);
				
				continue;
			case 2:
				for (int i = 0; i < MMgr.getSize(); i++) {
					System.out.println(MMgr.search()[i].toString()); 
				}
				continue;
			case 3:
				System.out.println("제목을 입력하세요");
				String title= sc.next();
				for (int i = 0; i < MMgr.getSize(); i++) {
					if (MMgr.search(title)[i] != null)
					System.out.println(MMgr.search(title)[i].toString());
	
				}
				
				continue;
			case 4:
				System.out.println("감독을 입력하세요 ");
				String search =sc.next();
				for (int i = 0; i < MMgr.getSize(); i++) {
					if (MMgr.searchDirector(search)[i] != null)
					
					System.out.println(MMgr.searchDirector(search)[i].toString());
	
				}
				
				continue;
			case 5:		
				System.out.println("장르를 입력하세요 ");
				String searchG =sc.next();
				for (int i = 0; i < MMgr.getSize(); i++) {
					if (MMgr.searchGenre(searchG)[i] != null)
						System.out.println(MMgr.searchGenre(searchG)[i].toString());
				}
				
				continue;
			case 6:
				System.out.println("제목을 입력하세요 ");
				String searchT =sc.next();
				MMgr.delete(searchT);				
				
				continue;
			case 0:
				System.out.println("프로그램을 종료합니다 ");
				break;
				
			}
			break;
			
			
		}
	}
}
