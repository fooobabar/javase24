package cn.edu360.javase24.day07.interfacedemo2;

public class UserServiceImpl implements UserService {

	UserDao userDao = new UserDaoImpl();
	
	@Override
	public boolean login(String name, String pwd) {
		User user = userDao.findUserByName(name);
		if(user ==null){
			return false;
		}
		
		if(user.getPasswd().equals(pwd)){
			return true;
		}
		
		return false;
	}

	@Override
	public String regist(String name, String pwd1, String pwd2) {
		//检查密码是否一致，如果不一致，直接返回1
		if(!pwd1.equals(pwd2)){
			return "1";
		}
		
		//调用dao层，查看用户是否存在
		boolean ifExist = userDao.checkUserIfExist(name);
		
		//如果用户存在，返回2
		if(ifExist){
			return "2";
		}
		
		//将用户信息存储到数据库中
		User u = new User();
		u.set(name, pwd1);
		userDao.addUser(u);
		
		return "3";
	}

}
