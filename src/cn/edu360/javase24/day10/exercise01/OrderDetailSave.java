package cn.edu360.javase24.day10.exercise01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class OrderDetailSave {

	public static void main(String[] args) throws Exception{
		// 先读取商品数据
		ObjectInputStream p_ois = new ObjectInputStream(new FileInputStream("pdt.obj"));
		ArrayList<Product> pList= (ArrayList<Product>)p_ois.readObject();
		p_ois.close();
		
		// 再去读取订单信息
		ObjectInputStream o_ois = new ObjectInputStream(new FileInputStream("order.obj"));
		ArrayList<Order> oList = (ArrayList<Order>)o_ois.readObject();
		oList.clone();
		
		
		HashMap<String, Product> prodMap= new HashMap<>();
		
		// 把商品数据从list中导入map中，方便查询
		for (Product prod: pList) {
			prodMap.put(prod.getpId(), prod);
		}
		
		ArrayList<OrderDetail> orderDetailList = new ArrayList<>();
		
		// 生成订单详情
		for (Order o : oList) {
			Product p = prodMap.get(o.getPid());
			
			OrderDetail orderDetail = new OrderDetail(o.getOid(), o.getPid(), p.getpName(), p.getpPrice(), o.getpNum());
			orderDetailList.add(orderDetail);
		}
		
		// 保存订单详情数据到文件中
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("order_detail.obj"));
		
		oos.writeObject(orderDetailList);
		oos.close();
		
		// 从文件中读取订单详情做验证
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("order_detail.obj"));
		
		ArrayList<OrderDetail> odlist= (ArrayList<OrderDetail>)ois.readObject();
		
		ois.close();
		for (OrderDetail orderDetail : odlist) {
			System.out.println(odlist);
		}
	}

}
