package com.spring.annotation;
import org.springframework.stereotype.Component;


public class College {
	
	private Principal principal;

	private Teacher teacher;
	
	
	public College(Principal principal, Teacher teacher) {
		this.principal = principal;
		this.teacher = teacher;
	}
	
	
	
	
	public void test() {
		principal.pricipalMethod();
		teacher.teach();
	}

}
