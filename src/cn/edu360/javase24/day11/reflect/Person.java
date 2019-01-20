package cn.edu360.javase24.day11.reflect;

public class Person {
	public String name;
	public void say(){
		System.out.println("说话了");
	}
	public void eat(){
		System.out.println("吃饭了");
	}

	public void eat(String food){
		System.out.println(this.name+"吃饭了，吃的是" + food);
	}

	public void makeFriend(String name ){
		System.out.println("我有男朋友了，他名字叫" + name);
	}
	
}
