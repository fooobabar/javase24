package cn.edu360.javase24.day08.sortutil1;

import java.util.ArrayList;

public class SortUtilTest {

	public static void main(String[] args) {
		User u1 = new User("u1", "æÏ¶ð", 18, 1000.0f);
		User u2 = new User("u2", "Îâ¸Õ", 18, 1200.0f);
		User u3 = new User("u3", "ÓñÍÃ", 28, 1500.0f);
		User u4 = new User("u4", "°Ë½ä", 8, 1200.0f);
		
		ArrayList<User> uList = new ArrayList<>();
		
		uList.add(u1);
		uList.add(u2);
		uList.add(u3);
		uList.add(u4);

		SortUtil.sort(uList, new AgeBiJiaoQi());
		
		for (User user : uList) {
			System.out.println(user);
		}
		
		SortUtil.sort(uList, new SalBiJiaoQi());
		
		for (User user : uList) {
			System.out.println(user);
		}
		
	}

}
