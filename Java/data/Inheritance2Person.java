//상속 구현의 예시
public class Inheritance2Person {
	String name;
	String ssn;
	String phone;
	String addr;
}
/*
 * has a relationship
 * - 다른 객체를 attribute(variable)로 소유할 수 있다.
 * - class diagram : 엔진-<>자동차(실선+속이빈다이아몬드), 포함관계
 */
class Inheritance2Student extends Inheritance2Person {
	String hakBun;
	String classRoom;
	//수업 과목{"국","영","수"} - 성적{100,80,90}
	Inheritance2Jumsu [] jumsu
		= new Inheritance2Jumsu [10];//has a relationship
}
class Inheritance2Teacher extends Inheritance2Person {
	String subject;
	String classRoom;
}
class Inheritance2Employee extends Inheritance2Person {
	String empNo;
	String deptName;
}
class Inheritance2Jumsu {
	String sihumSubject;
	int sihumJumsu;
}
