
public class Array3 {

	public static void main(String[] args) {
		char [] chArr= {'A', 'B', 'C', 'D', 'E'};
		char [] chArr2= {'X', 'Y', 'Z'};
		for (int idx=0; idx<chArr.length; idx++) {
			System.out.print(chArr[idx]);
		}//for
		System.out.println();
		System.arraycopy(chArr2, 1, chArr, 2, 2);
		for (int idx=0; idx<chArr.length; idx++) {
			System.out.print(chArr[idx]);
		}//for
	}

}
