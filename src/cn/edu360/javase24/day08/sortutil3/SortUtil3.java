package cn.edu360.javase24.day08.sortutil3;

import java.util.ArrayList;

public class SortUtil3 {

	public void sort(ArrayList<User> ulist){
		User tmp;
		for(int i=0 ;i<ulist.size();i++){
			for(int j=i;j<ulist.size() ; j++){
				int flag=ulist.get(i).compareTo(ulist.get(j));
				if (flag>0){
					tmp=ulist.get(i);
					ulist.set(j, ulist.get(i));
					ulist.set(i, tmp);
				}
			}
		}
	}
}
