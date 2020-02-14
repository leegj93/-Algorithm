package com.ssafy.algo;

import java.util.Scanner;

public class BJ_2563 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] map = new int[100][100];
		int result = 0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] x = new int[N];
		int [] y = new int[N];
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			for (int r = y[i]; r < y[i]+10; r++) {
				for (int c = x[i]; c <  x[i]+10; c++) {
					if(map[r][c]!=1) {
						map[r][c]=1;
						result++;
					}
				}
				
			}
			
		}
//		for (int j = 0; j < map.length; j++) {
//			for (int j2 = 0; j2 < map.length; j2++) {
////				System.out.print(map[j][j2]);
//				if(map[j][j2]==1) {
//					result++;
//				}
//			}
////			System.out.println();
//		}
		System.out.println(result);

	}

}
