package com.ssafy.algo;

import java.util.Scanner;

public class Main_14487 {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans =0;
		int maxN=0;
		for (int i = 0; i < N; i++) {
			int fee= sc.nextInt();
			maxN= Math.max(maxN, fee);
			ans += fee;
		}
		ans -=maxN;
		System.out.println(ans);
	}
}
