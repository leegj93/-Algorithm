import java.util.Scanner;

public class Main_558 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []intArr = new int[100];
		int cnt=0;
		for (int j=0; j< 100; j++) {
			intArr[j]=sc.nextInt();
			if(intArr[j]== 0)break;
			cnt++;
			}
		for (int x =cnt-1; x>=0; x--) {
			System.out.print(intArr[x]+" ");
		}
	}

}
