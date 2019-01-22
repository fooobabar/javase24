package cn.edu360.javase24.day13.socketdemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws Exception {
		//启动一个socket服务端（本质就是向操作系统注册一个端口号，并且监听这个端口上的消息）
		ServerSocket ss = new ServerSocket(10200);

		//监听这个端口上的消息
		Socket sc = ss.accept();  //等待并接收客户端的请求
		
		//从连接中接收数据，需要先获得一个输入流工具
		InputStream in = sc.getInputStream();
		
		//从输入流中拿数据
		int read = in.read();
		char x =  (char) read;
		System.out.println(x);
		
		in.close();
		sc.close();
		ss.close();
		
		
		
		
	}

}
