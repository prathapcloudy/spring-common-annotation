package com.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher  implements Teacher{

	@Override
	public void teach () {
		System.out.println("im your math teacher, math teacher objects are created");
	}
	
}
