package cn.edu360.javase24.day10.objectstream.demo;

import java.io.Serializable;
// implements Serializable 告诉JDK，这个类的对象是可被序列化的
public class User implements Serializable {
	private String name;
	private int age;
	private float salary;
	private long hairNum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public long getHairNum() {
		return hairNum;
	}
	public void setHairNum(long hairNum) {
		this.hairNum = hairNum;
	}
	public User(String name, int age, float salary, long hairNum) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.hairNum = hairNum;
	}
	public User() {
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", salary=" + salary + ", hairNum=" + hairNum + "]";
	}
	
	
}
