package cn.edu360.javase24.day09.filedemo;

import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FileInputStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("d:/a.txt");
		
		//一个一个读
		int i;
		while((i = fis.read())!=-1){
			System.out.println(i+" "+(char)i);
		}
		
		fis.close();
		
		System.out.println("--------------分隔符--------------");
		
		
		FileInputStream fis2 = new FileInputStream("d:/a.txt");
		
		byte[] ch = new byte[3];
		
		int num = fis2.read(ch);
		System.out.println(new String(ch,0,2));   // 从0开始，往下偏移2个字节
		System.out.println(Arrays.toString(ch));
		
		fis2.close();
		
		System.out.println("--------------分隔符--------------");
		FileInputStream fis3 = new FileInputStream("d:/a.txt");
		int num2 = 0;
		byte[] byte1=new byte[8];
		
		while( (num2 = fis3.read(byte1)) != -1){
			System.out.println(Arrays.toString(byte1));
			System.out.println(new String(byte1));   // 一次读取8字节
		}
		
		
		
	}

}
