import java.util.Scanner;

public class Main_560 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 10000;
		int[] intArr = new int[10];
		for(int i: intArr) {
			intArr[i] = sc.nextInt();
			if(min>intArr[i]) {
				min = intArr[i];
			}
		}
		System.out.println(min);

	}

}
