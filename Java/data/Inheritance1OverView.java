/*
 * Inheritance : 다른 class의 유전적 형질(member variable/method)을 가져옴.
 * - extends 를 통해 상속을 받을 수 있다.
 *  예) Child1 extends Parent1
 *   : Child1은 Parent1을 상속 받았다.
 *   : Child1은 Parent1을 확장했다.
 * - 유전적 형질을 주는 class : super class, 부모 class, 상위 class
 * - 유전적 형질을 받는 class : sub class, 자식 class, 하위 class
 * - 부모는 공통된 부분을 가짐 : generalize
 * - 자식은 자식만의 고유한 부분을 가짐 : specialize
 * - class diagram : 자식 -▷ 부모 (실선+속이빈삼각형)
 * - is a relationship : 자식은 부모의 한 종류이다.
 *  예) 박찬호 extends 투수, 류현진 extends 투수
 *   : 박찬호는 투수의 한명이다. 류현진은 투수의 한명이다.
 *   : 잘못된 예 - 투수는 박찬호다.(오류) 박찬호는 류현진이다.(오류)
 *   : sub class is a super class - O
 *   : sub class is a sub class - X
 *   : super class is a sub class - X
 * - 자바는 단일 상속.
 *  예) A extends B - O
 *  잘못된 예) A extends B, C - X
 */
/*
 * 상속을 사용하는 이유
 * - 구조가 간단 해진다.
 * - 코드 재사용성이 높일 수 있다.
 * - 수정과 추가 개발이 용이함.
 * - 프로그램의 확장과 관리가 쉬워지는 장점.
 */
class Parent1 {
	String firstName;
	String lastName;
	void print() {
		System.out.println(firstName);
	}
}
class Child1 extends Parent1 {
	String middleName;
	void print() {
		super.print();
		System.out.println(firstName+" "+middleName+" "+lastName);
	}
}
public class Inheritance1OverView {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.firstName = "몽키";
		c1.middleName = "D";
		c1.lastName = "루피";
		c1.print();
	}

}



