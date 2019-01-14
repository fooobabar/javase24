package cn.edu360.javase24.day05.hashmapdemo;

public class HashSetDemo {
	public static void main(String[] args) {
		String s1="WhenalltablesareprocessedMySQLoutputstheselectedcolumnsandbacktracksthroughthetablelistuntilatableisfoundforwhichth";
		char[] c1 = s1.toCharArray();
		for (char c : c1) {
			System.out.print(c+",");
		}
	}
}
