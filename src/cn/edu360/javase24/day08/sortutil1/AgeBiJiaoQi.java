package cn.edu360.javase24.day08.sortutil1;

public class AgeBiJiaoQi implements BiJiaoQi {

	@Override
	public boolean bijiao(User u1, User u2) {
		if(u1.getAge()>u2.getAge()){
			return true;
		}
		return false;
	}

}
