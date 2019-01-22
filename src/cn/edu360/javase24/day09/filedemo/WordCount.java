package cn.edu360.javase24.day09.filedemo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;

public class WordCount {

	public static void main(String[] args) throws Exception {

		//创建BufferedReader，按行读取文件
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("day09file/wordcount.txt")));
		
		String line;
		
		//存储单词出现次数
		HashMap<String, Integer> wordcount=new HashMap<>();
		
		//循环文件中的内容，按行处理
		while((line=br.readLine())!=null){

			//按照空格拆分成数组
			String[] lines = line.split(" ");
			for (int i = 0; i < lines.length; i++) {
				
				//过滤掉多个空格
				if(lines[i].length()!=0){
					String str=lines[i];
					int cnt =1;
					
					//如果单词已经存在，则增加单词出现次数
					if(wordcount.containsKey(str)){
						cnt=wordcount.get(str);
						wordcount.remove(str);
						cnt++;
					}
					wordcount.put(str, cnt);
				}
			}
		}
		Set<String> keySet = wordcount.keySet();
		for (String string : keySet) {
			System.out.println(string+":"+wordcount.get(string));
		}
	}

}
