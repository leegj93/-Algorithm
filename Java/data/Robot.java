import java.util.Scanner;

public class Robot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int testcase = 1; testcase <= T; testcase++) {
			int N = sc.nextInt();
			char[][] map = new char[N+2][N+2];
			for (int i = 1; i < map.length-1; i++) {
				for (int j = 1; j < map.length-1; j++) {
					char a = sc.next().charAt(0);
					map[i][j] = a;
//					System.out.print(map[i][j]);

				}
//				System.out.println();
			} // end of mapping
			int cnt = 0;
			for (int i = 1; i < map.length-1; i++) {
				for (int j = 1; j < map.length-1; j++) {
					
					if (map[i][j] == 'A') {
						int k=1;
						while (map[i][(j + k)] == 'S') {
							cnt++;
							k++;
						}
					} else if (map[i][j] == 'B') {
						int k=1;
						while(map[i][j+k]=='S') {
							cnt++;
							k++;
						}
						k=1;
						while(map[i][j-k]=='S') {
							cnt++;
							k++;
						}

					} else if(map[i][j]=='C') {
						int k = 1;
						
						while(map[i][j+k]=='S') {
							cnt++;
							k++;
						}
						k=1;
						while(map[i][j-k]=='S') {
							cnt++;
							k++;
						}
						k=1;
						while(map[i+k][j]=='S') {
							cnt++;
							k++;
						}
						k=1;
						while(map[i-k][j]=='S') {
							cnt++;
							k++;
						}
					}
				}

			}
			System.out.println("#"+testcase+ " " + cnt);

		} // end of testcase
	}// end of main

}// end of class
