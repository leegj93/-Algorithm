package com.ssafy.algo;

import java.util.Scanner;

public class BJ_17471_게리멘더링 {
	
	public static int[] pN;
	public static int[][] map;
	public static boolean[] visited;
	public static boolean[] check;
	public static int N, k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
//		6 - N의 값
		pN = new int [N+1];
		map= new int [N+1][N+1];
//		5 2 3 4 1 2 구역의 인구 수(1부터 N까지)
		for (int i = 1; i <= N; i++) {
			pN[i]=sc.nextInt();
		}
		for (int i = 1; i <= N; i++) {
			int e= sc.nextInt();// 인접한 정점의 개수
			for (int j = 0; j < e; j++) {
				int v = sc.nextInt();// 연결된 정점
				map[i][v]=1;
				map[v][i]=1;
			}
		}
		
//		2 2 4 : 1번 구역과 인접
//		4 1 3 6 5 : 2번 구역
//		2 4 2 : 3번
//		2 1 3 : 4번
//		1 2 : 5번
//		1 2 : 6번
		
//		4(4) - 3(3)
//		|		|
//		1(5) - 2(2) - 6(2)
//				|
//				5(1)
		for (int i = 0; i < (N/2)+1; i++) {
			k=i;
			check=new boolean[N+1];
			comb(1,0);
			
			
		}
	}//end of main
	
	static void comb(int start, int cnt) {
		if(cnt==k) {
			
			for (int i = 1; i < N+1; i++) {
				if (check[i]==true) {
					
				}else {
					
				}
				
		}
			for (int i = start; i < N+1; i++) {
				check[i]=true;
				comb(i+1, cnt+1);
				check[i]=false;
				
			}
		}
		
	}
}//end of class
