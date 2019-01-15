package cn.edu360.javase24.day08.sortutil2;

public class AgeBijiaoQi implements BijiaoQi<User>{

	@Override
	public boolean bijiao(User o1, User o2) {
		if(o1.getAge()> o2.getAge()){
			return true;
		}
		return false;
	}
	
}
