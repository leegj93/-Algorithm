import java.util.Scanner;

public class Maze {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int testcase = 1; testcase <= T; testcase++) {
			int N = sc.nextInt();
			int maze [][] = new int[N][N];
			int r = sc.nextInt();
			int c = sc.nextInt();
			int j = sc.nextInt();
			int jumper[][]= new int[j][2];
			for (int i = 0; i < j; i++) {
				for (int k = 0; k < 2; k++) {
					jumper[i][k]=sc.nextInt();
					System.out.print(jumper[i][k]);
				}
				
				System.out.println();
			}
			System.out.println(jumper[1][0]);
			for (int i = 0; i < maze.length; i++) {
				for (int k = 0; k < maze.length; k++) {
					System.out.print(maze[i][j]);
				}
				System.out.println();
			}
			
		}
	}

}
