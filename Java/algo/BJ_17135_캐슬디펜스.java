package com.ssafy.algo;

import java.util.Arrays;

import java.util.Scanner;

public class BJ_17135_캐슬디펜스 {
	public static int[][] map;
	public static int[] set;
	public static int n, m, d;
	public static int[][] copyed;
	public static int[] dy = { 0, -1, 0 };
	public static int[] dx = { -1, 0, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
		map = new int[n + 1][m];
		set = new int[3];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt();
			}
		} // mapping
		
		makeset(0, 0);

	}

	public static void copyMap() {// 기존의 맵을 유지하기 위한 복사맵
		copyed = new int[n + 1][m];
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < m; j++) {
				copyed[i][j] = map[i][j];
			}
		}
	}

	// 궁수의 위치 배정 함수(조합으로 짜야함)

	public static void makeset(int k, int cnt) {
		if (cnt == 3) {
			// 게임 시작
			copyMap();
			for (int i = 0; i < 3; i++) {
				copyed[n][set[i]] = 2;
			}
			printmap();
			playgame();

			return;
		} else {
			for (int i = k; i < m ; i++) {
				set[cnt] = i;
				makeset(i+1, cnt + 1);
			}
			cnt--;

		}

	}// end of main

	public static void printmap() {
		for (int i = 0; i < n + 1; i++) {
			System.out.println(Arrays.toString(copyed[i]));
		}
		System.out.println();
	}

	public static void playgame() {
		/**
		 * set과 map의 상태를 받아서 한 턴마다 map이 아래로 쉬프트 궁수의 사정거리 내로 적이 등장하면 가장 왼쪽에 있는 적부터 공격,
		 * 여러명의 궁수가 한명을 공격할 수도 있음. 즉 map[i]내의 1의 개수가 3보다 적으면 적을 다 지움
		 * 
		 */
		
		
	}

}// end of class
class EnemyClass implements Comparable<EnemyClass> {
	Integer rowNum;//좌표
	Integer colNum;//좌표
	Integer distance;//궁수와의 거리
    boolean deadYN;//사망 여부
    public EnemyClass(int rowNum, int colNum) {
        this.rowNum = rowNum;
        this.colNum = colNum;
    }
    @Override
    public int compareTo(EnemyClass o) {
        if (distance.equals(o.distance)) {//공격 거리가 같다면,
            return this.colNum.compareTo(o.colNum);//컬럼이 죄측인지 여부 검사.
        } else {
            return this.distance.compareTo(o.distance);//공격 거리 가까운 것이 우선 적용이지만,
        }
    }
    @Override
    public String toString() {
        return "["+rowNum+", "+colNum+", "+deadYN+"]";
    }
}//class