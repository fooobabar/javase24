package cn.edu360.javase24.day07.interfacedemo2;

public class User {
	private String userName;
	private String passwd;
	
	public void set(String userName,String passwd){
		this.userName = userName;
		this.passwd = passwd;
	}
	
	public String getUsername() {
		return userName;
	}
	public void setUsername(String username) {
		this.userName = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
}
