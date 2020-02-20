/*
 * Method Override : 재정의(덮어쓰기)
 * - 상속관계에서 부모에 정의된 메소드를 자식에서 재정의하는 것.
 * - 부모 클래스에서 정의된 메소드와 이름과 파라미터가 같은 메소드를 자식 클래스에서 만드는 것.
 * - 호출 우선 순위 : 자식에 재정의된 메소드가 우선권을 갖음.
 */
class OverrideParent {
	void print() { System.out.println("부모 메소드..."); }
}
class OverrideChild extends OverrideParent {
	void print() { System.out.println("===> 자식 메소드..."); }
	//올바른 예) return type, method name, parameter list가 동일함.
	//int print() { System.out.println("===> 자식 메소드..."); return 777; }
	//잘못된 예1) return type 다르면 오류.
	void print(String str) { System.out.println("===> 자식 메소드:"+str); }
	//잘못된 예2) parameter list가 다르면, 다른 메소드로 인식함.
}
public class Inheritance3Override {

	public static void main(String[] args) {
		OverrideChild oc = new OverrideChild();
		oc.print();//호출 우선 순위는 자식 클래스가 가짐.
	}

}


