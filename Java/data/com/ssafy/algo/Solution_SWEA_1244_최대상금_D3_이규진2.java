package com.ssafy.algo;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_SWEA_1244_최대상금_D3_이규진2 {
	public static int N, result;
	public static String s;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			s = sc.next();
			N = sc.nextInt();
			
			result=0;
			System.out.print("#"+test_case+ " ");
			CardSW(0,0);
			System.out.println(result);

			
		}
	}//end of main
	
	public static void CardSW(int n , int index) {
		if(n==N) {
			result = Math.max(result, Integer.parseInt(s));
			return;
		}
		if (s.length()<=2) {
			for (int i = 0; i < s.length(); i++) {
				for (int j = i+1; j < s.length(); j++) {
					swap(i, j);
					CardSW(n+1,i);
					swap(j,i);
				}
			}
			
		}else {
			for (int i = index; i < s.length(); i++) {
				for (int j = i+1; j < s.length(); j++) {
					if(s.charAt(i)<=s.charAt(j)) {
						
						swap(i, j);
						CardSW(n+1, i);
						swap(j, i);
						
					}
				}
			
		}
			
		}
	}

	public static void swap(int j, int i) {
		  StringBuilder Num = new StringBuilder(s);
	        char charA = s.charAt(i);
	        char charB = s.charAt(j);
	        Num.setCharAt(i, charB);
	        Num.setCharAt(j, charA);
		
	}


}// end of class

