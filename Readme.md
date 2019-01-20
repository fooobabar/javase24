
# day10

## 1 数据流的使用

数据流：DataInputStream 和 DataOutputStream 

__DataInputStream__ 可以帮用户把各种Java类型数据转成2进制写入文件流 
* writeInt(int i) 
* writeLong(long l) 
* writeFloat(float f) 
* writeUTF(String s)

__DataOutputStream__ 可以帮用户从文件流中直接读取出用户需要的数据
* readInt() 
* readLong() 
* readFloat() 
* readUTF()

## 2 对象流的使用

对象流： ObjectOutputStream 和 ObjectInputStream




## 3 序列化和反序列化

* 序列化：将一个对象变成二进制数据序列 
* 反序列化：二进制数据序列转换成对象


## 4 java中的异常Exception处理
Exception是Java对程序运行过程中可能出现的不可预料的不正常状态的一种描述
常见异常：
* 数据角标越界
* list角标越界
* nullpoint异常
* NumberFormat异常
* ArithmeticException 除数为0异常

捕获异常
```Java 
try{
    可能出现异常的Java代码块
}catch(xxxException e){
    出现异常之后执行什么代码块
}catch(Exception e){
    出现异常之后执行什么代码块
}
```

抛出异常
throws Exception

## 5 继承
子类继承父类，就拥有父类的方法，也可以重写父类方法。
父类的抽象类，子类必须实现。


## 6 抽象类
抽象类一般用来作为一个父类，但是里面可以有方法是抽象的，以让子类来实现

## 7 反射

```Java
String classname = "com.doit.pojo.Person";
Class<?> forName = Class.forName(classname);
Person o = (Person)forName.newInstance();
```