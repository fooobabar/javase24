package cn.edu360.javase24.day07.interfacedemo2;

import java.util.HashMap;

public class UserDatabase {
	public static HashMap<String, User> userMap=new HashMap<>();
	static{
		User u1 = new User();
		u1.set("zhangsan", "123");
		User u2 = new User();
		u2.set("lisi", "123");
		userMap.put(u1.getUsername(), u1);
		userMap.put(u2.getUsername(), u2);
	}
}
