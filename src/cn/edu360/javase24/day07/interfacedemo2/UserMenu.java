package cn.edu360.javase24.day07.interfacedemo2;

import java.util.Scanner;

public class UserMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		System.out.println("1. 登录; 2. 注册; 3. 退出");
		
		while(flag){

			UserService userManage = new UserServiceImpl();
			
			String nextLine=sc.nextLine();
			
			switch(nextLine){
			case "1":
				loginMethod(sc, userManage);
				break;
			case "2":
				registMethod(sc, userManage);
				break;
			case "3":
				System.out.println("bye..............");
				flag=false;
			}
		}
		}

	public static void registMethod(Scanner sc, UserService userManage) {
		System.out.println("请输入用户名：");
		String name = sc.nextLine();
		System.out.println("请输入密码：");
		String pwd1 = sc.nextLine();
		System.out.println("请再输入密码：");
		String pwd2 = sc.nextLine();
		
		String res = userManage.regist(name, pwd1, pwd2);

		switch(res){
		case "1":
			System.out.println("两次密码不相同");
			break;
		case "2":
			System.out.println("账号被注册过了");
			break;
		case "3":
			System.out.println("你以后就是我的人了");
			break;
		}
	}

	public static void loginMethod(Scanner sc, UserService userManage) {
		System.out.println("请输入账号：");
		String username = sc.nextLine();
		System.out.println("请输入密码：");
		String pwd = sc.nextLine();
		
		boolean login = userManage.login(username, pwd);
		
		if (login){
			System.out.println("恭喜您，登录成功");
		}else{
			System.out.println("抱歉，您的用户名密码不正确");
		}
	} 
}
