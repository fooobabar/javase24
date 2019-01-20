package cn.edu360.javase24.day10.reflect.itfc.Menu;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

import cn.edu360.javase24.day10.reflect.itfc.UserRegisterService.UserRegisterService;

public class Menu {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("day10file/a.txt")));
		String className = br.readLine();
		System.out.println(className);
		
		Class<?> forName = Class.forName(className);
		
		UserRegisterService registerService = (UserRegisterService) forName.newInstance();
		
		registerService.checkIfExist("a");
		
		registerService.registerUser("a", "123", "123");
	}

}
