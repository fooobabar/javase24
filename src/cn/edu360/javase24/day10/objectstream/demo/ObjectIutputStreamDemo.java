package cn.edu360.javase24.day10.objectstream.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectIutputStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objectoutput.dat"));

		User u2 = (User) ois.readObject();

		User u3 = (User) ois.readObject();
		
		System.out.println(u2);
		System.out.println(u3);
	}

}
