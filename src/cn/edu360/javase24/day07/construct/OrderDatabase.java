package cn.edu360.javase24.day07.construct;

public class OrderDatabase {
	
	public static String orderVersion = "500";
	//初始化块
	{
		System.out.println("初始化块运行了....");
		System.out.println("初始化块运行之前，orderVersion"+orderVersion);
		orderVersion="1500";
		System.out.println("初始化块运行之前，orderVersion"+orderVersion);
		
	}
	//静态代码块
	static{
		System.out.println("静态代码块运行了....");
		System.out.println("静态代码块运行之前，orderVersion"+orderVersion);
		orderVersion="1000";
		System.out.println("静态代码块运行之前，orderVersion"+orderVersion);
	}
	//无参数构造
	public OrderDatabase(){
		System.out.println("空参构造函数运行了....");

		System.out.println("空参构造函数运行之前，orderVersion"+orderVersion);
		orderVersion="2000";
		System.out.println("空参构造函数运行之前，orderVersion"+orderVersion);
	}
}
