package com.ssafy.algo;

import java.util.Scanner;

public class Solution_4408 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int testcase = 1; testcase <= T; testcase++) {
			int N = sc.nextInt();
			// 위쪽(홀수 방) 200개
			// 아래쪽(짝수방) 200개
			int max= 0;
			int[] room = new int[201];
			
			for (int i = 0; i < N; i++) {
				int strm = sc.nextInt();
				int arrm = sc.nextInt();
				if(strm>arrm) {
					int tmp = strm;
					strm=arrm;
					arrm=tmp;
				}
				
				int s = (strm-1)/2+1;
				int a = (arrm-1)/2+1;
				
				for (int j = s; j < a; j++) {
					room[j]++;
				}


				for (int j = 1; j < room.length; j++) {
					if(max<room[j]) {
						max=room[j];
					}
					
				}
				
			}
			System.out.println("#"+ testcase+ " " +max);
		}

	}

}
