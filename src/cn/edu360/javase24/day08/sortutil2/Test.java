package cn.edu360.javase24.day08.sortutil2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;


public class Test {

	public static void main(String[] args) {
		ArrayList<User> ulist = new ArrayList<>();
<<<<<<< HEAD
		User u1 = new User("u1", "å«¦å¨¥", 18, 1000.0f);
		User u2 = new User("u2", "å´åˆš", 18, 1200.0f);
		User u3 = new User("u3", "çŽ‰å…”", 28, 1500.0f);
		User u4 = new User("u4", "å…«æˆ’", 8, 1200.0f);
=======
		User u1 = new User("u1", "æÏ¶ð", 18, 1000.0f);
		User u2 = new User("u2", "Îâ¸Õ", 18, 1200.0f);
		User u3 = new User("u3", "ÓñÍÃ", 28, 1500.0f);
		User u4 = new User("u4", "°Ë½ä", 8, 1200.0f);
>>>>>>> cf78b86467588a8347c38ed7f658da34fc2c8417
		
		ulist.add(u1);
		ulist.add(u2);
		ulist.add(u3);
		ulist.add(u4);
		
<<<<<<< HEAD
		//æž„é€ æŽ’åºå·¥å…·
=======
		//¹¹ÔìÅÅÐò¹¤¾ß
>>>>>>> cf78b86467588a8347c38ed7f658da34fc2c8417
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
