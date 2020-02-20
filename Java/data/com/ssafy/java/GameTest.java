package com.ssafy.java;

import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		String s1 = new String("가위");
		String s2 = new String("바위");
		String s3 = new String("보");
		
		System.out.println(">> 가위바위보 게임을 시작합니다. 아래보기 중 하나를 고르세요");
		System.out.println("1. 5판 3승\r\n" +"2. 3판 2승\r\n"+"3. 1판 1승");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num == 1) {//5판 3승
			int cntP=0;//사람의 승리수
			int cntC=0;//컴퓨터의 승리수
			while(true) {
				if(cntP>2) {
					System.out.println("### 사용자 승!!!!");
					break;
				}
				if(cntC>2) {
					System.out.println("### 컴퓨터 승!!!!");
					break;
				}
				System.out.println("가위바위보 중 하나 입력");
				String pick = sc.next();
				int a = (int) (Math.random()*3)+1;
				if(pick.equals(s1)) {
					if(a==1) {
						System.out.println("비겼습니다.");
					}
					else if(a==2) {
						System.out.println("졌습니다.");
						cntC++;
					}
					else if(a==3) {
						System.out.println("이겼습니다.");
						cntP++;
					}
				}
				else if(pick.equals(s2)) {
					if(a==2) {
						System.out.println("비겼습니다.");
					}
					else if(a==3) {
						System.out.println("졌습니다.");
						cntC++;
					}
					else if(a==1) {
						System.out.println("이겼습니다.");
						cntP++;
					}
					
				}
				else if(pick.equals(s3)) {
					if(a==3) {
						System.out.println("비겼습니다.");
					}
					else if(a==1) {
						System.out.println("졌습니다.");
						cntC++;
					}
					else if(a==2) {
						System.out.println("이겼습니다.");
						cntP++;
					}
					
				}
			}
		}//5판 3승
		else if(num==2) {
			int cntP=0;//사람의 승리수
			int cntC=0;//컴퓨터의 승리수
			while(true) {
				if(cntP>1) {
					System.out.println("### 사용자 승!!!!");
					break;
				}
				if(cntC>1) {
					System.out.println("### 컴퓨터 승!!!!");
					break;
				}
				System.out.println("가위바위보 중 하나 입력");
				String pick = sc.next();
				int a = (int) (Math.random()*3)+1;
				if(pick.equals(s1)) {
					if(a==1) {
						System.out.println("비겼습니다.");
					}
					else if(a==2) {
						System.out.println("졌습니다.");
						cntC++;
					}
					else if(a==3) {
						System.out.println("이겼습니다.");
						cntP++;
					}
				}
				else if(pick.equals(s2)) {
					if(a==2) {
						System.out.println("비겼습니다.");
					}
					else if(a==3) {
						System.out.println("졌습니다.");
						cntC++;
					}
					else if(a==1) {
						System.out.println("이겼습니다.");
						cntP++;
					}
					
				}
				else if(pick.equals(s3)) {
					if(a==3) {
						System.out.println("비겼습니다.");
					}
					else if(a==1) {
						System.out.println("졌습니다.");
						cntC++;
					}
					else if(a==2) {
						System.out.println("이겼습니다.");
						cntP++;
					}
					
				}
			}
		}//3판 2승
		else if(num==3) {
			int cntP=0;//사람의 승리수
			int cntC=0;//컴퓨터의 승리수
			while(true) {
				if(cntP==1) {
					System.out.println("### 사용자 승!!!!");
					break;
				}
				if(cntC==1) {
					System.out.println("### 컴퓨터 승!!!!");
					break;
				}
				System.out.println("가위바위보 중 하나 입력");
				String pick = sc.next();
				int a = (int) (Math.random()*3)+1;
				if(pick.equals(s1)) {
					if(a==1) {
						System.out.println("비겼습니다.");
					}
					else if(a==2) {
						System.out.println("졌습니다.");
						cntC++;
					}
					else if(a==3) {
						System.out.println("이겼습니다.");
						cntP++;
					}
				}
				else if(pick.equals(s2)) {
					if(a==2) {
						System.out.println("비겼습니다.");
					}
					else if(a==3) {
						System.out.println("졌습니다.");
						cntC++;
					}
					else if(a==1) {
						System.out.println("이겼습니다.");
						cntP++;
					}
					
				}
				else if(pick.equals(s3)) {
					if(a==3) {
						System.out.println("비겼습니다.");
					}
					else if(a==1) {
						System.out.println("졌습니다.");
						cntC++;
					}
					else if(a==2) {
						System.out.println("이겼습니다.");
						cntP++;
					}
					
				}
			}
		}
	}//main

}
