package com.nicd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:bean.xml");
		Hello h1 = (Hello) applicationContext.getBean("hello");
		h1.saiHello();
	}
}
