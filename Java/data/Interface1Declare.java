/**
 * interface : 특별한 class-
 * -abstract method로만 이루어진 class
 * - 일반 메소드 선언 불가
 * - class 대신에 interface 선언 사용
 * - 사용 이유 : 구현 강제
 * - 장점 : 다중 상속 구현
 * @author multicampus
 *
 */
public interface Interface1Declare {
	int normalMemVar = 777;
	static int normalSMemVar = 999;
	final int Square =4; 
//	public void nomalMethod() {}
	public abstract void name();
}
