package cn.edu360.javase24.day09.filedemo;

import java.io.File;
import java.io.FilenameFilter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class FileDemo {

	public static void main(String[] args) {
		File file = new File("d:/pics2/bbb/ccc/ddd");
		file.mkdirs(); // 创建好几层
		file.mkdir(); // 创建好1层
		file.isDirectory();

		file.getAbsolutePath();
		File[] listFiles = file.listFiles();
		String[] ls = file.list();
		if (ls.length > 0) {
			System.out.println("not null");
		} else {
			System.out.println("null");
		}
	}

	@Test
	public void listFilesTest() {
		File f = new File("f:/");
		File[] listFiles = f.listFiles();

		for (int i = 0; i < listFiles.length; i++) {
			Date date = new Date(listFiles[i].lastModified());
			DateFormat dfmt = new SimpleDateFormat("yyyyMMddHHmmssSSS");

			System.out.println(listFiles[i].getName() + ":" + dfmt.format(date));
		}
	}
	
	@Test
	public void listFilesTest2() {
		File file = new File("d:/logs/accesslog/");
		File[] listFiles = file.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File arg0, String arg1) {
				// TODO Auto-generated method stub
				if (arg1.startsWith("access.log.")) {
					return true;
				}
				return false;
			}
		});

		System.out.println(Arrays.toString(listFiles));
	}

}
