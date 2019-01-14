package cn.edu360.javase.exam02.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class UserTest {

	public static void main(String[] args) {

		User u1 = new User("1","张三",18,2000f);
		User u2 = new User("2","李四",20,3000f);
		User u3 = new User("3","王五",19,2500f);
		User u4 = new User("4","赵六",19,3600f);
		User u5 = new User("5","铁蛋",20,2800f);
		
		ArrayList<User> arrayList=new ArrayList<>();
		arrayList.add(u1);
		arrayList.add(u2);
		arrayList.add(u3);
		arrayList.add(u4);
		arrayList.add(u5);
		
		User tmpUser ;

		//orderBy1(arrayList);
		
		//orderBy2(arrayList);
		System.out.println(-1/10);
		//orderBy3(arrayList);
		HashMap<String, User> hashMap = new HashMap<>();
		hashMap.put("1", u1);
		hashMap.put("2", u2);
		hashMap.put("3", u3);
		hashMap.put("4", u4);
		hashMap.put("5", u5);
//		
//		ArrayList<User> userList =new ArrayList<>();
//		Set<String> set = hashMap.keySet();
//		for (String string : set) {
//			if(hashMap.get(string).getSalary()>2500){
//				userList.add(hashMap.get(string));
//			}
//		}
//
//		for (User user : userList) {
//			System.out.println(user);
//		}
	}

	public static void orderBy3(ArrayList<User> arrayList) {
		User tmpUser;
		//对上述ArrayList中的user对象进行排序
		//（排序的规则为： 先比较age，age小的排前面; 如果age相等,则比较salary，salary小的排前面）
		for(int i=0 ;i<arrayList.size();i++){
			for(int j=i;j<arrayList.size();j++){
				if(arrayList.get(i).getAge() > arrayList.get(j).getAge()){
					tmpUser = arrayList.get(i);
					arrayList.set(i, arrayList.get(j));
					arrayList.set(j, tmpUser);
				}
				else if(arrayList.get(i).getAge() == arrayList.get(j).getAge()){
					if(arrayList.get(i).getSalary() > arrayList.get(j).getSalary()){
						tmpUser = arrayList.get(i);
						arrayList.set(i, arrayList.get(j));
						arrayList.set(j, tmpUser); 
					}
				}
			}
		}
		
		for (User user : arrayList) {
			System.out.println(user);
		}
	}

	public static void orderBy2(ArrayList<User> arrayList) {
		User tmpUser;
		//对上述ArrayList中的user对象进行排序（排序规则为：salary小的排前面）
		for(int i=0 ;i<arrayList.size();i++){
			for(int j=i;j<arrayList.size();j++){
				if(arrayList.get(i).getSalary() > arrayList.get(j).getSalary()){
					tmpUser = arrayList.get(i);
					arrayList.set(i, arrayList.get(j));
					arrayList.set(j, tmpUser);
				}
			}
		}
		for (User user : arrayList) {
			System.out.println(user);
		}
	}

	public static void orderBy1(ArrayList<User> arrayList) {
		User tmpUser;
		//对上述ArrayList中的user对象进行排序（排序规则为：age大的排前面）
		for(int i=0 ;i<arrayList.size();i++){
			for(int j=i;j<arrayList.size();j++){
				if(arrayList.get(i).getAge() < arrayList.get(j).getAge()){
					tmpUser = arrayList.get(i);
					arrayList.set(i, arrayList.get(j));
					arrayList.set(j, tmpUser);
				}
			}
		}
		for (User user : arrayList) {
			System.out.println(user);
		}
	}

}
