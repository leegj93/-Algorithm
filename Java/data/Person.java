
public class Person {
	String name;
	String ssn;
	String phone;
	String addr;
	Person(String nm, String sn, String pn, String ad){
		name = nm; ssn = sn; phone = pn; addr = ad;
	}
	void print() {
		System.out.println("이름 : " + name);
		System.out.println("주민번호 : " + ssn);
		System.out.println("전화번호 : " + phone);
		System.out.println("주소 : " + addr);
	}
}
