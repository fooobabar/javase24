package cn.edu360.javase24.day10.excersize01;

import java.io.Serializable;

public class OrderDetail implements Serializable{
	private String oId;
	private String pId;
	private String pName;
	private float price;
	private int pNum;
	private float amount;
	
	
	public String getoId() {
		return oId;
	}
	public void setoId(String oId) {
		this.oId = oId;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getpNum() {
		return pNum;
	}
	public void setpNum(int pNum) {
		this.pNum = pNum;
	}
	public float getAmount() {
		return amount;
	}
	/*
	 * 总额是单价 * 数量
	 */
	public void setAmount(float amount) {
		this.amount = this.price * this.pNum;
	}
	@Override
	public String toString() {
		return "[oId=" + oId + ", pId=" + pId + ", pName=" + pName + ", price=" + price + ", pNum=" + pNum
				+ ", amount=" + amount + "]";
	}
	public OrderDetail(String oId, String pId, String pName, float price, int pNum) {
		super();
		this.oId = oId;
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.pNum = pNum; 
		this.amount = price * pNum;
	}
	public OrderDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void set(String oId, String pId, String pName, float price, int pNum, float amount) {
		this.oId = oId;
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.pNum = pNum;
		this.amount = amount;
	}
	
}
