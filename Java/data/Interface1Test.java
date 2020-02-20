class Inter implements Interface1Declare{
	@Override
	public void name() {}
}
public class Interface1Test {
	public static void main(String[] args) {
		Inter i = new Inter();
		//i.normalMemVar=888;// error - interface 내부 변수는 모두 상수
		//i.normalSMemVar=888;
		//i.Square=888;
		System.out.println(i.normalMemVar);
	}

}
