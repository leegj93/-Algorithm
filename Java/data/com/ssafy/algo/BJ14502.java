package com.ssafy.algo;

import java.util.*;
import java.util.Scanner;

public class BJ14502 {
	static class Point{
		int r;
		int c;
		
		public Point(int r, int c){
			this.r=r;
			this.c=c;
		}
	}

	static int N, M;
	static int [][] map, copyed;
	static int cnt;
	static int[] dr = {1, -1, 0, 0};
	static int[] dc = {0, 0, 1, -1};
	static int max = 0;
	static ArrayList<Point> virus;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		map = new int [N][M];
		copyed = new int[N][M];
		virus = new ArrayList<Point>();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j]=sc.nextInt();
				if(map[i][j]==2) {
					virus.add(new Point(i,j));
				}
			}
		}
		setWall(0,0);
		System.out.println(max);
	

	}//end of main
	static void setWall(int start, int cnt) {
		if(cnt==3) {//벽이 3개 세워지면
			copyMap();//맵을 복사
			//바이러스 퍼트리기
			for (Point point : virus) {
				spreadVirus(point.c, point.r);
			}
			max= Math.max(max, getSafeArea());
			return;
		}
		for(int i=start; i<N*M; i++) {
			int r=i/M;
			int c=i%M;
			if(map[r][c]==0) {
				map[r][c]=1;
				setWall(i+1,cnt+1);//dfs로 탐색
				map[r][c]=0;
			}
		}
	}//end of setWall
	
	static void spreadVirus(int c, int r) {
		for (int i = 0; i < 4; i++) {
			int nr = r+dr[i];
			int nc = c+dc[i];
			if(0<= nr&& 0<=nc && nr<N && nc<M) {
				if(copyed[nr][nc]==0) {
					copyed[nr][nc]=2;
					spreadVirus(nc, nr);
				}
			}
		}
		
	}
	 static void copyMap() {// 기존의 맵을 유지하기 위한 복사맵
	        for(int i=0; i<N; i++) {
	            for(int j=0; j<M; j++) {
	                copyed[i][j] = map[i][j];
	            }
	        }
	    }
	 static int getSafeArea() {
	        int safe = 0;
	        for(int i=0; i<N; i++) {
	            for(int j=0; j<M; j++) {
	                if(copyed[i][j] == 0)
	                    safe++;
	            }
	        }
	        return safe;
	 }

}
