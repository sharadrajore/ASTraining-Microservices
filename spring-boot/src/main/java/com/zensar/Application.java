package com.zensar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import com.zensar.controllers.ProductController;
import com.zensar.dto.ProductDTO;
import com.zensar.services.ProductService;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(title = "Product Managment Application",version = "1.0.0",description = "Generating documentation for product management app"))
public class Application extends SpringBootServletInitializer  {
	
	

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);  
		/*
		 * ConfigurableApplicationContext context =
		 * SpringApplication.run(Application.class, args);
		 * 
		 * ProductController productController =
		 * context.getBean("myProdController",ProductController.class);
		 * 
		 * ProductDTO product1 = new ProductDTO();
		 * 
		 * product1.setProductId(3); product1.setProductName("test");
		 * product1.setProductCost(1000);
		 * 
		 * ProductDTO product2 = new ProductDTO();
		 * 
		 * product2.setProductId(4); product2.setProductName("test2");
		 * product2.setProductCost(2000);
		 * 
		 * productController.insertProduct(product1);
		 * 
		 * productController.insertProduct(product2);
		 */

	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return super.configure(builder);
	}

	
	

}
