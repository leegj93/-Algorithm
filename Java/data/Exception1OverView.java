import java.io.FileReader;
import java.util.ArrayList;

/*
 * Java Error 종류
 * - compile error : 문법 오류. -> 코드 수정으로 해결.
 * - runtime error : 실행 중 오류. fatal과 exception으로 구분.
 * - fatal error : 구조적 오류.
 * Exception : 예외 상황.
 * - 프로그래머가 예상치 못한 실행 중의 문제 발생.
 * 예) DBMS 접속 중, DBMS 전원 다운, 인터넷 접속 중 인터넷선 플러그 아웃.
 * Exception Handling : 예외 상황 처리.
 * - 예외상황 발생 시에, 오작동 방지, 안내 처리, 프로그램 종료 등의 처리.
 * - 예외 처리를 통해, 로그를 남겨서, 이후에 조치 가능하도록 함.
 * Exception 전달 과정.
 * - 프로그램 실행 과정 : program -> jvm에 의해 실행
 * - Exception 전달 과정 : jvm -> program
 * - jvm은 발생한 Exception에 대한 자세한 정보를 객체로 만들어서 전달함.
 * Exception 상속 구조 중요!!! - Polymorphism 적용!!!
 */
public class Exception1OverView {

	public static void main(String[] args) {
		//System.out.println(args[0]);//ArrayIndexOutOfBoundsException
		ArrayList list = null;
		//System.out.println(list.get(0));//NullPointerException
		System.out.println(999/0);//ArithmeticException
		//Integer.parseInt("안녕");//NumberFormatException
//		list = new ArrayList();
//		list.add(new Exception1OverView());
//		TreeMapTest e1o = (TreeMapTest) list.get(0);//ClassCastException
	}

}






