package cn.edu360.javase24.day05.hashmapdemo;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * 默认treemap使用key 比较，插入顺序跟读取顺序不同。
 * @author iiii
 *
 */
public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<String, Integer> tm1 = new TreeMap<>();
		
		tm1.put("a", 2);
		tm1.put("b", 1);
		tm1.put("aa", 11);
		tm1.put("ab", 1);
		
		Set<Entry<String, Integer>> entrySet = tm1.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+" , "+entry.getValue());
		}
		
	}

}
