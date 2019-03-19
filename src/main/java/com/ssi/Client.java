package com.ssi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
public static void main(String args[]) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
	Customer c1=context.getBean("customer1",Customer.class);
	Customer c2=context.getBean("customer2",Customer.class);
	System.out.println(c1);
	System.out.println(c2);
}
}
