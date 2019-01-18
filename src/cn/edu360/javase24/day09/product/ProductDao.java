package cn.edu360.javase24.day09.product;

import java.util.ArrayList;

public interface ProductDao {
	public void addProduct(String p)  throws Exception ;
	public ArrayList<Product> getAllProducts() throws Exception ;
}
