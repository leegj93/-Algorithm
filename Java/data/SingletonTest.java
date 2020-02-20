class Num{
	private static Num num= new Num();
	private static int number;
	private Num() {}
	public static  Num getInstance() {
		return num;
	}
	public static int getNumber() {
		number++;
		return number;
	}
	
}
/**
 * Singleton Design Pattern : 하나의 객체만 유지하고 싶을 때
 * 1. 객체를 private로 생성
 * 2. 생성자를 private로 막는다.
 * 3. 접근 가능한 public 메소드를 정의한다.
 * 
 * @author multicampus
 *
 */
public class SingletonTest {
	public static void main(String[] args) {
		//Num n1 = new Num(); // error - 생성자가 private
		Num n2 = Num.getInstance();
		System.out.println(n2.getNumber());
	}
}
