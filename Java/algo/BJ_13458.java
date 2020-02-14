package com.ssafy.algo;

import java.util.Scanner;

public class BJ_13458 {
	static int [] A;
	static long N, B, C;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		A= new int [N];
		for (int i = 0; i < N; i++) {
			A[i]=sc.nextInt();
			
		}
		B = sc.nextInt();//총 감독이 감시할수 있는 응시자의 수,
		// 총감독은 방마다 한명
		C = sc.nextInt();// 부감독관이 감시할 수 있는 응시자의 수
		// 부감독은 여러명이 있을 수 있슴
		long cnt=0;
		//입력받은 A에서 B를 빼고 
		//C로 나눈 몫이 0보다 작으면 1을 더하고 몫이 0이면 그대로
		//1을 더한 값이 각 반마다 필요한 감독의 수
		for (int i = 0; i < N; i++) {
			A[i]-=B;
			cnt++;
			if(A[i]>0) {
				if(A[i] % C==0) {
					cnt+=(A[i]/C);
				}
				else {
					cnt+=(A[i]/C)+1;
				}
			}
		}
		System.out.println(cnt);
	}

}
