package com.ssafy.algo;

import java.util.Scanner;

public class Solution_3289_서로소_집합 {
	
	public static int[] p;
	public static int[] rank;
	public static int[] ans;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
		for (int i = 1; i <= T; i++) {
			int n= sc.nextInt();
			int m= sc.nextInt();
			p = new int [n+1];
			rank = new int [n+1];

			
			
			System.out.print("#"+i+" " );
			for (int j = 1; j < p.length; j++) {
				p[j]=j;
			}
			for (int j = 0; j < m; j++) {
				int o= sc.nextInt();
				int a= sc.nextInt();
				int b= sc.nextInt();
				if(o==0) {
					union(a,b);
				} else { // if(o==1) {
					
					if(findSet(a)==findSet(b)) {
						System.out.print(1);
					}
					else {
						System.out.print(0);
					}
				}
			}
			
			
			System.out.println();
		}//end of tc
	}// end of main



	public static void union(int a, int b) {
		if (a==b) return;
		int pa = findSet(a);
		int pb = findSet(b);
		if(pa>pb) {
			p[pb]=pa;
		}else {
			p[pa]=pb;
			
	
		}
	}

	public static int findSet(int a) {
		if(p[a]==a) {
			return a;
		}else {
			p[a]= findSet(p[a]);
			return p[a];
		}
		
	}
}
