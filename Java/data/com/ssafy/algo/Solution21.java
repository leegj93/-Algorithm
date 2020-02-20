package com.ssafy.algo;
import java.util.Scanner;

public class Solution21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int testcase = 1; testcase <= T; testcase++) {
			int N = sc.nextInt();
			int bug = sc.nextInt();
			int map[][] = new int[N][N];
			int idxX[] = new int[bug];
			int idxY[] = new int[bug];
			int vec[] = new int[bug];
			for (int i = 0; i < bug; i++) {
				idxX[i] = sc.nextInt();
				idxY[i] = sc.nextInt();
				vec[i] = sc.nextInt();
			}
			int answer = bug;
			for (int i = 0; i < bug; i++) {
				int curX = idxX[i];
				int curY = idxY[i];
//				map[curX][curY] = i+1;
				if(vec[i]==1) {
					for (int jump = 3; jump > 0; jump--) {
						if((curX-jump)<0) {
							answer--;
							break;
						}
						curX-=jump;
						if(map[curX][curY]!=0) {
							for (int j = 0; j < bug; j++) {
								if(i==j) {
									break;
								}
								else if(curX==idxX[j] && curY==idxY[j]) {
									answer--;
									
								}
							}
						}
					}
					map[curX][curY]=i+1;
					idxX[i]=curX;
					idxY[i]=curY;
				}else if(vec[i]==2) {
					for (int jump = 3; jump > 0; jump--) {
						if((curX+jump)>=N) {
							answer--;
							break;
						}
						curX+=jump;
						if(map[curX][curY]!=0) {
							for (int j = 0; j < bug; j++) {
								if(curX==idxX[j] && curY==idxY[j]) {
									if(i==j)continue;
									answer--;
									
								}
							}
						}
					}
					map[curX][curY]=i+1;
					idxX[i]=curX;
					idxY[i]=curY;
				}else if(vec[i]==3) {
					for (int jump = 3; jump > 0; jump--) {
						if((curY-jump)<0) {
							answer--;
							break;
						}
						curY-=jump;
						if(map[curX][curY]!=0) {
							for (int j = 0; j < bug; j++) {
								if(curX==idxX[j] && curY==idxY[j]) {
									if(i==j)continue;
									answer--;
									
								}
							}
						}
						
					}
					map[curX][curY]=i+1;
					idxX[i]=curX;
					idxY[i]=curY;
					
				}else if(vec[i]==4) {
					for (int jump = 3; jump > 0; jump--) {
						if((curY+jump)>=N) {
							answer--;
							break;
						}
						curY+=jump;
						if(map[curX][curY]!=0) {
							for (int j = 0; j < bug; j++) {
								if(curX==idxX[j] && curY==idxY[j]) {
									if(i==j)continue;
									answer--;		
								}
							}
						}
						
					}
					map[curX][curY]=i+1;
					idxX[i]=curX;
					idxY[i]=curY;
				}
//				System.out.println(answer +" "+ idxX[i]+" "+idxY[i]);
				
			}
//			for (int i = 0; i < map.length; i++) {
//				for (int j = 0; j < map.length; j++) {
//					System.out.print(map[i][j]);
//				}
//				System.out.println();
//			}
			System.out.println("#"+ testcase+ " " +answer);
		} // end of testcase

	}// end of main

}// end of class
