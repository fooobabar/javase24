package cn.edu360.javase.exam02.base;

import java.util.ArrayList;

public class ShopServiceimpl implements ShopService {
	ProductDao pd = null;
	@Override
	public boolean addProduct(String id, String name, float price, int remain) {
		Product p  = new Product(id,name,price,remain); 
		if(pd.checkProductIfExist(p.getName())){ 
			return pd.addProduct(p); 
		}
		return false;
	}

	@Override
	public void showProduct() { 
		for (Product prod : pd.getProductList()) {
			System.out.println(prod.toString());
		}
	}

	@Override
	public void getProductById(String id) {
		System.out.println(pd.getProductById(id));
	}

	@Override
	public void getProductByName(String name) {
		System.out.println(pd.getProductByName(name));
	}

	@Override
	public ArrayList<Product> getProductsByPrice(float maxprice, float minprice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delProductById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
