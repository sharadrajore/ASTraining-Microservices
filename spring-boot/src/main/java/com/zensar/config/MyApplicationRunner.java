package com.zensar.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.zensar.dto.ProductDTO;
import com.zensar.services.ProductService;
//@Component
@Order(-1)
public class MyApplicationRunner implements ApplicationRunner {
	
	@Autowired
	private ProductService productService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		// TODO Auto-generated method stub
		
		ProductDTO product1 = new ProductDTO();

		product1.setProductId(5);
		product1.setProductName("test");
		product1.setProductCost(1000);

		ProductDTO product2 = new ProductDTO();

		product2.setProductId(6);
		product2.setProductName("test2");
		product2.setProductCost(2000);
		
		productService.insertProduct(product1);
		
		productService.insertProduct(product2);
		
		System.out.println("Product's inserted(ApplicationRunner !!!!");
		
	}


}
