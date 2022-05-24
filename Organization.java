package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Organization {
	public static void main(String[] args) {

	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AllBeanConfiguration.class);
	
	Manager manager = ctx.getBean(Manager.class);
	
	manager.project();
	manager.setQualification("MCA");
	System.out.println(manager);
	
	Manager manager1 = ctx.getBean(Manager.class);
	System.out.println(manager1);
	
	}
}
