package com.ssafy.algo;

import java.util.Scanner;

public class BJ_14888 {
	static int[] op;
	static int numArr[];
	static int N;
	static int max = 0;
	static int min = 999999999;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		numArr = new int[N];
		op = new int[4];
		for (int i = 0; i < N; i++) {
			numArr[i] = sc.nextInt();
		}
		for (int i = 0; i < op.length; i++) {
			op[i] = sc.nextInt();
		}
		Dfs(1, numArr[0]);
		System.out.println(max);
		System.out.println(min);

	}// end of main

	static void Dfs(int x, int sum) {
		if (x == N) {
			if (max < sum) {
				max = sum;
			}
			if (min > sum) {
				min = sum;
			}

		}
		for (int idx = 0; idx < 4; idx++) {
			if (op[idx] != 0) {
				op[idx]--;
				switch (idx) {
				case 0:
					Dfs(x + 1, sum + numArr[x]);

					break;
				case 1:
					Dfs(x + 1, sum - numArr[x]);

					break;
				case 2:
					Dfs(x + 1, sum * numArr[x]);

					break;
				case 3:
					Dfs(x + 1, sum / numArr[x]);

					break;
				}
				op[idx]++;
			}

		}
	}

}// end of class
/*
 * numArr 배열을 탐색하면서 op 배열에서 0이 아니면 해당하는 위치의 연산자에 해당하는 연산을 수행 후 배열 내의 숫자를 감소 결과
 * 값을 저장 탐색 종료 후 결과 값을 비교해서 max와 min 값에 저장
 * 
 */
