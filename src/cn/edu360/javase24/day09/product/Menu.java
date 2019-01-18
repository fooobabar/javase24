package cn.edu360.javase24.day09.product;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) throws Exception {
		boolean flag=true;
		ProductDao pdo = new ProductDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择操作类型1.新增商品，2.查看所有商品，3.退出");
		String nextLine = sc.nextLine();
		while(flag){
			switch(nextLine){
			case "1":
				System.out.println("您选择了新增商品，添加格式为：p01,六个核桃,5.5");
				nextLine = sc.nextLine(); 
				pdo.addProduct(nextLine);
				break;
			case "2":
				ArrayList<Product> plist=pdo.getAllProducts();
				System.out.println(plist);
				break;
			case "3":
				flag=false;
				break;
			default:
				System.out.println("输入有误");
			}
			 nextLine = sc.nextLine();
		}
	}

}
