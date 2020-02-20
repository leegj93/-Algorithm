/*
 * Heterogeneous Collection : 이종 data 저장 가능한 자료 구조.
 * - 반드시 상속 관계가 있어야 함.
 * - 부모 타입의 배열에 자식 타입의 객체를 담는 것.
 */

public class Inheritance5Heterogeneous {

	public static void main(String[] args) {
		String [] strArr = new String [10];
		//Homogeneous Collection : 같은 종류의 data를 저장하는 구조
		Person p[] = new Person[3];
		p[0] = new Person("강호동","111","010-1111-2222","강남구");
		p[1] = new Student("유재석","222","010-9999-8888","서초구","A2018","301");
		p[2] = new Teacher("딘딘","333","010-7777-3535","송파구","국어","110");
		for(int i=0; i<p.length; i++){
			p[i].print();
		}//override 장점 : 부모 타입의 메소드명으로 자식 타입의 재정의된 메소드를 불러 올 수 있다.
		//System.out.println(p[2].classRoom);
		//polymorphic 변수는 자식 타입 고유의 값에는 접근이 안됨.
	}
}



