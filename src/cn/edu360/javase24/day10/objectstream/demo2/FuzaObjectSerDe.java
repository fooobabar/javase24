package cn.edu360.javase24.day10.objectstream.demo2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

/**
 * 复杂类型对象的存、取  ------  序列化和反序列化 
 *
 */
public class FuzaObjectSerDe {

	@Test
	public void testList() throws Exception {
		
		//将一个list对象直接写入文件
		User user1 = new User("慕容复",38,2000f,80000); 
		User user2 = new User("扫地僧",58,3000f,0);
		ArrayList<User> uList = new ArrayList<>();
		
		uList.add(user1);
		uList.add(user2);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objectoutput2.dat"));
		oos.writeObject(uList);
		oos.close();
		
		//从文件中读取一个list对象
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objectoutput2.dat"));
		ArrayList<User> userlist = (ArrayList<User>) ois.readObject();
		System.out.println(userlist);
	}
	
	/**
	 * 写入map对象到文件,从文件读取map对象
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws Exception 
	 */
	@Test
	public void testMap() throws Exception{ 
		User user1 = new User("慕容复",38,2000f,80000); 
		User user2 = new User("扫地僧",58,3000f,0);
		
		HashMap<String, User> userMap = new HashMap<>();
		userMap.put(user1.getName(), user1);
		userMap.put(user2.getName(), user2);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objectoutputstream.dat"));
		oos.writeObject(userMap);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objectoutputstream.dat"));
		HashMap<String, User> userMap2= (HashMap<String, User>) ois.readObject();
		ois.close();
		
		System.out.println(userMap2);
	} 
	
	
	/**
	 * 写入一个包含list成员的user对象
	 */
	@Test
	public void testObjhasList() throws Exception{

		User user1 = new User("慕容复",38,2000f,80000);
		
		ArrayList<String> friends = new ArrayList<>();
		friends.add("王语嫣");
		friends.add("段誉");
		friends.add("乔峰");
		user1.setFriends(friends);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objectoutputstream5.dat"));
		oos.writeObject(user1);
		
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objectoutputstream5.dat"));
		
		User user = (User) ois.readObject();
		ois.close();
		System.out.println(user);
		System.out.println(user.getFriends());
		
	}

}
