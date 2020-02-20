package com.ssafy.java;

public class AlphaTest2 {

	public static void main(String[] args) {
		char a = 'A';
		for(int i = 0; i < 5; i++) {
			for (int j = 0; j <5; j++) {
				if(i+j>=4) {
					System.out.print((char)(a)+"\t");
					a++;
					if(j==4) {
						break;
					}
					
				}
				else {
					System.out.print("\t");
				}
				
			}
			System.out.println('\n');
		}


	}

}
