package com.ssafy.algo;

import java.util.Scanner;

public class BJ_2447 {
	static char [][] map ;
	public static void star(int r, int c, int n) {
		if(n==1) {
			map[r][c]='*';
			return;
		}
		int num = n/3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i==1 &&j==1) {
					continue;
				}
				else {
					star(r+(num*i), c+(num*j), num);
				}
				
			}
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb= new StringBuilder();
		int N = sc.nextInt();
		map= new char[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j]=' ';
				
			}
		}
		
		star(0,0,N);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(map[i][j]);
				
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		
		

	}

}
