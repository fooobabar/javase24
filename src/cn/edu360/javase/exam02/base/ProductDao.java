package cn.edu360.javase.exam02.base;

import java.util.ArrayList;

public interface ProductDao {
	public boolean addProduct(Product p);
	public boolean checkProductIfExist(String name);
	public ArrayList<Product> getProductList();
	public Product getProductById(String id);
	public Product getProductByName(String name);
	public ArrayList<Product> getProductsByPrice(float maxprice, float minprice);
	
	
}
