package cn.edu360.javase24.day08.sortutil2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;


public class Test {

	public static void main(String[] args) {
		ArrayList<User> ulist = new ArrayList<>(); 
		User u1 = new User("u1", "嫦娥", 18, 1000.0f);
		User u2 = new User("u2", "吴刚", 18, 1200.0f);
		User u3 = new User("u3", "玉兔", 28, 1500.0f);
		User u4 = new User("u4", "八戒", 8, 1200.0f); 
		
		ulist.add(u1);
		ulist.add(u2);
		ulist.add(u3);
		ulist.add(u4);
		 
		//构造排序工具 
		SortUtil<User> sortUtil1= new SortUtil<>();
		
		sortUtil1.sort(ulist, new AgeBijiaoQi());
		
		for (User user : ulist) {
			System.out.println(user);
		}
		
		ArrayList<Product> plist=new ArrayList<>();
		plist.add(new Product("1", "a", 1.1f, 210));
		plist.add(new Product("1", "c", 3.4f, 2400));
		plist.add(new Product("1", "p", 1.9f, 200));
		plist.add(new Product("1", "z", 2.1f, 2050));

		SortUtil<Product> sortUtil2 = new SortUtil<>();
		
	    sortUtil2.sort(plist, new PriceBijiaoqi());
		for (Product product : plist) {
			System.out.println(product);
		}
		
		sortUtil2.sort(plist,new BijiaoQi<Product>(){ 
			@Override
			public boolean bijiao(Product o1, Product o2) {
				return o1.getPrice()>o2.getPrice();
				}
			}
		);
		for (Product product : plist) {
			System.out.println(product);
		}
		
		
	}

}
