package cn.edu360.javase24.day10.exception.demo;

public class IndexOutOfBoundDemo {

	public static void main(String[] args) {
		int[] array = new int[]{2,3,4,5,6};
		ListTool listTool = new ListTool();
		
		try{
			listTool.getInt(array,8);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(IndexOutOfBoundsException e){
			e.printStackTrace();
		}
	}

}
