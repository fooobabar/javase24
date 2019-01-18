package cn.edu360.javase24.day09.product;

public class Product {
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
	@Override
	public String toString() {
		return "[pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + "]";
	}
	
	public Product(String pId, String pName, float pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
	}
	
	public Product() {
	}
	
	
}
