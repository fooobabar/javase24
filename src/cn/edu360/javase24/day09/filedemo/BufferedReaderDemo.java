package cn.edu360.javase24.day09.filedemo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/*
 * 一行一行读取
 */
public class BufferedReaderDemo {

	public static void main(String[] args) throws Exception {
		//InputStreamReader 可以传入字符集类型
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("day09file/c_gbk.txt"),"GBK"));
		
		String line=br.readLine();
		System.out.println(line);
		System.out.println("--------------------------");
		
		while ((line = br.readLine()) != null){
			System.out.println(line);
		}
	}

} 