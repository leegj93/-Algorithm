import java.util.Arrays;
import java.util.Scanner;

public class Solution_1209 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int testcase = 1 ; testcase <= T; testcase++) {
			int N = sc.nextInt();
//			System.out.println(N);
//			System.out.println();
			int max=0;
			int map[][] = new int[100][100];
			for (int r = 0; r < 100; r++) {
				for (int c = 0; c < 100; c++) {
					map[r][c]=sc.nextInt();
				}
			}//mapping
			int sumCr1=0;
			int sumCr2=0;
			int sumGaro[]= new int[100];
			int sumSero[]= new int[100];
			int GaroMax=0;
			int SeroMax=0;
			for (int r = 0; r < map.length; r++) {
				for (int c = 0; c < map.length; c++) {
					sumGaro[r]=sumGaro[r]+map[r][c];
					sumSero[c]=sumSero[c]+map[r][c];
					if(r==c) {
						sumCr1+=map[r][c];
					}//(0 ,99), (1, 98), (2,97)
					if(c==map.length-1-r) {
						sumCr2+=map[r][c];
					}
				}
				
			}
			Arrays.sort(sumGaro);
			Arrays.sort(sumSero);
			GaroMax=sumGaro[99];
			SeroMax=sumSero[99];
			int maxCr=Math.max(sumCr1, sumCr2);
			max=Math.max(GaroMax, SeroMax);
					
			int result = Math.max(maxCr, max);
			System.out.println("#"+ testcase+ " " +result);
					
			
		}//end of testcase
	}//end of main
}
