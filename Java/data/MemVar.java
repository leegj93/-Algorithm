public class MemVar {//변수의 LifeCycle
	int a;
	double b;
	char c;
	boolean bool;
	int memVar = 999;
	static int memVar2 = 999;
	//멤버 변수 - class내부에서 접근 가능
	//instance 생성 시 생성, instance가 제거될 때(GC), 삭제.
	//static 변수 - class 로드 시 생성, class가 제거될 때(GC), 삭제.
	public static void main(String[] args) {
		MemVar mem = new MemVar();
		System.out.println(mem.c);
		System.out.println(mem.a+"\t"+mem.b+"\t"+mem.bool);
		int localVar = 111;
		//지역 변수 - 메소드 내부에서만 접근 가능
		//지역변수는 메소드가 실행될 때 생성, 메소드 종료시 삭제.
	}
	public static void other() {
		MemVar mem2 = new MemVar();
		System.out.println(mem2.memVar);
		int memVar2 = 777;
		System.out.println(memVar2);
		//멤버 변수와 지역 변수는 이름이 같을 수 있음.
		//멤버 변수와 지역 변수가 이름이 같을 때, 지역 변수가 우선 접근
	}

}
