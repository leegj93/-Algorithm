import java.io.FileNotFoundException;
import java.io.FileReader;
/*
 * Exception 처리 방법.
 * - Exception 발생할 수 있는 프로그램 코드에 포위망 설치(try{})
 * - 발생한 Exception 객체를 받을 수 있는 처리 블록을 설치(catch(Exception객체를 받자){})
 * - 발생한 Exception 객체에 따른 처리 가능.
 * try ~ catch : 반드시 try와 catch는 함게 사용.
 * - 하나의 try에 여러 catch 올 수 있음.
 */
public class Exception2TryCatch {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
			System.out.println(999/0);
			FileReader fr = new FileReader("aaa.txt");
		} catch(ArithmeticException e) {
			System.out.println("계산 오류 입니다.\n시스템을 종료 합니다.");
			System.exit(-1);
		} catch (NullPointerException e) {
			System.out.println("시스템 관리자에게 문의하세요.");
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못하였습니다.\n파일을 확인해 주세요.");
		}
	}//main

}
