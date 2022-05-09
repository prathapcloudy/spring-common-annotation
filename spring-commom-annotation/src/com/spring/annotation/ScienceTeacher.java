package com.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("science teacher objects are created");
	}
	
}
