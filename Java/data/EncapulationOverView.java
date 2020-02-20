/*
 * Encapsulation
 * 1. Data Hiding
 *  - set/get 메소드가 접근 통로 역할을 하면서, 잘못된 데이터를 거를 수 있음.
 * 2. Method Inner Hiding
 *  - 메소드의 내부 구현을 알지 못해도, return_type과 parameter_list만 알면,
 *    해당 메소드를 사용할 수 있다.
 *  예) int plus(int a, int b) : int 두개를 더해서 결과를 int로 준다.
 *  - return_type과 parameter_list : 접근 통로 역할.
 */
public class EncapulationOverView {
	private String hakBun;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 0) this.age = age;
		else System.out.println("wrong data !!!");
	}
	public String getHakBun() {
		if(hakBun == null) hakBun = "wrong data !!!";
		return hakBun;
	}
	public void setHakBun(String hakBun) {
		this.hakBun = hakBun;
	}

}
