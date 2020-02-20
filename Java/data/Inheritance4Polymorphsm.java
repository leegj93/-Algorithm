/*
 * Polymorphsm : 다형성 : 다양한 형태
 * - 그리스어 poly(많은) + morphos(형태)
 * - 반드시 상속 관계에서만 성립
 * - 부모 data type의 변수로, 자식 data type의 객체에 접근할 수 있다.
 */
/*
 * Polymorphsm 사용 이유.
 * - Heterogeneous Collection : 이종 data 저장 가능한 자료 구조.
 * - Polymorphic Argument : parameter list를 부모타입으로 정의할 수 있음.
 * - method override : 부모 타입의 메소드명으로 자식 타입의 재정의된 메소드 사용.
 */
class ParentTmp {}
class ChildTmp1 extends ParentTmp {}
class ChildTmp2 extends ParentTmp {}
public class Inheritance4Polymorphsm {

	public static void main(String[] args) {
		ParentTmp p1 = new ParentTmp();//정상적인 객체 생성.
		//String str = new Parent1();//error
		//String 타입의 변수 str은 자신을 선언한 Reference Type의 객체만 참조 가능.
		ParentTmp p2 = new ChildTmp1();//Polymorphsm 객체 생성.
		ParentTmp p3 = new ChildTmp2();//Polymorphsm 객체 생성.
		//부모 타입의 변수가 자식 타입의 객체를 참조 가능한 이유.
		// - 자식 타입의 객체 내부에 부모 타입의 객체가 존재하기 때문.
		//ChildTmp1 c1 = new ChildTmp2();//error
		//ChildTmp1 c1 = new ParentTmp();//error
		//부모 타입의 변수만 자식 타입의 객체 참조 가능.
	}

}







