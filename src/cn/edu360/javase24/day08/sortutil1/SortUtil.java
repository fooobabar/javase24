package cn.edu360.javase24.day08.sortutil1;

import java.util.ArrayList;

public class SortUtil {
	public static void sort(ArrayList<User> uList,BiJiaoQi bijiaoqi) {
		User tmpuser ;
		for (int i = 0; i < uList.size(); i++) {
			for(int j = i;j<uList.size(); j++){
				boolean bijiao = bijiaoqi.bijiao(uList.get(i), uList.get(j));
				if(bijiao){
					tmpuser=uList.get(i);
					uList.set(i, uList.get(j));
					uList.set(j, tmpuser);
				}
			}
		}
	}
	
}
