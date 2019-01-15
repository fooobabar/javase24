package cn.edu360.javase24.day09.filedemo;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		File file = new File("d:/pics2/bbb/ccc/ddd"); 
		file.mkdirs();  //创建好几层
		file.mkdir() ;    //创建好1层
		file.isDirectory();
		
		file.getAbsolutePath();
		File[] listFiles = file.listFiles();
		String[] ls = file.list();
		if(ls.length >0){
			System.out.println("not null");
		}else {
			System.out.println("null");
		}
	}

}
