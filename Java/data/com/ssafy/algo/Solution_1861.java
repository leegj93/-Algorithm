package com.ssafy.algo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution_1861 {
	static class Point {
		int x, y;
		Point(int x, int y) {
			this.x= x;
			this.y= y;
		}
	}

	static int[] dy = { -1, 1, 0, 0 };
	static int[] dx = { 0, 0, -1, 1 };
	static int N, len;
	static int[][] map;
	static boolean[][] visited;
	//bfs로 풀기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int testcase = 1; testcase <= T; testcase++) {
			N = sc.nextInt();
			int maxLen = Integer.MIN_VALUE;
			int minVar = Integer.MAX_VALUE;
			map =new int[N][N];
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					len =0;
					visited = new boolean[N][N];
					BFS(i,j);
					if(maxLen < len) {
						maxLen = len;
						minVar = map[i][j];
					}
					if(maxLen == len && minVar > map[i][j]) {
						minVar = map[i][j];
					}
				}
			}
			
			
			

			System.out.println("#"+ testcase+ " "+minVar+ " "+ maxLen);
		}//end of test case
	}// end of main
	public static void BFS(int y, int x) {
		Queue<Point> q= new LinkedList<Point>();
//		visited[y][x]=true;
		q.offer(new Point(x,y));
		while(!q.isEmpty()) {
			len++;
			int size=q.size();
			for (int i = 0; i < size; i++) {
				Point p = q.poll();
				for (int j = 0; j < dx.length; j++) {
					int nx= p.x+dx[j];
					int ny= p.y+dy[j];
					if(nx>=N||ny>=N || nx< 0 || ny < 0 )continue;
					if(!visited[ny][nx] && map[ny][nx] == map[p.y][p.x]+1) {
						q.offer(new Point(nx,ny));
						visited[ny][nx] = true;
					}
				}
			}
		}
	}

}// end of class
