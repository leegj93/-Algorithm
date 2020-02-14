package com.ssafy.algo;

import java.util.Scanner;

public class BJ11559 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][] map = new char[12][6];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 12; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < 6; j++) {
				map[i][j]=str.charAt(j);
				System.out.print(map[i][j]);	
			}
			System.out.println();
		}

	}

}
