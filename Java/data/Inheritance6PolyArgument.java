/*
 * Polymorphsm 한계 : polymorphic 변수는 자식 타입 고유의 값에는 접근이 안됨.
 * - 극복 방법 : Object Casting
 */
public class Inheritance6PolyArgument {

	public static void main(String[] args) {
		Person p = new Person("강호동","111","010-1111-2222","강남구");
		Student s = new Student("유재석","222","010-9999-8888","서초구","A2018","301");
		Teacher t = new Teacher("딘딘","333","010-7777-3535","송파구","국어","110");
		callPrint(s); callPrint(t); callPrint(p);
	}
	/*
	 * Polymorphic Argument : parameter list를 polymorphic으로 구현.
	 * - parameter list를 부모타입으로 정의하면, 모든 자식 타입의 객체를 받을 수 있다.
	 * - 반드시 상속관계에서 성립 가능함.
	 */
	public static void callPrint(Person p) {
		if(p instanceof Student) {
			System.out.println("===> Student...");
		} else if(p instanceof Teacher) {
			System.out.println("===> Teacher...");
		} else if(p instanceof Person) {
			System.out.println("Person...");
		}
		p.print();
		//System.out.println(p.classRoom);
		//polymorphic 변수는 자식 타입 고유의 값에는 접근이 안됨.
	}
//	public static void callPrint(Student s) {
//		s.print();
//	}

}
