package com.ssafy.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BJ_17144_미세먼지 {
	public static class Air {
		int r;
		int c;

		public void setR(int r) {
			this.r = r;
		}

		public void setC(int c) {
			this.c = c;
		}

		public Air(int r, int c) {
			this.r = r;
			this.c = c;

		}

	}

	public static int[][] map;
	public static int[] dr = { -1, 1, 0, 0 };
	public static int[] dc = { 0, 0, -1, 1 };
	public static int R, C, T;
	public static int[][] dust;
	public static Air[] A;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		R = sc.nextInt();
		C = sc.nextInt();
		T = sc.nextInt();

		map = new int[R][C];
		A = new Air[2];
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				int temp = sc.nextInt();
				map[i][j] = temp;
				if (temp == -1) {

					if (A[0] == null) {
						A[0] = new Air(i, j);
					} else {
						A[1] = new Air(i, j);
					}
				}

			}
		} // dust list
		int time = 0;
		while (time < T) {
			dust = new int[R][C]; // 매번 spread되는 거 저장
			int cnt = 0;
			int mul = 0;
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {
					if (map[i][j] > 0) {
						cnt = 0;
						for (int d = 0; d < dr.length; d++) {
							int nr = i + dr[d];
							int nc = j + dc[d];
							// 범위 안에 있고, 공기청정기가 아니면
							if (0<=nr && nr<R && 0<=nc && nc<C&& map[nr][nc] != -1) {
								cnt++;
								dust[nr][nc] += (map[i][j] / 5);
							}
						} // 네 방향으로 미세먼지 확산
						mul = (map[i][j] / 5) * cnt;
						map[i][j] -= mul; // 확산된 방향 미세먼지 빼줌
					}
				}
			} // 미세먼지 지도에 퍼트리기
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {
					map[i][j] += dust[i][j]; // 확산된 양 총 더해줌
				}
			}
			// 아래 공기 청정기 작동
			for (int i = A[1].r + 1; i < R - 1; i++) {
				map[i][0] = map[i + 1][0];
			} // 공기 빨아들이기
			for (int i = 0; i < C - 1; i++) {
				map[R - 1][i] = map[R - 1][i + 1];

			} // 맨 밑의 공기 순환
			for (int i = R - 1; i > A[1].r; i--) {
				map[i][C - 1] = map[i - 1][C - 1];

			} // 오른쪽 아래로 공기 순환
			for (int i = C - 1; i > 0; i--) {
				map[A[1].r][i] = map[A[1].r][i - 1];
			} // 공기 오른쪽으로 한칸씩 밀기
//			
			map[A[1].r][1] = 0;
			// 위쪽 공기청정기
			for (int i = A[0].r - 1; i > 0; i--) {
				map[i][0] = map[i - 1][0];
			} // 공기 빨아들이기
			for (int i = 0; i < C - 1; i++) {
				map[0][i] = map[0][i + 1];

			} // 맨 위의 공기 순환
			for (int i = 0; i < A[0].r; i++) {
				map[i][C - 1] = map[i + 1][C - 1];

			} // 오른쪽 위로 공기 순환
			for (int i = C - 1; i > 0; i--) {
				map[A[0].r][i] = map[A[0].r][i - 1];
			} // 공기 오른쪽으로 한칸씩 밀기
//			
			map[A[0].r][1] = 0;
//			

//		        

			
			time++;
		} // 시간에 따른 미세먼지 퍼짐
		int total = 0;

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (map[i][j] != -1) {
					total += map[i][j];
				}
			}
		}
		System.out.println(total);
	}
}
