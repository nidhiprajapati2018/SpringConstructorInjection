package com.jnit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		  ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
		  Student x = (Student)appContext.getBean("rahul");
		  x.display();
	}

}
