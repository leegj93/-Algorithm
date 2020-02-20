package com.ssafy.java;

public class AlphaTest1 {

	public static void main(String[] args) {
		char a = 'A';
		for(int i = 0; i < 5; i++) {
			for (int j = 0; j <5; j++) {
				
				System.out.print((char)(a)+"\t");
				a++;
				if(i==j) {
					
					break;
				}
				
			}
			System.out.println('\n');
		}


	}

}
