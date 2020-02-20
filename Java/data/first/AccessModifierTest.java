package first;
// AccessModifier : 접근 제한을 의미
// public : 누구나 접근, 제한 없음
// protected : 같은 package(폴더)에서만 접근 가능. + 상속 class에서 접근 가능
// default : AccessModifier 없는 것, 같은 package에서만 접근 가능
// private :같은 class에서만 접근 가능

public class AccessModifierTest {
	public int publicInt =111;
	protected int protectedInt = 222;
	int defaultInt = 333;
	private int privateInt = 444;
}
