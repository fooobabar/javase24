package cn.edu360.javase24.day10.demo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataStreamExcersize {

	public static void main(String[] args) throws Exception {
		User u1 = new User("张三丰", 100, 10000.0f, 300000);
		User u2 = new User("三毛", 3, 100.0f, 3);
		
		//将这两个对象的数据写入文件
		DataOutputStream dot = new DataOutputStream(new  FileOutputStream("user.dat"));
		dot.writeUTF(u1.getName());
		dot.writeInt(u1.getAge());
		dot.writeFloat(u1.getSalary());
		dot.writeLong(u1.getHairNum());
		
		dot.writeUTF(u2.getName());
		dot.writeInt(u2.getAge());
		dot.writeFloat(u2.getSalary());
		dot.writeLong(u2.getHairNum());
		
		dot.close();
		
		//读取user数据
		DataInputStream dit = new DataInputStream(new FileInputStream("user.dat"));
		User dit_u1 = new User(dit.readUTF(), dit.readInt(), dit.readFloat(), dit.readLong());
		User dit_u2 = new User(dit.readUTF(), dit.readInt(), dit.readFloat(), dit.readLong());
		System.out.println(dit_u1);
		System.out.println(dit_u2);
		
		/*
		 * 如果对象数据结构很复杂，就没法通过这种方法读取了，
		 * 比如User类有一个朋友列表，那么读的时候不知道这个列表的长度。没法准确读取。
		 */
	}

}
