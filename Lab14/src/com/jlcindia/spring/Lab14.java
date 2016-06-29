package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab14 {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(JLCConfig.class);
		System.out.println("****** contianer is ready*****");
		Hello h=(Hello)ctx.getBean("hello");
		h.show();
	}
}
