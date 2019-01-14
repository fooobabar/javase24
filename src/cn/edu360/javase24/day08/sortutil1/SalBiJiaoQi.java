package cn.edu360.javase24.day08.sortutil1;

public class SalBiJiaoQi implements BiJiaoQi {

	@Override
	public boolean bijiao(User u1, User u2) {
		if(u1.getSalary()<u2.getSalary()){
			return true;
		}
		return false;
	}

}
