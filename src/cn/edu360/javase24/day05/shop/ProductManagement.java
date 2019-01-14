package cn.edu360.javase24.day05.shop;

import java.util.ArrayList;
/**
 * 1.保存所有的商品数据
 * 2.提供操作这些数据的方法
 * @author iiii
 *
 */
public class ProductManagement {
	private ArrayList<Product> pdts = new ArrayList<>();
	
	/**
	 * 添加商品数据
	 * @param p
	 */
	public void addProduct(Product p){
		this.pdts.add(p);
	}
	
	/**
	 * 展示商品数据
	 */
	public void showProducts(){
		for (int i = 0; i < this.pdts.size(); i++) {
			System.out.println(pdts.get(i));
			
		}
	}
}
