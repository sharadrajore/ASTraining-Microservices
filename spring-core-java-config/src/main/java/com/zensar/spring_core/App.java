package com.zensar.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zensar.spring_core.beans.Customer;
import com.zensar.spring_core.configuration.JavaConfiguration;

public class App {
	public static void main(String[] args) {
		
		// ApplicationContext ,BeanFactory (Spring)

	//	Product product = new Product(1, "Laptop", 60000);

		//System.out.println(product);
		
		//ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfiguration.class);
		
	

	//	Product product =new Product(1, "Laptop", 20000);
		
		
		Customer customer= (Customer)context.getBean("customer");
		
		// <bean  id="">
		
		Customer customer2= (Customer)context.getBean("customer");
		
		System.out.println(customer);
		
		
	}
}
