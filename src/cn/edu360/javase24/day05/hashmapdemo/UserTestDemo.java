package cn.edu360.javase24.day05.hashmapdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class UserTestDemo {

	public static void main(String[] args) {
		User u1 = new User("1","小明","123456","0101234",25,18000f);
		User u2 = new User("2","小华","123456","0101234",26,28000f);
		User u3 = new User("3","小强","123456","0101234",27,38000f);
		User u4 = new User("4","小红","123456","0101234",28,48000f);

		User[] userArray=new User[]{u1,u2,u3,u4};
		
		ArrayList<User> userList=new ArrayList<>();
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		
		HashSet<User> userHashSet=new HashSet<>();
		userHashSet.add(u1);
		userHashSet.add(u2);
		userHashSet.add(u3);
		userHashSet.add(u4);
		
		HashMap<String,User> userHashMap = new HashMap<>();
		userHashMap.put("1", u1);
		userHashMap.put("2", u2);
		userHashMap.put("3", u3);
		userHashMap.put("4", u4);
		
		
		for (User user : userList) {
			System.out.println("ArrayList "+user.toString());
		}
		for (User user : userHashSet) {
			System.out.println("HashSet "+user.toString());
		}
		for (User user : userHashMap.values()) {
			System.out.println("HashMap "+user);
		} 
		
		int max_age = 0 ;
		User max_age_user =new User();
		for (User user : userList) {
			if (max_age < user.getAge()){
				max_age = user.getAge();
				max_age_user = user;
			}
		}
		System.out.println(max_age_user);
		
		float max_sal = 0 ;
		User max_sal_user =new User();
		for (User user : userHashSet) {
			if (max_sal < user.getSal()){
				max_sal = user.getSal();
				max_sal_user = user;
			}
		}
		System.out.println(max_sal_user);
		

		int min_age = 999 ;
		User min_age_user =new User();
		for (User user : userHashMap.values()) {
			if (min_age > user.getAge()){
				min_age = user.getAge();
				min_age_user = user;
			}
		}
		System.out.println(min_age_user);
		
		
	}

}
