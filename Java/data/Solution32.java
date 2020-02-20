import java.util.Scanner;

public class Solution32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int testcase = 1; testcase <= T; testcase++) {
			int Y = sc.nextInt();
			int X = sc.nextInt();
			int N = sc.nextInt();
			int map[][] = new int[Y + 1][X + 1];
			int idxY[] = new int[N];
			int idxX[] = new int[N];
			int cnt[] = new int[N];

			for (int r = 1; r < Y + 1; r++) {
				for (int c = 1; c < X + 1; c++) {
					map[r][c] = sc.nextInt();
				}
			} // end of mapping

			for (int i = 0; i < N; i++) {
				idxY[i] = sc.nextInt();
				idxX[i] = sc.nextInt();
				cnt[i] = sc.nextInt();
			}

			int tN = sc.nextInt();
			int trapX[] = new int[tN];
			int trapY[] = new int[tN];
			for (int i = 0; i < tN; i++) {
				trapX[i] = sc.nextInt();
				trapY[i] = sc.nextInt();
			}
			for (int i = 0; i < tN; i++) {
				int tX = trapX[i];
				int tY = trapY[i];
				map[tY][tX] = 0;
			}
			for (int r = 1; r < Y + 1; r++) {
				for (int c = 1; c < X + 1; c++) {
					System.out.print(map[r][c]+" ");
				}
				System.out.println();
			} // end of mapping
			int sum = -1000;
			int total = sum*N;
//			System.out.println(total);
			for (int i = 0; i < N; i++) {
				int cY = idxY[i];
				int cX = idxX[i];
				int times = cnt[i];
				for (int g = 0; g < times; g++) {
					
					int prize = 0;
					int jc = map[cY][cX] % 10;
					int dir = map[cY][cX] / 10;
					if (dir == 1) {
						cX = cX + jc;
						if (cX > X + 1)
							break;
						if (map[cY][cX] == 0)
							break;


					} else if (dir == 2) {
						cY = cY + jc;
						if (cY > Y + 1)
							break;
						if (map[cY][cX] == 0)
							break;

					} else if (dir == 3) {
						cX = cX - jc;
						if (cX <= 0)
							break;
						if (map[cY][cX] == 0)
							break;

					} else if (dir == 4) {
						cY = cY - jc;
						if (cY <= 0)
							break;
						if (map[cY][cX] == 0)
							break;
					}
					if(g==times-1) {
						prize=map[cY][cX]*100;
						System.out.println(map[cY][cX]);
						total+=prize;
					}

				}
			}
			System.out.println(total);

		} // end of testcase

	}

}
