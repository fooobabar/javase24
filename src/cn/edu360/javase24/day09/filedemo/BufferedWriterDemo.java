package cn.edu360.javase24.day09.filedemo;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws Exception {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("x.y"),"UTF-8"));
		
		bw.write("我爱你，祖国");
		bw.close();
		
		BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("z.txt",true),"UTF-8"));
		bw2.write(13);
		bw2.write(10);
		
		bw2.write("我爱你，祖国");
		bw2.close();
	}

}
