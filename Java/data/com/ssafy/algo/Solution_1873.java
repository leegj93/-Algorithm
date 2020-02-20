package com.ssafy.algo;

import java.util.Scanner;

public class Solution_1873 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] dy = { -1, 1, 0, 0 };
		int[] dx = { 0, 0, -1, 1 };
		for (int testcase = 1; testcase <= T; testcase++) {
			int H = sc.nextInt();
			int W = sc.nextInt();

			char map[][] = new char[H][W];
			int sPy=0;
			int sPx=0;
			for (int i = 0; i < H; i++) {
				String s = sc.next();
				for (int j = 0; j < W; j++) {
					map[i][j] = s.charAt(j);
					if (map[i][j] == '<' || map[i][j] == '>' || map[i][j] == '^' || map[i][j] == 'v') {
						sPy = i;
						sPx = j;
					}
				}

			}
			int N = sc.nextInt();
			char input[] = new char[N + 1];
			String str = sc.next();
			for (int i = 0; i < N; i++) {
				input[i] = str.charAt(i);
			}
			for (int i = 0; i < input.length; i++) {
				int py = sPy;
				int px = sPx;

				switch (input[i]) {
				case 'S':


						if (map[py][px] == '<') {
							for (int j = px - 1; j >= 0; j--) {
								if (map[py][j] == '#') {
									break;

								} else  if(map[py][j] == '*'){
									map[py][j] = '.';
									break;

								}

							}
						} else if (map[py][px] == '^') {
							for (int j = py - 1; j >= 0; j--) {

								if (map[j][px] == '#') {
									break;

								} else  if(map[j][px] == '*'){
									map[j][px] = '.';
									break;
								}
							}

						} else if (map[py][px] == 'v') {
							for (int j = py + 1; j < H; j++) {
								if (map[j][px] == '#')
									break;
								else if(map[j][px] == '*') {
									map[j][px] = '.';
									break;

								}

							}

						} else if (map[py][px] == '>') {
							for (int j = px + 1; j < W; j++) {
								if (map[py][j] == '#')
									break;
								else if(map[py][j] == '*'){
									map[py][j] = '.';
									break;

								}
							}
						}
					

					break;
				case 'U':
					map[sPy][sPx] = '^';
					if (sPy - 1 >= 0) {
						if (map[sPy - 1][sPx] == '.') {
							map[sPy--][sPx] = '.';
							map[sPy][sPx] = '^';
						}

					}
					break;
				case 'D':
					map[sPy][sPx] = 'v';
					if (sPy + 1 < H) {
						if (map[sPy + 1][sPx] == '.') {
							map[sPy++][sPx] = '.';
							map[sPy][sPx] = 'v';
						}

					}

					break;
				case 'L':
					map[sPy][sPx] = '<';
					if (sPx - 1 >= 0) {
						if (map[sPy][sPx - 1] == '.') {
							map[sPy][sPx--] = '.';
							map[sPy][sPx] = '<';
						}

					}

					break;
				case 'R':
					map[sPy][sPx] = '>';
					if (sPx + 1 < W) {
						if (map[sPy][sPx + 1] == '.') {
							map[sPy][sPx++] = '.';
							map[sPy][sPx] = '>';
						}

					}

					break;

				default:
					break;
				}

			}
			System.out.print("#"+testcase+ " ");
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					System.out.print(map[i][j]);
					
				}
				System.out.println();
			}

		} // end of testcase
	}// end of main

}// end of class
