package com.ssafy.algo;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class BJ_17135_캐슬디펜스 {
	public static int[][] map;
	public static int[] set;
	public static int n, m, d;
	public static int[][] copyed;
	public static int[] dy = { 0, -1, 0 };
	public static int[] dx = { -1, 0, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
		map = new int[n + 1][m];
		set = new int[3];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt();
			}
		} // mapping
		
		makeset(0, 0);

	}

	public static void copyMap() {// 기존의 맵을 유지하기 위한 복사맵
		copyed = new int[n + 1][m];
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < m; j++) {
				copyed[i][j] = map[i][j];
			}
		}
	}

	// 궁수의 위치 배정 함수(조합으로 짜야함)

	public static void makeset(int k, int cnt) {
		if (cnt == 3) {
			// 게임 시작
			copyMap();
			for (int i = 0; i < 3; i++) {
				copyed[n][set[i]] = 2;
			}
			printmap();
			playgame();

			return;
		} else {
			for (int i = k; i < m ; i++) {
				set[cnt] = i;
				makeset(i+1, cnt + 1);
			}
			cnt--;

		}

	}// end of main

	public static void printmap() {
		for (int i = 0; i < n + 1; i++) {
			System.out.println(Arrays.toString(copyed[i]));
		}
		System.out.println();
	}

	public static void playgame() {
		/**
		 * set과 map의 상태를 받아서 한 턴마다 map이 아래로 쉬프트 궁수의 사정거리 내로 적이 등장하면 가장 왼쪽에 있는 적부터 공격,
		 * 여러명의 궁수가 한명을 공격할 수도 있음. 즉 map[i]내의 1의 개수가 3보다 적으면 적을 다 지움
		 * 
		 */
		List<Pair> archerlist = new ArrayList<>();
		for (int i = 0; i <m; i++) {
			if(copyed[n][i]==2) {
				archerlist.add(new Pair(n,i,0));
			}
		}
		int line = n;
		while(line>0) {
			Queue<Pair> dead = new LinkedList<>();
			for (Pair pair : archerlist) {
				PriorityQueue<Pair> pq = new PriorityQueue<>(Pair::compare);
			}
		}
		
		
	}

	static class Pair{
		int x, y, dist;
		public Pair(int x, int y, int dist) {
			this.x= x;
			this.y= y;
			this.dist=dist;
		}
		private static int compare(Pair o1, Pair o2) {
			if(o1.dist!=o2.dist) {
				return Integer.compare(o1.dist, o2.dist);
			}else
				return Integer.compare(o1.y, o2.y);
		}
	}
}// end of class