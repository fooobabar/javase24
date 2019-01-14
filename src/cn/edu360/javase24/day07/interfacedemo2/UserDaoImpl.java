package cn.edu360.javase24.day07.interfacedemo2;

import org.junit.Test;

public class UserDaoImpl implements UserDao {

	@Override
	public User findUserByName(String username) {
		
		User user = UserDatabase.userMap.get(username);
		return user;
	}

	@Override
	public boolean checkUserIfExist(String username) {
		
		return UserDatabase.userMap.containsKey(username);
	}

	@Override
	public void addUser(User user) {
		UserDatabase.userMap.put(user.getUsername(), user);

	}
	
	@Test
	public void testUsermethod(){ 
		UserDao ud = new UserDaoImpl(); 
		System.out.println(ud.findUserByName("zhangsan"));
		System.out.println(ud.checkUserIfExist("zhangsan"));
		System.out.println(ud.checkUserIfExist("lisi"));
	}

}
