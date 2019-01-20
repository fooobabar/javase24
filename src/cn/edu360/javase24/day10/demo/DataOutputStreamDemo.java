package cn.edu360.javase24.day10.demo;

import java.io.DataOutputStream; 
import java.io.FileOutputStream;

/**
 * DataOutputStream是一个包装流，他可以将各种类型的数据在内部转成byte字节
 * 然后利用FileOutputStream写入文件。
 *
 */
public class DataOutputStreamDemo {

	public static void main(String[] args) throws Exception {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("dataoutputstreamdemo.txt"));
		int a = 1688;
		dos.writeInt(a);  //文本文件看是乱码
		
		dos.close();
	}

}
