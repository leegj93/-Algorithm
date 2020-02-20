import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Collection5Map {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();	
		map.put(1, "hi");
		map.put(2, "hello");
		map.put(3, "how are you");
		map.put(4, "i am fine");
		map.put(5, "thanks");
		System.out.println(map);
		System.out.println("map size : " + map.size());
		Set<Integer> set = (Set<Integer>)map.keySet();
		//keySet: 키값만 Set<key data type> 객체로 가져온다
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int keyInt=it.next();
			System.out.println(keyInt+" : "+map.get(keyInt));
		}
		Collection<String> col = map.values();
//		ArrayList<String> col = (ArrayList<String>)map.values();
		Iterator<String> it2 = col.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println("map.containsKey : " + map.containsKey(5));
		System.out.println("map.containsValue : " + map.containsValue("thank you"));
		
		
		
	}
}
