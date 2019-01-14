package cn.edu360.javase.exam02.base;

public class Product {
	private String id ;
	private String name;
	private float price;
	private int remain;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getRemain() {
		return remain;
	}
	public void setRemain(int remain) {
		this.remain = remain;
	}
	
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", price=" + price + ", remain=" + remain;
	}
	public Product() {
	}
	
	public Product(String id, String name, float price, int remain) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.remain = remain;
	}
	
	
}
