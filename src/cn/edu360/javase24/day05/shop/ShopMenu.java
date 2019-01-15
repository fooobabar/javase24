package cn.edu360.javase24.day05.shop;

import java.util.Scanner;

/**
 * 售货系统的入口程序
 *
 */
public class ShopMenu {
	public static void main(String[] args) {
		ProductManagement pmgmt = new ProductManagement();
		CreateSomeProducts.create(pmgmt);
		Carts carts = new Carts();
		
		System.out.println("欢迎来到小牛商城，请选择您要进行的操作");
		
		Scanner scanner = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		String command ="";
		boolean flag = true;
		while(flag){
			System.out.println("1.浏览商品；2.购物；3.查看购物车；4.修改购物车；5.提交订单；6.付款；7.退出");
			command = scanner.nextLine();
			
			switch(command){
			case "1":
				pmgmt.showProducts();
				break;
			case "2":
				System.out.println("请选择您要购买的商品，商品id:个数，多个商品用逗号隔开");
				System.out.println("例如，pdt1:2,pdt6:3");
				String pdts = s.nextLine();
				carts.setProducts(pdts,pmgmt);
				s = new Scanner(System.in);
				
				break;
			case "3":
				carts.showProducts();
				break;
			case "4":
				System.out.println("修改购物车[d for delete,m for modify");
				s = new Scanner(System.in);
				break;
			case "5":
				System.out.println("提交订单");
				break;
			case "6":
				System.out.println("付款");
				break;
			case "7":
				System.out.println("欢迎下次光临");
				flag = false;
				break;
			default:
				System.out.println("lkdsfjdslkfj");
			}
		}
	}
}
