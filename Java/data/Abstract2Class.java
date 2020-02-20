/**
 * abstract class
 * - instance 생성이 안된다는 점을 제외하고, 일반 clsss와 다른 바 없음
 * - 정상적인 변수와 메소드 선언이 모두 가능
 * - 상속도 가능.
 * - 미완성 class를 상속 받으면 미완성 class가 되므로, 상속받은 클래스를 override를 해야함 
 * @author multicampus
 *
 */

abstract class AbsExam{
	int normalMemVar = 777;
	static int normalSMemVar = 999;
	final int Square =4; 
	public void nomalMethod() {}
	public abstract void name();
}
public class Abstract2Class {

}
