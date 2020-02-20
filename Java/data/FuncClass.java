import java.util.Arrays;

public class FuncClass {
	public void arrange(int [] intArr) {
		Arrays.sort(intArr);
	}
	public void print(int [] intArr) {
		for(int a=0; a<intArr.length; a++) {
			System.out.print(intArr[a] + " ");
		}
	}
}
