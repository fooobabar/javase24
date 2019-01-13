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
		//��������Ƿ�һ�£������һ�£�ֱ�ӷ���1
		if(!pwd1.equals(pwd2)){
			return "1";
		}
		
		//����dao�㣬�鿴�û��Ƿ����
		boolean ifExist = userDao.checkUserIfExist(name);
		
		//����û����ڣ�����2
		if(ifExist){
			return "2";
		}
		
		//���û���Ϣ�洢�����ݿ���
		User u = new User();
		u.set(name, pwd1);
		userDao.addUser(u);
		
		return "3";
	}

}
