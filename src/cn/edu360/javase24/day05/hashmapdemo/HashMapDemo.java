package cn.edu360.javase24.day05.hashmapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> map1 = new HashMap<>();
		
		map1.put("1", "ab");
		map1.put("2", "abc");
		map1.put("3", "abcd");
		System.out.println(map1.get("1"));
		
		System.out.println(map1.containsKey("1"));
		
		Set<String> set1 = map1.keySet();
		
		Iterator<String> it = set1.iterator();
		while(it.hasNext()){
			System.out.println(map1.get(it.next()));
		}
		
		for (String name : set1) {
			System.out.println(name);
		}
		
	}

}
