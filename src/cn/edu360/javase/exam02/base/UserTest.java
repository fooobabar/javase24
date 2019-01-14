package cn.edu360.javase.exam02.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class UserTest {

	public static void main(String[] args) {

		User u1 = new User("1","����",18,2000f);
		User u2 = new User("2","����",20,3000f);
		User u3 = new User("3","����",19,2500f);
		User u4 = new User("4","����",19,3600f);
		User u5 = new User("5","����",20,2800f);
		
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
		//������ArrayList�е�user�����������
		//������Ĺ���Ϊ�� �ȱȽ�age��ageС����ǰ��; ���age���,��Ƚ�salary��salaryС����ǰ�棩
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
		//������ArrayList�е�user������������������Ϊ��salaryС����ǰ�棩
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
		//������ArrayList�е�user������������������Ϊ��age�����ǰ�棩
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
