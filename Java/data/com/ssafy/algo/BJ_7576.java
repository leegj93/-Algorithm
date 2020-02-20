package com.ssafy.algo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_7576 {
	static class Point {
		int r;
		int c;

		public Point(int c, int r) {
			this.r = r;
			this.c = c;
		}
	}

	static int[][] map;
//	static int[][] visited;
	static int dc[] = { -1, 1, 0, 0 };
	static int dr[] = { 0, 0, -1, 1 };
	static int N, M, Day;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		map = new int[N][M];
//		visited = new int[N][M];
		Day = 0;
		for (int i = 0; i < N; i++) {
//			String s = sc.nextLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();
//				map[N][M]=num;
			}
		}
		Bfs();
	}// end of main

	static void Bfs() {
		Queue<Point> q = new LinkedList<Point>();

		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				if (map[r][c] == 1) {
//					visited[r][c] = 1;
					q.add(new Point(c, r));

				}
			}

		}
		while (!q.isEmpty()) {
			Point p = q.poll();
			Day++;
			for (int j = 0; j < dc.length; j++) {
				int nc = p.c + dc[j];
				int nr = p.r + dr[j];
				if (nc < 0 || nr < 0 || nc >= M || nr >= N) {
					continue;
				}
				if (map[nr][nc] != 0 ) {
					continue;
				}
//				if(visited[nr][nc]!=0) {
//					continue;
//				}
				map[nr][nc] = map[p.r][p.c]+1;
				q.add(new Point(nc, nr));
			}

		}
		int max=0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 0) {
					//토마토가 모두 익지 못한 상황이라면 -1 을 출력한다.
					System.out.println(-1);
					return;
				}
				max = Math.max(max, map[i][j]);
			}
		}
		System.out.println(max-1);
	
	}// end of Bfs
}// end of class
