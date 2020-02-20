package com.java.first;

import java.util.Scanner;

public class DigitTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[100];
		int num = 0;
		while(true) {
			int tmp = sc.nextInt();
			if(tmp==0)break;
			arr[num]= tmp;
			num++;
			
		}
		int result[] = new int[10];
		for(int i=0; i<num; i++) {
			result[arr[i]/10]++;
		}
		for(int i=0; i <10; i++) {
			if(result[i] != 0) {
				System.out.println(i+" : "+result[i]+"개");
			}
		}
				
	}

}
