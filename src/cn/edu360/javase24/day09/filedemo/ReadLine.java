package cn.edu360.javase24.day09.filedemo;
import java.io.FileInputStream;
/*
 * 读取一行数据
 */
public class ReadLine {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("day09file/a.txt");
		
		byte[] buf = new byte[1024];
		int num=0;
		int i = 0;
		while ((num=fis.read()) != -1){
			if(num==13){
				break;
			}
			buf[i]=(byte)num;
			i++;
		}
		System.out.println(new String(buf,0,i)); 
	}

} 