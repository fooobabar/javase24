package cn.edu360.javase24.day07.interfacedemo2;

import java.util.Scanner;

public class UserMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		System.out.println("1. ��¼; 2. ע��; 3. �˳�");
		
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
		System.out.println("�������û�����");
		String name = sc.nextLine();
		System.out.println("���������룺");
		String pwd1 = sc.nextLine();
		System.out.println("�����������룺");
		String pwd2 = sc.nextLine();
		
		String res = userManage.regist(name, pwd1, pwd2);

		switch(res){
		case "1":
			System.out.println("�������벻��ͬ");
			break;
		case "2":
			System.out.println("�˺ű�ע�����");
			break;
		case "3":
			System.out.println("���Ժ�����ҵ�����");
			break;
		}
	}

	public static void loginMethod(Scanner sc, UserService userManage) {
		System.out.println("�������˺ţ�");
		String username = sc.nextLine();
		System.out.println("���������룺");
		String pwd = sc.nextLine();
		
		boolean login = userManage.login(username, pwd);
		
		if (login){
			System.out.println("��ϲ������¼�ɹ�");
		}else{
			System.out.println("��Ǹ�������û������벻��ȷ");
		}
	} 
}
