package com.ssafy.algo;

import java.util.Scanner;

public class Solution_SWEA_1244_최대상금_D3_이규진 {
	public static int N, result;
	public static String s;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			s = sc.next();
			N = sc.nextInt();
			StringBuilder Num = new StringBuilder(s);

			result = 0;
			System.out.print("#" + test_case + " ");

			int max = 0;

			for (int i = 0; i < Num.length() && N > 0; i++) {
				char charA = Num.charAt(i);
				int maxIndex = i;
				for (int j = i + 1; j < Num.length(); j++) {
					if (Num.charAt(i) <= Num.charAt(j)) {
						if (Num.charAt(j) >= Num.charAt(maxIndex)) {
							maxIndex = j;
						}
					}
				}
				if (maxIndex != i) {
					Num.setCharAt(i, Num.charAt(maxIndex));
					Num.setCharAt(maxIndex, charA);
					N--;
					}
				}

			
			if(N%2 ==1) {
				int temp =Num.length()-1;
				Num.setCharAt(temp, Num.charAt(temp-1));
				Num.setCharAt(temp-1, Num.charAt(temp));
			}
			
		}
		

	}// end of main

	public static void find(int n, int index) {
		if (n == N) {
			result = Math.max(result, Integer.parseInt(s));
			return;
		}
		if (s.length() <= 2) {
			for (int i = 0; i < s.length(); i++) {
				for (int j = i + 1; j < s.length(); j++) {
					swap(i, j);
					find(n + 1, i);
					swap(j, i);
				}
			}

		} else {
			for (int i = index; i < s.length(); i++) {
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(i) <= s.charAt(j)) {

						swap(i, j);
						find(n + 1, i);
						swap(j, i);

					}
				}

			}

		}
	}

	public static void swap(int j, int i) {
		StringBuilder changeNum = new StringBuilder(s);
		char charA = s.charAt(i);
		char charB = s.charAt(j);
		changeNum.setCharAt(i, charB);
		changeNum.setCharAt(j, charA);
		s = changeNum.toString();

	}

}// end of class
