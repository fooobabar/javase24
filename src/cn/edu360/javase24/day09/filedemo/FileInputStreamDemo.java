package cn.edu360.javase24.day09.filedemo;

import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("d:/a.txt");
		
		int i;
		while((i = fis.read())!=-1){
			System.out.println((char)i);
		}
		
		fis.close();
		
		FileInputStream fis2 = new FileInputStream("d:/b.txt");
		
		char[] ch = new char[3];
		
		int num = fis2.read(ch);
		
	}

}
