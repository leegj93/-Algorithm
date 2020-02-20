/*
 * Method Overload : 중복 선언(중복 정의)
 * - 하나의 클래스에서 파라미터가 다른 같은 이름의 메소드를 중복 선언하는 것.
 * - return type과는 무관함.
 * - 메소드는 이름과 파라미터로 구분됨.
 * - 따라서, 이름이 같아도, 파라미터가 다르면, 다른 메소드.
 * - 동일한 기능의 다루는 data가 다른 경우.
 * 예) System.out.println(777);//int를 파라미터로 받는 println 메소드
 * 예) System.out.println("hi");//문자열을 파라미터로 받는 println 메소드
 */
public class Review_Overload {

	public void overloadTest() {}
	//public int overloadTest() { return 777; }//overload 아님.
	public void overloadTest(int a) {}
	public void overloadTest(int a, char c, int b) {}
	//argument list(parameter list)가 다르면,
	//동일한 이름의 메소드를 무한히 선언할 수 있다.
	public static void main(String[] args) {

	}

}
