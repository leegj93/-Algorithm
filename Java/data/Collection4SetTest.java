
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Collection4SetTest {
	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>();
		while (lotto.size() < 6) {
			lotto.add((int) (Math.random() * 45 + 1));
		}
		System.out.println(lotto);
	}// end of main
}// end of class
