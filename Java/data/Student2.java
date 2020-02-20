public class Student2 {
	private String name;//이름
	private String studentNumber;//학번
	private int age;//나이
	private String phoneNumber;//전화번호
	public Student2(){
		//name="미상"; studentNumber="미상";
		//this.age=0; phoneNumber="미상";
		this("미상", "미상", 0, "미상");
		//현재 객체의 또 다른 생성자를 호출.
	}
	public Student2(String nm, String sn, int age, String pn){
		name=nm; studentNumber=sn; this.age=age; phoneNumber=pn;
	}
	public void print() {
		System.out.println("이름 : "+name
				+" 학번 : "+studentNumber
				+" 나이 : "+age
				+" 전화번호 : "+phoneNumber);
	}
}
