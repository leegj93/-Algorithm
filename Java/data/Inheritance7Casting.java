import java.util.ArrayList;

/*
 * Object Type Casting
 * - 반드시 상속관계에서 성립 가능함.
 * - 묵시적 Casting : 자식 타입 -> 부모 타입
 * - 명시적 Casting : 부모 타입 -> 자식 타입
 */
/*
 *  instanceof 연산자
 *  - 누구의 객체인가를 확인하는 연산자.
 *  - true/false 만을 리턴함.
 */
public class Inheritance7Casting {

	public static void main(String[] args) {
		Person p = new Student("유재석","222","010-9999-8888","서초구","A2018","301");
		//Polymorphsm : 부모 타입의 변수로 자식 타입의 객체를 참조.
		//묵시적 Casting : 자식 타입 -> 부모 타입
		p.print();//부모 타입의 변수로 자식 타입의 메소드 호출.
		//System.out.println(p.hakbun);//error - 부모 타입의 변수로 자식 타입의 고유 부분에 접근이 불가능함.
		Student stu = (Student) p;//명시적 Casting : 부모 타입 -> 자식 타입
		System.out.println("stu : " + stu.hakbun);
		//????? - 다형성 왜 하나요?
		ArrayList list = new ArrayList();
		list.add(new Person("강호동","111","010-1111-2222","강남구"));
		list.add(new Student("유재석","222","010-9999-8888","서초구","A2018","301"));
		list.add(new Teacher("딘딘","333","010-7777-3535","송파구","국어","110"));
		//System.out.println(list.get(1).name);//error - 부모 타입의 변수로 자식 타입의 고유 부분에 접근이 불가능함.
		if(list.get(1) instanceof Student) {
			Student stu2 = (Student) list.get(1);
			System.out.println("stu2 : " + stu2.hakbun);
		}
	}

}






