package cn.edu360.javase24.day10.reflect.itfc.Menu;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Menu {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("day10file/a.txt")));
		String className = br.readLine();
		System.out.println(className);
	}

}
