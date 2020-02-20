package com.java.first;

import java.util.Scanner;

public class Compute {
	public static void main(String[] args) {
		System.out.println("입력 예>");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("곱 = "+(a*b)+"\n몫= "+(a/b));
	}

}
