import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] map= {} ;
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N = sc.nextInt();
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<N; j++) {
				map[i][j] = sc.next();
				
				
			}
		}
		System.out.println(map);

	}

}
