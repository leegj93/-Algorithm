import java.util.Scanner;

public class Main_552 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2*N-1; j++) {
				if(j>=i && j<2*N-1-i) {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				//i=0, j = 0, 1, 2, 3, 4 print
				//i=1, j = 	  1, 2, 3 print
				//i=2, j = 		 2 print
			}
			System.out.println();
		}
		for (int i = N; i >=0; i--) {
			for (int j = 0; j < 2*N-1; j++) {
				if(j>=i && j<2*N-1-i) {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				//i=0, j = 		 2, print
				//i=1, j = 	  1, 2, 3 print
				//i=2, j = 0, 1, 2, 3, 4 print
			}
			System.out.println();
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2*N-1; j++) {
				if(j<N-i-1) {
					System.out.print(" ");
					
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i=0; i<N; i++) {

			for(int k=2; k>=0; k--) {
				System.out.print(" ");
				if(i == k) break;
			}

			for(int k=1; k<=5; k++) {
				System.out.print("*");
				if((i*2+1) == k) break;
			}
			System.out.println();
		}
		for(int i=0; i<N; i++) {

			for(int k=0; k<=2; k++) {
				System.out.print(" ");
				if(i == k) break;
			}

			for(int k=5; k>=1; k--) {
				System.out.print("*");
				if((i*2+1) == k) break;
			}
			System.out.println();
		}



	}

}
