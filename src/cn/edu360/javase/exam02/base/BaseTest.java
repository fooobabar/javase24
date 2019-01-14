package cn.edu360.javase.exam02.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class BaseTest {

	public static void main(String[] args) {

//		demo1();
//		demo2();
//		demo3();
		demo4();

	}

	public static void demo4() {
		HashMap<String, Integer> hashMap= new HashMap<>();
		hashMap.put("a", 1);
		hashMap.put("b", 3);
		hashMap.put("c", 2);
		hashMap.put("d", 6);
		hashMap.put("e", 1);
		Set<String> hashSet = hashMap.keySet();
		for (String string : hashSet) {
			if(hashMap.get(string)%2==1){
				System.out.println(string+" "+hashMap.get(string));
			}
		}
	}

	public static void demo3() {
		Set<String> set = new HashSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("e");
		for (String string : set) {
			System.out.println(string);
		}
	}

	public static void demo2() {
		ArrayList<Integer> arrayList= new ArrayList<>(); 
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		for(int i=0;i<arrayList.size();i++){
			System.out.println(arrayList.get(i));			
		}

		for(int i=arrayList.size() - 1;i>=0;i--){
			System.out.println(arrayList.get(i));			
		}
	}

	public static void demo1() {
		int[] intArray=new int[] {1,2,3,4,5};
		for(int i=0 ; i<intArray.length ; i++){
			System.out.println(intArray[i]);
		}
		for(int i=intArray.length-1 ; i>=0; i--){
			System.out.println(intArray[i]);
		}
	}

}
