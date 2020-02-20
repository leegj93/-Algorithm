import java.util.Scanner;

public class Main_557 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String []strArr =str.split(" ");
		for (int i=0; i<strArr.length-1; i+=3) {
			System.out.print(strArr[i]+" ");
		}
	}

}
