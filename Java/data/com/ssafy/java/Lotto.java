package com.ssafy.java;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lotto {
	int lo[] = new int[6];
	
	public void selectLotto() {
		int num[] = new int[46];
		for (int i =0; i<45; i++) {
			num[i]=(int) (Math.random()*45+1);	
		}
		for (int i =0; i<6; i++) {
			lo[i]=num[i];
//			System.out.println(lo[i]);
			uniqueNumber(i);
		}
		
		
		
	}
	private int uniqueNumber(int index) {
		int imsi;
		boolean eq;
		Random ran=new Random();
		
		do {
			imsi=ran.nextInt(45)+1;
			eq = false;
			for(int j = 0; j< index; j++) {
				if(imsi == lo[j]) {
					eq =true;
					break;
				}
			}
			
		}while(eq);
		return imsi;
	}
	void print() {
		System.out.print("* 로또당첨번호는 => ");
		for (int i =0; i<6; i++) {
			System.out.print(lo[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lotto lotto= new Lotto();
		lotto.selectLotto();
		lotto.print();

	}

}
