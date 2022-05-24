package com.demo;

import org.springframework.stereotype.Component;

@Component
public class Employee implements ITdepartment{
	public void project() {
		System.out.println("Employee working with financial department!!!!!!!");
	}
}
