import java.util.TreeMap;
class TreeMapKeyObj implements Comparable<TreeMapKeyObj>{
	Integer no;
	TreeMapKeyObj(int i){no =i;}
	@Override
	public int compareTo(TreeMapKeyObj o) {
		// TODO Auto-generated method stub
		return this.no.compareTo(o.no);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+ no;
	}
}
class TreeMapValueObj{
	String str;
	TreeMapValueObj(String s){str=s;}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return str;
	}
}

public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap<TreeMapKeyObj, TreeMapValueObj> map3 = new TreeMap<TreeMapKeyObj, TreeMapValueObj>();
		map3.put(new TreeMapKeyObj(5), new TreeMapValueObj("gogo"));
		map3.put(new TreeMapKeyObj(9), new TreeMapValueObj("hi"));
		map3.put(new TreeMapKeyObj(3), new TreeMapValueObj("bye"));
		map3.put(new TreeMapKeyObj(1), new TreeMapValueObj("hello"));
		System.out.println(map3);

		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
		map1.put(5, "gogo");map1.put(4, "hi");map1.put(9, "bye");
		map1.put(7, "hello");
		System.out.println(map1);
		TreeMap<String, Integer> map2 = new TreeMap<String, Integer>();
		map2.put("gogo",5);map2.put("hi",4);map2.put("bye",9);
		map2.put("hello",9);
		System.out.println(map2);
		
		
		
	}
}
