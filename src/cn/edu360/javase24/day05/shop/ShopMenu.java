package cn.edu360.javase24.day05.shop;

import java.util.Scanner;

/**
 * �ۻ�ϵͳ����ڳ���
 *
 */
public class ShopMenu {
	public static void main(String[] args) {
		ProductManagement pmgmt = new ProductManagement();
		CreateSomeProducts.create(pmgmt);
		Carts carts = new Carts();
		
		System.out.println("��ӭ����Сţ�̳ǣ���ѡ����Ҫ���еĲ���");
		
		Scanner scanner = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		String command ="";
		boolean flag = true;
		while(flag){
			System.out.println("1.�����Ʒ��2.���3.�鿴���ﳵ��4.�޸Ĺ��ﳵ��5.�ύ������6.���7.�˳�");
			command = scanner.nextLine();
			
			switch(command){
			case "1":
				pmgmt.showProducts();
				break;
			case "2":
				System.out.println("��ѡ����Ҫ�������Ʒ����Ʒid:�����������Ʒ�ö��Ÿ���");
				System.out.println("���磬pdt1:2,pdt6:3");
				String pdts = s.nextLine();
				carts.setProducts(pdts,pmgmt);
				s = new Scanner(System.in);
				
				break;
			case "3":
				carts.showProducts();
				break;
			case "4":
				System.out.println("�޸Ĺ��ﳵ[d for delete,m for modify");
				s = new Scanner(System.in);
				break;
			case "5":
				System.out.println("�ύ����");
				break;
			case "6":
				System.out.println("����");
				break;
			case "7":
				System.out.println("��ӭ�´ι���");
				flag = false;
				break;
			default:
				System.out.println("lkdsfjdslkfj");
			}
		}
	}
}
