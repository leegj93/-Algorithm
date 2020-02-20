class YesStatic {
	int non = 1;
	static int yes = 1;
	YesStatic(){
		non++;
		yes++;
	}
}
public class StaticTest2 {//Static 변수의 객체 비종속성
	public static void main(String[] args) {
		YesStatic y1 = new YesStatic();
		System.out.println(y1.non + " : " + y1.yes);
		YesStatic y2 = new YesStatic();
		System.out.println(y2.non + " : " + y2.yes);
	}

}
