package cn.edu360.javase24.day09.filedemo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("a.txt")));
		
		String line=br.readLine();
		System.out.println(line);
		System.out.println("--------------------------");
		
		while ((line = br.readLine()) != null){
			System.out.println(line);
		}
	}

}
