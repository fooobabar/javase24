package cn.edu360.javase.exam02.base;

import java.util.HashMap;

public class ProductDatabase {
	public static HashMap<String, Product> productMap;
	static {
		Product p1 = new Product("p01","Í¸Ã÷½º´ø",8.8f,1000);
		productMap.put(p1.getId(), p1);
	}
}
