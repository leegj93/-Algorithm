import java.util.Scanner;

public class Water_strider {

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
			int answer = 0;
			for (int i = 0; i < bug; i++) {
				int curX = idxX[i];
				int curY = idxY[i];
				map[curX][curY] = i+1;
				if(vec[i]==1) {
					for (int jump = 3; jump >= 0; jump--) {
						if((curX+jump)>=N)break;
						curX+=jump;
						if(map[curX][curY]!=0 && map[curX][curY]!=i+1) {
							answer=i+1;
						}
						map[curX][curY]=i+1;
					}
				}else if(vec[i]==2) {
					for (int jump = 3; jump >= 0; jump--) {
						if((curY+jump)>=N)break;
						curY+=jump;
						if(map[curX][curY]!=0 &&map[curX][curY]!=i+1) {
							answer=i+1;
						}
						map[curX][curY]=i+1;
					}
				}
				
			}
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
//					System.out.print(map[i][j]);
				}
//				System.out.println();
			}
			System.out.println("#"+ testcase+ " " +answer);
		} // end of testcase

	}// end of main

}// end of class
