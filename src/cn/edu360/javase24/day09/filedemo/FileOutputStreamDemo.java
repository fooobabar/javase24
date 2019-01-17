package cn.edu360.javase24.day09.filedemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws Exception {
		//覆盖写文件
		FileOutputStream fos = new FileOutputStream("xx.oo");
		String s = "你好";
		byte[] bytes = s.getBytes("UTF-8");
		fos.write(bytes);
		
		fos.close();

		//往一个文件中追加数据
		FileOutputStream fos2 = new FileOutputStream("xx.oo",true);
		
		s = ",傻逼";
		byte[] bytes2 = s.getBytes("UTF-8");
		fos2.write(bytes2);
		fos2.close();
	}

}
