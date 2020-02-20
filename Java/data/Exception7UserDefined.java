/**
 * User Defined Exception
 * - 프로그래머가 상황에 따른 Exception을 만들어 사용 가능
 * - Exception을 extends 받는 class 작성
 * 
 * @author multicampus
 *
 */

class MyExceptionClass extends Exception{}

public class Exception7UserDefined {
	public static void main(String[] args) throws MyExceptionClass{
		throw new MyExceptionClass();
	}
}
