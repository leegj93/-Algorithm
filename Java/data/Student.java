
public class Student extends Person {
	String hakbun;
	String classRoom;
	Student(String nm, String sn, String pn, String ad
			, String hb, String cr){
		super(nm, sn, pn, ad);
		hakbun = hb; classRoom =cr;
	}
	void print() {
		super.print();
		System.out.println("학번 : " + hakbun);
		System.out.println("교실 번호 : " + classRoom);
	}
}
