import java.util.Scanner;


public class If1 {

	public static void main(String[] args) {
		// ����
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int firstInt = scan.nextInt();
		System.out.print("���� �Է�: ");
		int secondInt = scan.nextInt();
		System.out.print("���� ��ȣ + - * / �Է�: ");
		char giho =scan.next().charAt(0);
		if(giho == '+') {
			System.out.println(firstInt + secondInt);
			
		}
		else if(giho =='-') {
			System.out.println(firstInt - secondInt);
			
		}
		else if(giho == '*') {
			System.out.println(firstInt * secondInt);
		}
		else if(giho == '/') {
			System.out.println(firstInt / secondInt);
		}
		else {
			System.out.println("����Ȯ�� �Է��Դϴ�");
		}

	}

}
