class StaticTest{
	int a;//new를 통해 사용
	static int b;//class load 시에 생성.//class 이름을 통한 접근 가능.
}
public class StaticVar {

	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		System.out.println(st.a);
		System.out.println(st.b);
		System.out.println(StaticTest.b);//Static 변수 접근 방법
	}

}
