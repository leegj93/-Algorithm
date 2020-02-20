
public class Teacher extends Person {
	String subject;
	String classRoom;
	Teacher(String nm, String sn, String pn, String ad
			, String sj, String cr){
		super(nm, sn, pn, ad);
		subject = sj; classRoom =cr;
	}
	void print() {
		super.print();
		System.out.println("과목 : " + subject);
		System.out.println("교실 번호 : " + classRoom);
	}
}
