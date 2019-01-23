package cn.edu360.javase24.day09.filedemo;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class ListFilesOrderDemo {

	public static void main(String[] args) throws Exception {
		listFilesInitTest();
		listFilesOrderTest();
	}

	/**
	 * 先创建一些测试文件，并且修改文件的最后访问时间
	 * 
	 * @throws Exception
	 */
	public static void listFilesInitTest() throws Exception {
		File f = new File("f:/examplefile/");
		boolean mkdirRst = f.mkdir();
		if (mkdirRst) {
			String[] fileNames = new String[] { "20190101", "20180101", "20120201", "19900202", "19990123" };
			for (int i = 0; i < fileNames.length; i++) {
				File file = new File(f.getAbsolutePath() + "/" + fileNames[i]);
				file.createNewFile();
				DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
				Date date = dateFormat.parse(file.getName());

				file.setLastModified(date.getTime());
			}
		}
	}

	/**
	 * 排序listFiles 返回的数组
	 */
	public static void listFilesOrderTest() {
		File f = new File("f:/examplefile/");
		File[] listFiles = f.listFiles();
		System.out.println("-----------==========默认排序===========--------------");

		for (int i = 0; i < listFiles.length; i++) {
			System.out.println(listFiles[i].getName());
		}

		System.out.println("-----------==========根据访问时间升序排序===========--------------");
		Arrays.sort(listFiles, new Comparator<File>() {

			@Override
			public int compare(File o1, File o2) {
				// TODO Auto-generated method stub
				return Long.compare(o1.lastModified(), o2.lastModified());
			}
		});
		for (int i = 0; i < listFiles.length; i++) {
			System.out.println(listFiles[i].getName());
		}
		System.out.println("-----------==========根据访问时间降序排序===========--------------");
		Arrays.sort(listFiles, new Comparator<File>() {

			@Override
			public int compare(File o1, File o2) {
				// TODO Auto-generated method stub
				return Long.compare(o2.lastModified(), o1.lastModified());
			}
		});
		for (int i = 0; i < listFiles.length; i++) {
			System.out.println(listFiles[i].getName());
		}

	}
}
