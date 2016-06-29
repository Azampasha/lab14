package com.jlcindia.spring;

public class B {
	
//sssss	
	private int b;
	private String str;
	public B(int b, String str) {
		System.out.println("B 2arg C");
		this.b = b;
		this.str = str;
	}
	@Override
	public String toString() {
		return "" + b + "\t" + str;
	}
	
}
