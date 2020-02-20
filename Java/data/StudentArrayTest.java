import java.util.Scanner;

public class StudentArrayTest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Student2[] stuArr = new Student2[30];
		int menuNo=0;
		while(true) {
			int idx=0;
			System.out.println("메뉴선택=====");
			System.out.print("0: 종료, 1: 입력, 3: 출력");
			menuNo = sc.nextInt();
			if(menuNo==0) {
				System.out.println(" bye bye ~~~~"); break;
			}else if (menuNo == 1) {
				System.out.println("===== 학생 정보 입력 ==== " );
				System.out.print("이름: ");
				String tmpNm= sc.next();
				System.out.print("학번: ");
				String tmpSN= sc.next();
				System.out.print("나이: ");
				int tmpAge= sc.nextInt();
				System.out.print("전화번호: ");
				String tmpPN = sc.next();
				stuArr[idx++]= new Student2(tmpNm, tmpSN, tmpAge, tmpPN);
				
			}else if (menuNo == 3) {
				stuArr[idx++].print();
			}
		}
	}
}
