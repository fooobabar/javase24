package cn.edu360.javase24.day08.sortutil3;

import java.util.ArrayList;

public class SortTest {

	public static void main(String[] args) {
		ArrayList<User> ulist = new ArrayList<>();
		User u1 = new User("u1", "嫦娥", 18, 1000.0f);
		User u2 = new User("u2", "吴刚", 18, 1200.0f);
		User u3 = new User("u3", "玉兔", 28, 1500.0f);
		User u4 = new User("u4", "八戒", 8, 1200.0f);
		
		ulist.add(u1);
		ulist.add(u2);
		ulist.add(u3);
		ulist.add(u4);
		SortUtil3 sortUtil3 = new SortUtil3();
		sortUtil3.sort(ulist);
		for (User user : ulist) {
			System.out.println(user);
		}
		
	}

}
