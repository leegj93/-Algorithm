//초기화 : 최초로 값을 대입하는 행위.
//멤버 변수는 초기화 자동. - 수동 초기화 없이 사용 가능.
//지역 변수는 초기화 수동. - 수동 초기화 없이 사용 불가능.
//객체 생성 과정에서 멤버 변수는 초기값 초기화 -> 대입된 값으로 초기화 -> 생성자 통한 초기화
//생성자 : 특수한 역할을 하는 메소드, instance가 만들어질 때 딱 한번만 동작하는 메소드.
//constructor 선언 : public + class 이름.(return type 없음)
class New1 {
	int a;//초기값 초기화
	int b=7;//대입된 값으로 초기화
	int c=999;//생성자 통한 초기화
	public New1(){
		c = 123456789;
	}
}
//default constructor
// - () 내부가 비어있는 constructor
// - constructor가 하나도 없으면, jvm이 자동 제공.
// - constructor를 하나라도 선언하시면,
//default constructor를 수동으로 반드시 만들어 주셔야 합니다.
class New2 {
	int ddd;
	public New2() {}//overloading
	public New2(int inData){
		ddd = inData;
	}
	public New2(int inData, int in2){
	}
}
class New3 {
	int ddd;
}
public class NewTest {

	public static void main(String[] args) {
		int localTest;
		New1 n1 = new New1();
		System.out.println(n1.a+" : "+n1.b+" : "+n1.c);
		New2 n2 = new New2(456);
		System.out.println(n2.ddd);
		New2 n4 = new New2();
		New3 n3 = new New3();
	}

}
