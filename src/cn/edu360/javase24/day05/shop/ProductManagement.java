package cn.edu360.javase24.day05.shop;

import java.util.ArrayList;
/**
 * 1.�������е���Ʒ����
 * 2.�ṩ������Щ���ݵķ���
 * @author iiii
 *
 */
public class ProductManagement {
	private ArrayList<Product> pdts = new ArrayList<>();
	
	/**
	 * �����Ʒ����
	 * @param p
	 */
	public void addProduct(Product p){
		this.pdts.add(p);
	}
	
	/**
	 * չʾ��Ʒ����
	 */
	public void showProducts(){
		for (int i = 0; i < this.pdts.size(); i++) {
			System.out.println(pdts.get(i));
			
		}
	}
}
