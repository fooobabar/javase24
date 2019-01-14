package cn.edu360.javase24.day05.shop;

import java.util.ArrayList;
import java.util.Iterator;

public class Carts {
	private ArrayList<Product> products=new ArrayList<>();

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(String products,ProductManagement pmgmt) {
		String[] prods = products.split(",");
		for (int i = 0; i < prods.length; i++) {
			
			String[] prod = prods[i].split(":");
			
			this.products.add(new Product(prod[0],Integer.parseInt(prod[1])));
		}
	}
	
	public void showProducts(){
		for (Product product : products) {
			System.out.println("商品ID:"+product.getProductId()+" 商品数量:"+product.getNum());
		}
	}
	
	public void deleteProduct(String pdt){
		for (int i = 0; i < this.products.size(); i++) {
			if(this.products.get(i).getProductId().equals(pdt)){
				this.products.remove(i);
				break;
			}
		}
	}
	
	public void modifyProductNum(String pdt,int num){
		for (int i = 0; i < this.products.size(); i++) {
			if(this.products.get(i).getProductId().equals(pdt)){
				this.products.get(i).setNum(num);
				break;
			}
		}
	}
	
}
