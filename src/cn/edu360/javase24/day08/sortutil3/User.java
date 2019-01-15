package cn.edu360.javase24.day08.sortutil3;

public class User implements Comparable<User>{
	private String id ;
	private String name ;
	private int age ;
	private float salary;
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
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
	}
	public User(String id, String name, int age, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public User() {
	}
	@Override
	public int compareTo(User o) {
		if(this.getAge() > o.getAge()){
			return 1;
		}
		return 0;
	}
	
}
