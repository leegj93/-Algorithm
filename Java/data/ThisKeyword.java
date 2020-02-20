/*
 * this : 자기 자신의 객체를 반환하는 키워드.
 * - 변수/메소드 호출 : this.변수명, this.메소드명
 * - 생성자 호출 : this() : 생성자 안에서 다른 생성자 호출.
 * - sub class에서 this는 자식 타입을 의미함.
 */
class ThisObj {
	String memVar = "member variable...";
	public ThisObj(){
		this("다른 생성자 호출을 통한 멤버 변수 입력.");
	}
	public ThisObj(String message) {
		this.memVar = message;
	}
	public void print() {
		String memVar = "local variable...";
		System.out.println("지역 변수 우선 : " + memVar);
		this.call();//this 메소드 용법.
		System.out.println("this를 통한 멤버 변수 호출 : " + this.memVar);//this 변수 용법.
	}
	public void call() {
		System.out.println("this를 통한 다른 메소드 호출.");
	}
}
public class ThisKeyword {

	public static void main(String[] args) {
		ThisObj to = new ThisObj();
		to.print();
		System.out.println("================");
		ThisObj to2 = new ThisObj("직접 메세지 입력");
		to2.print();
	}

}
