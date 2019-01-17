package cn.edu360.javase24.day09.filedemo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;

public class WordCount {

	public static void main(String[] args) throws Exception {
		//String line="a  b  c d e     f";
//		String[] lines = line.split(" ");
//		System.out.println(Arrays.toString(lines));

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("wordcount.txt")));
		
		String line;
		HashMap<String, Integer> wordcount=new HashMap<>();
		
		while((line=br.readLine())!=null){
			String[] lines = line.split(" ");
			for (int i = 0; i < lines.length; i++) {
				if(lines[i].length()!=0){
					String str=lines[i];
					int cnt =1;
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
