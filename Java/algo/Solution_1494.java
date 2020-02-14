package com.ssafy.algo;

import java.util.ArrayList;
import java.util.Scanner;

// V = x*x + y*y 이동 거리 구하는 공식
public class Solution_1494 {
	static class Point {
		int x, y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			ArrayList<Point> list = new ArrayList<Point>();
			for (int i = 0; i < N; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				list.add(new Point(x, y));

			}

		} // end of test_case
	}// end of main

	public static void dfs(ArrayList<Point> list,int x, int y, int N, int index) {
		if (N / 2==0) {

		}else {
			for (int i = index; i < list.size()/2; i++) {
				Point a= list.get(i);
				int x1 = x+a.x;
				int y1 = y+a.y;
				dfs(list, x1, y1, N, index+1);
				
			}
			
		}

	}
}
