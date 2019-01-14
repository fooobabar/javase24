package cn.edu360.javase24.day07.interfacedemo2;

public interface UserDao {
	User findUserByName(String username);
	
	boolean checkUserIfExist(String username);
	
	void addUser(User user);
}
