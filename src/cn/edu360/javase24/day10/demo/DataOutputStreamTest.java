package cn.edu360.javase24.day10.demo;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 可以用UE打开看一下d:\a.dat 和 d:\b.dat 两个文件对应的字节数。
 * a.dat 输出9个字节，3个汉字，9个字节
 * b.dat 输出11个字节，两个字节标记位，9个字节的汉字，共11个字节
 *
 */
public class DataOutputStreamTest {

	public static void main(String[] args) throws Exception {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("d:/a.dat"));
		dos.write("我爱你".getBytes("utf-8"));  // UTF8是9个字节
		dos.close();
		
		DataOutputStream dos2 = new DataOutputStream(new FileOutputStream("d:/b.dat"));
		dos2.writeUTF("我爱你");    // 共11个字节，除了UTF8的9个字节之外，前两个字节是标记偏移量的，用来标记字符串有多少个字节
		dos2.close();
	}

}
