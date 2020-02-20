package com.ssafy.algo;

import java.util.Scanner;

public class Solution13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int testcase = 1; testcase <= T; testcase++) {
			int N = sc.nextInt();
			char map[][] = new char[N][N];
			for (int i = 0; i < map.length; i++) {
				for (int k = 0; k < map.length; k++) {
					map[i][k] = sc.next().charAt(0);
				}
			}
			int[] dr = { 0, 0, -1, -1, -1, 1, 1, 1 };
			int[] dc = { -1, 1, 0, -1, 1, 0, 1, -1 };
			int max = 0;
			for (int r = 0; r < map.length; r++) {
				for (int c = 0; c < map.length; c++) {
					if (map[r][c] == 'G')
						continue;
					int cnt = 0;
					int flag = 0;
					for (int i = 0; i < dc.length; i++) {
						int newR = r + dr[i];
						int newC = c + dc[i];
						if (newR >= N || newC >= N || newR < 0 || newC < 0) {
							continue;
						}	
						if (map[newR][newC] == 'G') {
							flag = 1;
							break;
						}
					}
					if (flag == 0) {
						
						for (int i = 0; i < N; i++) {
							if(map[r][i]=='B')
								cnt++;
							if(map[i][c]=='B')
								cnt++;
						}cnt--;
					} else {
						cnt = 2;
					}
					if (cnt > max) {
						max = cnt;
					}
				}
			}
			System.out.println("#" + " " +max);

		} // end of test_case

	}// end of main

}// end of class
