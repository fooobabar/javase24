package cn.edu360.javase24.day11.reflect;

import java.lang.reflect.Method;

/**
 * 反射机制的补充：如何使用字符串信息来指定要调用的方法
 * 字符串指定要调的方法名；
 * 字符串指定要调的方法的参数类型；
 * @author iiii
 *
 */
public class Test {

	// args = cn.edu360.javase24.day11.reflect.Person eat java.lang.String 屎
	public static void main(String[] args) throws Exception {
		String classname = args[0]; // "cn.edu360.javase24.day11.reflect.Person"
		String methodName = args[1]; // "eat"
		String pName = args[2]; // 参数类型
		String pValue = args[3]; // 参数值

		Class<?> forName2 = Class.forName(pName); // 先反射出参数类型

		Class<?> forName = Class.forName(classname); // 再反射出对象类型

		Person p = (Person) forName.newInstance(); // 构造Person 类p

		// 从forName这个class模板中获取到指定的方法
		Method method2 = forName.getMethod(methodName, forName2);

		// 将method在对象上执行
		Object invoke2 = method2.invoke(p, pValue);

		Person p2 = new Person();
		p2.name = "凤姐";
		// Method 映射的是方法模板，所以只要是这个类的对象，就可以调用
		method2.invoke(p2, "饺子");
	}

}
