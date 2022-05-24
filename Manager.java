package com.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Manager implements ITdepartment {
	
private String qualification;
	public void project() {
		System.out.println("Manager working with financial department!!!!!!!");
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	@Override
	public String toString() {
		return "Manager [qualification=" + qualification + "]";
	}
}
