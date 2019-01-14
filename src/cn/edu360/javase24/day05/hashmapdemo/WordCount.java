package cn.edu360.javase24.day05.hashmapdemo;

import java.util.HashMap;
import java.util.Set;

public class WordCount {

	public static void main(String[] args) {
		String tgtstr="a,b,c,a,b";
		
		HashMap<String,Integer> map1 = new HashMap<>();
		
		String[] c1 = tgtstr.split(",");
		
		for (String s : c1) {
			if(map1.containsKey(s)){
				map1.put(s, map1.get(s)+1);
			}else{
				map1.put(s,1);
			}
		}
		
		Set<String> set = map1.keySet();
		
		for (String str : set) {
			System.out.println(str+" "+map1.get(str));
		}
	}

}
