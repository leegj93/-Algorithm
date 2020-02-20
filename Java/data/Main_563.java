import java.util.Scanner;
import java.util.Arrays;

public class Main_563 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] intArr = new int[10];
		for(int i=0; i<10; i++) {
			intArr[i] = sc.nextInt();
			}
		Arrays.sort(intArr);
		int tmpInt=0;
		for (int a = 0; a< intArr.length; a++) {
			for (int b = a+1; b< intArr.length;b++) {
				if(intArr[b]>intArr[a]) {
					tmpInt= intArr[a];
					intArr[a]=intArr[b];
					intArr[b]=tmpInt;
				}
			}
		}
		for(int i=9; i>=0; i--) {
			System.out.print(intArr[i]+" ");
		}


	}

}
