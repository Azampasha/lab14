package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JLCConfig {
	
@Bean
public A createA(){
	A aob=new A();
	aob.setA(10);
	aob.setMsg("AAA");
	return aob;
}


@Bean
public B createB(){
	B bob=new B(20,"BBB");
	return bob;
}
@Bean(autowire=Autowire.BY_NAME)
public Hello hello(){
  return new Hello();
}

}
