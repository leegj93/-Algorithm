package com.ssafy.algo;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_6603 {
	static int lotto[];

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			lotto=new int [6];
			while(true) {
				int k = sc.nextInt();
				if(k==0) {
					break;
				}
				int ar[] = new int [k];
				for (int i = 0; i < k; i++) {
					ar[i]=sc.nextInt();
				}
//				Arrays.sort(ar);
				Lotto(ar,0, 0);
				System.out.println();
			}
	}//end of main
	public static void Lotto(int arr[],int start, int count) {
		if(count==6) {
			for (int i = 0; i < 6; i++) {
				System.out.print(lotto[i]+" ");
			}
			System.out.println();
		}else {
			for (int i = start; i <arr.length ; i++) {
				lotto[count]=arr[i];
				Lotto(arr, i+1,count+1);
			}
			count--;
			
		}

	}

}//end of class
