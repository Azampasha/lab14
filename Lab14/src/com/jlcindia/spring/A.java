package com.jlcindia.spring;

public class A {

	private int a;
	private String msg;
	public A(){
		System.out.println("A.D>C");
	}
	
	public void setA(int a) {
		System.out.println("A-set()");
		this.a = a;
	}
	
	public void setMsg(String msg) {
		System.out.println("A-setMsg");
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "" + a + "\t" + msg;
	}
	
	
	
}
