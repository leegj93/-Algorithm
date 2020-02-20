package com.java.first;

import java.util.Scanner;

public class CheckPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int points = b+100 - a;
		System.out.println("비만수치는 "+points+"입니다.");
		if(points>0) {
			System.out.println("당신은 비만이군요");
		}

	}

}
