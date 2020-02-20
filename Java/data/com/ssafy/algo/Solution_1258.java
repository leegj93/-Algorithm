package com.ssafy.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution_1258 {
	static class Point implements Comparable<Point>{
		int x, y;
		Point(int x, int y){
			this.x=x;
			this.y=y;
		}
		@Override
		public int compareTo(Point o){
			int first = x*y;
			int second =o.x*o.y;
			return first> second? 1 : first ==second?(y>o.y?1:-1):-1;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int [][] map = new int[N][N];
			boolean [][] visited = new boolean[N][N];
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					int num = sc.nextInt();
					if(num !=0) {
						map[i][j]++;
					}
				}
			}//end of mapping
			int startX=0;
			int startY=0;
			int endX=0;
			int endY=0;
			ArrayList<Point> list = new ArrayList<Point>();
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					if (map[i][j]==1 && !visited[i][j]) {
						startY=i;
						startX=j;
						for (int k = j+1; k < map.length; k++) {
							if(map[i][k]==0) {
								endX=k-1;
								break;
							}endX=N-1;
						}
						for (int k2 = i+1; k2 < map.length; k2++) {
							if (map[k2][j]==0) {
								endY=k2-1;
								break;
							}endY=N-1;
						}
						int X= endX-startX+1;
						int Y= endY-startY+1;
						for (int y = startY; y < endY+1; y++) {
							for (int x = startX; x < endX+1; x++) {
								visited[y][x]=true;
							}
							
						}
						list.add(new Point(X,Y));
					}
					
					
					
				}
			}
			Collections.sort(list);
			System.out.print("#"+ test_case+ " "+ list.size()+" ");
			for(Point p:list) {
				System.out.print(p.y + " "+ p.x + " ");
			}
			System.out.println();
		}
	}
}
