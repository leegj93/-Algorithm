import java.util.ArrayList;

public class Collection2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Double(3.14));
		list.add(new String("hello"));
		list.add(new Double(3.14));
		Object o = list.get(0);
	}
}
