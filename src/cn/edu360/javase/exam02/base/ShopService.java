package cn.edu360.javase.exam02.base;

import java.util.ArrayList;

public interface ShopService {
	public boolean addProduct(String id,String name,float price,int remain);
	public void showProduct();
	public void getProductById(String id);
	public void getProductByName(String name);
	public ArrayList<Product> getProductsByPrice(float maxprice,float minprice);
	public boolean delProductById(String id);
}