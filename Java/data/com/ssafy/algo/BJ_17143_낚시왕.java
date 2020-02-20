package com.ssafy.algo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BJ_17143_낚시왕 {

	public static class fish implements Comparable<fish> {
		int r;
		int c;
		int s;
		int d;
		int z;

		public fish(int r, int c, int s, int d, int z) {
			this.r = r;
			this.c = c;
			this.s = s;
			this.d = d;
			this.z = z;

		}

		public void setR(int r) {
			this.r = r;
		}

		public void setC(int c) {
			this.c = c;
		}

		public void setS(int s) {
			this.s = s;
		}

		public void setD(int d) {
			this.d = d;
		}

		public void setZ(int z) {
			this.z = z;
		}

		@Override
		public int compareTo(fish o) {// 낚시꾼은 자신 열의 가장 가까운 상어를 낚기 때문에 열에 대해서 정렬을 진행 후 열이 같으면 행에 대해서 정렬
			if (this.c == o.c) {
				if (this.r == o.r) {
					return this.z < o.z ? 1 : -1;

				} else {
					return this.r < o.r ? -1 : 1;
				}

			}
			return this.c < o.c ? -1 : 1;
		}

	}

	public static int[][] map;
	public static int R, C, M;
	public static int[] dr = { 0, -1, 1, 0, 0 };
	public static int[] dc = { 0, 0, 0, 1, -1 };
	public static ArrayList<fish> list;
	public static int[][] size;
	public static int[][] dir;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		R = sc.nextInt();
		C = sc.nextInt();
		M = sc.nextInt();
		list = new ArrayList<fish>();

		for (int i = 0; i < M; i++) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			int s = sc.nextInt();
			int d = sc.nextInt();
			int z = sc.nextInt();
			list.add(new fish(r - 1, c - 1, s, d, z));

		}
		int time = 0;
		int answer = 0;
		while (time < C) {
			// 시간이 증가 시간에 따라 낚시꾼의 위치가 바뀜
			Collections.sort(list);
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).c == time) {
					answer += list.get(i).z;// 잡은 물고기의 크기를 더함
					list.remove(i); // 잡은 물고기 제거
					break;
				}
			} // 물고기 잡기
				// 물고기 이동
			for (int i = 0; i < list.size(); i++) {
				fish f = list.get(i);
				int r = f.r;
				int c = f.c;
				int dir = f.d;
				int cnt = f.s;
				while (cnt > 0) {
					r += dr[dir];
					c += dc[dir];
					if (r < 0 || c < 0 || r >= R || c >= C) {
						r -= dr[dir];
						c -= dc[dir];
						if (dir == 1) {
							dir = 2;
						} else if (dir == 2) {
							dir = 1;
						} else if (dir == 3) {
							dir = 4;
						} else if (dir == 4) {
							dir = 3;
						}
						continue;
					}
					cnt--;
				}
				list.get(i).setR(r);
				list.get(i).setC(c);
				list.get(i).setD(dir);

			}
			map = new int[R][C];
			size = new int[R][C];
			dir = new int[R][C];
			for (int i = 0; i < list.size(); i++) {
				int r = list.get(i).r;
				int c = list.get(i).c;
				if (map[r][c] == 0) {
					map[r][c] = list.get(i).z;
					size[r][c] = list.get(i).s;
					dir[r][c] = list.get(i).d;
				} else {
					if (map[r][c] < list.get(i).z) {
						map[r][c] = list.get(i).z;
						size[r][c] = list.get(i).s;
						dir[r][c] = list.get(i).d;
					}

				}

			}
			list.clear();
			for (int r = 0; r < R; r++) {
				for (int c = 0; c < C; c++) {
					if(map[r][c]!=0)
					list.add(new fish(r, c, size[r][c], dir[r][c], map[r][c]));
					
				}
				
			}

			time++;
		} // end of while
		System.out.println(answer);
	}// end of main

}// end of class
