package cn.edu360.javase24.day10.excersize01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ProductSave {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Product p1 = new Product("p01","香蕉",10.8f);
		Product p2 = new Product("p02","苹果",10.8f);
		Product p3 = new Product("p03","榴莲",28.8f);
		Product p4 = new Product("p04","葡萄",18.8f);
		
		ArrayList<Product> pList=new ArrayList<>();
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		pList.add(p4);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pdt.obj"));
		oos.writeObject(pList);
		oos.close();
	}

}
