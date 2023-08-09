package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext cxt = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student student = cxt.getBean("getStudent",Student.class);
		student.say();
	}

}
