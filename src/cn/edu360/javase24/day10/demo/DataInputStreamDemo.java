package cn.edu360.javase24.day10.demo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * DataInputStream 可以从字节流中读取具体数据类型
 * @author iiii
 *
 */
public class DataInputStreamDemo {

	public static void main(String[] args) throws Exception {
		DataInputStream dis = new DataInputStream(new FileInputStream("dataoutputstreamdemo.txt"));
		
		int age = dis.readInt();
		System.out.println(age);
		
		
	}

}
