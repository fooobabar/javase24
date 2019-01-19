package cn.edu360.javase24.day10.excersize01;

import java.io.Serializable;

public class Product implements Serializable {
	private String pId;
	private String pName;
	private float pPrice;
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
	public float getpPrice() {
		return pPrice;
	}
	public void setpPrice(float pPrice) {
		this.pPrice = pPrice;
	}
	public Product(String pId, String pName, float pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
	}
	
	public void set(String pId, String pName, float pPrice) { 
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
	}
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "[pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + "]";
	}

	
	
}
