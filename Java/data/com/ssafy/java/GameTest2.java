package com.ssafy.java;

import java.util.Scanner;

public class GameTest2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int menuNo = 0, loopCount = 0, winCount = 0;

		do {
			System.out.println(">>>가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
			System.out.println("1. 5판 3승");
			System.out.println("2. 3판 2승");
			System.out.println("3. 1판 1승");
			System.out.print("번호를 입력하세요.");

			menuNo = scan.nextInt();
			if(menuNo == 1) {
				loopCount = 5;
				winCount = 3;
			} else if(menuNo == 2) {
				loopCount = 3;
				winCount = 2;
			} else if(menuNo == 3) {
				loopCount = 1;
				winCount = 1;
			} else {
				System.out.println("wrong number !!!");
			}
		} while(loopCount == 0);

		String inputData = "";
		int comSelect = 0, comWin = 0, userWin = 0;
		while(userWin != winCount && comWin != winCount) {
			comSelect = (int)(Math.random() * 3) + 1;
			System.out.print(comSelect+"가위바위보 중 하나 입력 : ");
			inputData = scan.next();
			if((inputData.equals("가위") && comSelect == 2)
					||(inputData.equals("바위") && comSelect == 3)
					||(inputData.equals("보") && comSelect == 1)){
				System.out.println("졌습니다!!!");
				comWin++;
			} else if((inputData.equals("가위") && comSelect == 3)
					||(inputData.equals("바위") && comSelect == 1)
					||(inputData.equals("보") && comSelect == 2)){
				System.out.println("이겼습니다!!!");
				userWin++;
			
//			} else if(inputData.equals("바위") && comSelect == 3) {
//				System.out.println("졌습니다!!!");
//				comWin++;
//			} else if(inputData.equals("바위") && comSelect == 1) {
//				System.out.println("이겼습니다!!!");
//				userWin++;
//			} else if(inputData.equals("보") && comSelect == 1) {
//				System.out.println("졌습니다!!!");
//				comWin++;
//			} else if(inputData.equals("보") && comSelect == 2) {
//				System.out.println("이겼습니다!!!");
//				userWin++;
			}else if(!inputData.equals("가위")&&
					!inputData.equals("바위")&&
					!inputData.equals("보")) {
				System.out.println("Wrong input");  
			}else {
				System.out.println("비겼습니다!!!");
			}
			System.out.println(comWin+" : "+userWin+" : "+winCount);
		}
		if(comWin == winCount) {
			System.out.println("###컴퓨터 승!!!");
		} else {
			System.out.println("###사용자 승!!!");
		}
	}//main

}
