package com.ssafy.java;

import java.util.Scanner;

public class ArrayTest {
	

	public static void main(String[] args) {
		ArrayTest ArrTest = new ArrayTest();
		Scanner sc = new Scanner(System.in);
		int[] list= new int[10];
		for(int i=0; i<list.length; i++) {
			list[i]=sc.nextInt();
		}
		ArrTest.print(list);
		ArrTest.total(list);
		ArrTest.average(list);
		ArrTest.minimum(list);

	}
	
	 void print(int list[]) {
		 for(int i=0; i<list.length;i++) {
			 System.out.print(list[i]+" ");
		 }
		 System.out.println();
		
	}
	 void total(int list[]) {
		 int sum=0;
		 for(int i=0; i<list.length;i++) {
			 sum+=list[i];
			  
		 }
		 System.out.println("배열의 합 :" + sum);
	 }
	 void average(int list[]) {
		 int sum=0;
		 for(int i=0; i<list.length;i++) {
			 sum+=list[i];
			  
		 }
		 double average= (double)sum/(list.length);
		 System.out.println("배열의 평균 : " + average);
		 
	 }
	 void minimum(int list[]){
		 int min = 1000;
		 for(int i=0; i< list.length; i++) {
			 if(min>list[i]) {
				 min= list[i];
			 }
		 }
		 System.out.println("배열의 최솟값 : " + min);
	 }
	 void selectionSort() {
		 
	 }
	 

}
