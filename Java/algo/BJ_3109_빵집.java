package com.ssafy.algo;

import java.util.Arrays;
import java.util.Scanner;

/** 가스관은 반드시 첫번째 열에서 시작하여 마지막 열에서 끝나야한다
 * 각 칸은 오른쪽, 오른쪽 위, 오른쪽 아래 대각선으로 연결할 수 있고 중심끼리 연결
 * 경로는 겹쳐질 수 없다.
 */
public class BJ_3109_빵집 {
	
	public static boolean[][] map;
	public static int[] dr= {-1,0,1};
	public static int r ,c ;
	public static int ans;
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		r= sc.nextInt();
		c= sc.nextInt();
		ans=0;
		map = new boolean[r][c];
		for (int i = 0; i < r; i++) {
			String  s= sc.next();
			for (int j = 0; j < c; j++) {
				if(s.charAt(j)=='x')
				map[i][j]=true;
			}
		}// 벽이 존재하는 곳만 true로 선언
		for (int i = 0; i < r; i++) {
			dfs(i,0);
		}
		System.out.println(ans);
		for (int l = 0; l < r; l++) {
			System.out.println(Arrays.toString(map[l]));
		}
	}

	public static boolean dfs(int i, int j) {

		for (int k = 0; k < 3; k++) {
			int nc = j + 1;
			int nr = i+dr[k];
			if(nr<r && nr>=0&& !map[nr][nc]) {
				if(nc == c-1) {
					ans++;
					return true;
				}
				map[nr][nc]=true;
				if(dfs(nr,nc)==true) {
					return true;
				}
				
			}
		}
		return false;
	}
}
