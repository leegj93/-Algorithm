package com.ssafy.algo;

import java.util.Arrays;
import java.util.Scanner;

public class JL_1828 {
	public static class point implements Comparable<point> {
		int x;
		int y;

		public point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(point o) {
			return this.y - o.y;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		point[] ref = new point[N];

		int count = 1;
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			ref[i] = new point(x, y);
		}
		Arrays.sort(ref);
		point p = ref[0];
		int f = 1;
		while (f < N) {

			if (ref[f].x > p.y) {
				p = ref[f];
				count++;

			}
			f++;
		}
		System.out.println(count);
	}

}
