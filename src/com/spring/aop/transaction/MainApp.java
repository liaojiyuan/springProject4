package com.spring.aop.transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String [] args) throws Throwable{
		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		ServiceC c = context.getBean("serviceC",ServiceC.class);
		c.withdraw();
	}

}
