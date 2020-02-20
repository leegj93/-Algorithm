
public class ControlClass {

	public static void main(String[] args) {
		DataClass data = new DataClass();//data 요소만.
		System.out.println("=====FuncClass======");
		FuncClass func = new FuncClass();//기능 요소만.
//		func.arrange(data.arr);
		func.print(data.arr);
		System.out.println();
		System.out.println("=====FuncClass2======");
		FuncClass2 func2 = new FuncClass2(data.arr);//기능 요소만.
		func2.arrange();
		func2.print();
	}

}
