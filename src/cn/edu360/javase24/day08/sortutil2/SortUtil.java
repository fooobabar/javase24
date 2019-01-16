package cn.edu360.javase24.day08.sortutil2;

import java.util.ArrayList;

public class SortUtil<T> {
	public void sort(ArrayList<T> list,BijiaoQi<T> bijiaoqi){
		for(int i=0;i<list.size();i++){
			for(int j=i;j<list.size();j++){
				boolean da = bijiaoqi.bijiao(list.get(i), list.get(j));
				if(da){
					T tmp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, tmp);
				}
			}
		}
	}
}
