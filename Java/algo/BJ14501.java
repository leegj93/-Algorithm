package com.ssafy.algo;

import java.util.Scanner;

public class BJ14501 {
	 static int [] d, p, dp;
	static int N , result;
	// day[] 배열은 날짜 배열
	// score 배열은 받는 돈
	// cnt는 리턴을 해주기 위한 카운트
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		dp = new int[N+2];
		d = new int[N+2];
		p= new int[N+2];
		for (int i = 1; i <= N; i++) {
			d[i]= sc.nextInt();
			p[i] =sc.nextInt();
		}
		for (int i = 1; i <= N+1; i++) {
			for (int j = 1; j < i; j++) {
				dp[i] =Math.max(dp[i], dp[j]);
				if(j+d[j]==i) {
					dp[i]=Math.max(dp[i], dp[j]+p[j]);
				}
			}
			result=Math.max(result, dp[i]);
		}
		System.out.println(result);
		
		
	}//end of main
	
}//end of class
