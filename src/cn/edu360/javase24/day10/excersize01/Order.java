package cn.edu360.javase24.day10.excersize01;

import java.io.Serializable;

/**
 * 用来描述一个具体事务的类：
 * 实体类
 * 或者 javabean
 * @author haniiii
 *
 */
public class Order implements Serializable{
	private String oid;
	private String pid;
	private int pNum;
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public int getpNum() {
		return pNum;
	}
	public void setpNum(int pNum) {
		this.pNum = pNum;
	}
	public void set(String oid, String pid, int pNum) {
		this.oid = oid;
		this.pid = pid;
		this.pNum = pNum;
	}
	public Order(String oid, String pid, int pNum) {
		super();
		this.oid = oid;
		this.pid = pid;
		this.pNum = pNum;
	}
	@Override
	public String toString() {
		return "[oid=" + oid + ", pid=" + pid + ", pNum=" + pNum + "]";
	}
	public Order() {
	}
	
	
}
