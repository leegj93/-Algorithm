import java.util.Arrays;

//생성자 : class가 만들어질 때, 정의해야 하는 부분을 설계한 곳.
public class FuncClass2 {

	public int [] thisArr;
	public FuncClass2(int [] intArr) {
		thisArr = intArr;
	}
	public void arrange() {
		Arrays.sort(thisArr);
	}
	public void print() {
		for(int a=0; a<thisArr.length; a++) {
			System.out.print(thisArr[a] + " ");
		}
	}
}
