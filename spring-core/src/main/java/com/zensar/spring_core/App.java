package com.zensar.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.zensar.spring_core.beans.Product;

public class App {
	public static void main(String[] args) {
		
		// ApplicationContext ,BeanFactory (Spring)

	//	Product product = new Product(1, "Laptop", 60000);

		//System.out.println(product);
		
		//ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		
		
		ApplicationContext context=new FileSystemXmlApplicationContext("./src/main/resources/context.xml");
		
		
		
		Product product= (Product)context.getBean("product");
		
		System.out.println(product);
		
		
	}
}
