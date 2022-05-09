package com.spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


//@ComponentScan(basePackages = "com.spring.annotation")
//@PropertySource("classpath:values-info.properties")
public class CollegeConfig {
	
	@Bean
	public Principal principalBean() {
		
		return new Principal();
	}
	
	@Bean
	public College collegeBean() {
		College college = new College(principalBean(),scienceTeacher());

		return college;
	} 

	@Bean
	public Teacher mathTeacher() {
		
		return new MathTeacher();
	}
	
	@Bean
	public Teacher scienceTeacher() {
		
		return new ScienceTeacher();
	}

}
