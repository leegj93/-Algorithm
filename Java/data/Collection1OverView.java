import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Collection API (Collection Framework)
 * -Data Structure를 구현해 놓은 Library
 * -java.util 패키지에 구현된
 * - 개발 소요 시간 절약 + 최적 알고리즘 제공
 * Set :순서 없음, 중복 불가. HashSet, TreeSet
 * Map : 순서 없음, key 중복 불가, value 중복 가능. HashMap, TreeMap
 * List : 순서 있음, 중복 가능( 번지가 key역할) ArrayList, LinkedList, Vector
 * 순차 접근 : Iterator, Enumeration
 * Generic : data type 제한
 * @author multicampus
 *
 */
public class Collection1OverView {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(1);
		set.add(new Double(3.14));
		set.add(new String("Hello"));
		System.out.println("Set: " + set);
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(new Double(3.14));
		list.add(new String("Hello"));
		list.add(new Double(3.14));
		list.add("hello");
		System.out.println("list: " + list);
		
		HashMap map = new HashMap();
		map.put("you", "010-1234-5678");
		map.put("kang", "010-9876-5432");
		map.put("haha", "010-5555-7777");
		map.put("you", "010-5555-5678");// key 중복 시 data가 덮어씌워짐
		map.put("kang", "010-7777-5432");
		System.out.println("map : " + map);
	}
}
