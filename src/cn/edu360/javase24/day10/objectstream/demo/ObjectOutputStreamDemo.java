package cn.edu360.javase24.day10.objectstream.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 对象输出流
 * @author haniiii
 *
 */
public class ObjectOutputStreamDemo {

	public static void main(String[] args) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day10file/objectoutput.dat"));

		User user = new User("慕容复",38,2000f,80000);

		User user2 = new User("扫地僧",58,3000f,0);

		oos.writeObject(user);

		oos.writeObject(user2);
		
		oos.close();
		
	}

}
