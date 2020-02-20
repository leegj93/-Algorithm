public class LocalVarTest {
	public static void main(String[] args) {
		LocalVar lv = new LocalVar();
		lv.localTest();
	}
}
class LocalVar {
	int variable1 = 777;
	public void localTest() {//로컬 변수의 우선 순위
		int variable1 = 8;
		System.out.println(variable1);
		//멤버 변수와 지역 변수가 이름이 같은 경우, 일반적으로 지역변수 우선.
		System.out.println(this.variable1);
		//this : 현재 객체를 반영하는 키워드
	}

}
