package com.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollegeHead {

	public static void main(String[] args) {

		
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		
		College college = context.getBean("collegeBean", College.class);
		college.test();
		
		
		
		
	}
}
