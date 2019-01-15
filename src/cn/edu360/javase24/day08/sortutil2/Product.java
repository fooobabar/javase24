package cn.edu360.javase24.day08.sortutil2;

public class Product {
	private String productId;
	private String productName;
	private float price;
	private int num;

	public Product() {
	} 
	
	public Product(String productId,int num){
		this.productId = productId;
		this.num = num;
	}
	
	public Product(String productId, String productName, float price, int num) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.num = num;
	}

	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", num=" + num
				+ "]";
	}
	
	
}
