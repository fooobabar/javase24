package cn.edu360.javase24.day10.excersize01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class OrderSave {

	public static void main(String[] args) throws Exception {
		Order o1 = new Order("o1", "p01", 3);
		Order o2 = new Order("o2", "p03", 2);
		Order o3 = new Order("o3", "p02", 5);
		Order o4 = new Order("o4", "p04", 4);
		 
		ArrayList<Order> oList=new ArrayList<>();
		oList.add(o1);
		oList.add(o2);
		oList.add(o3);
		oList.add(o4);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("order.obj"));
		
		oos.writeObject(oList);
		
		oos.close();
		
	}

}
