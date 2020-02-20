package com.ssafy.algo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_13355_트럭 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 트럭의 수
		int w = sc.nextInt();// 다리의 길이
		int L = sc.nextInt();// 견딜수 있는 하중

		Queue<Integer> bri = new LinkedList<>();

		int truck[] = new int[n];
		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
//			q.offer(temp);
			truck[i] = temp;

		}
		int time = 0;// 단위 시간
		int cnt = 0;// 트럭의 갯수
		int sum = 0;
		for (int i = 0; i < n; i++) {
			while(true) {
				if(bri.size()==w) {
					sum-=bri.poll();
				}
				if(sum+truck[i]<=L) {
					break;
				}
				bri.offer(0);
				time++;
			}

			bri.offer(truck[i]);//트럭 입장
			sum += truck[i];//다리 하중
			time++;
		}
		time += w;

		System.out.println(time);
	}

}
