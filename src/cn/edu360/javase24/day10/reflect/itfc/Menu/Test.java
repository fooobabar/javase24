package cn.edu360.javase24.day10.reflect.itfc.Menu;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 面向接口开发，
 * 框架思想，实现类还没开发完成，但是主类已经开发完了，
 * 实现类开发完成，这个程序就可以跑了。
 *
 */
public class Test {

	public static void main(String[] args) throws Exception {
		
		/**
		 * 解析配置文件，将所有接口名及其调用的实现类名放入一个hashmap中
		 */ 
		HashMap<String, String> applicationContext = new HashMap<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("day10file/b.txt")));
		
		String line="";
		while((line=br.readLine()) != null){
			String[] split = line.split(":");
			applicationContext.put(split[0], split[1]);
		}
		br.close();
		/**
		 * 先调一下OneTwoService的实现类的say方法
		 */
		Class<?> forName1 = Class.forName(applicationContext.get("OneTwoService"));
		OneTwoService onetwo = (OneTwoService)forName1.newInstance();
		onetwo.say();
		
		/**
		 * 在调用一下OtherService的实现类eat方法
		 */
		Class<?> forName2 = Class.forName(applicationContext.get("OtherService"));
		OtherService other = (OtherService)forName2.newInstance();
		other.eat();
	}

}
