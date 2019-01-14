package cn.edu360.javase24.day07.interfacedemo2;

public interface UserService {
	boolean login(String name,String pwd);
	String regist(String name,String pwd1,String pwd2);
}
