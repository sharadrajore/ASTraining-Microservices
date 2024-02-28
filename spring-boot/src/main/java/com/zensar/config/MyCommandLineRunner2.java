package com.zensar.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.zensar.dto.ProductDTO;
import com.zensar.services.ProductService;
//@Component
//@Order(2)
public class MyCommandLineRunner2 implements CommandLineRunner{
	
	@Autowired
	private ProductService productService;
	
	@Override
	public void run(String... args) throws Exception {

		ProductDTO product1 = new ProductDTO();

		product1.setProductId(3);
		product1.setProductName("test");
		product1.setProductCost(1000);

		ProductDTO product2 = new ProductDTO();

		product2.setProductId(4);
		product2.setProductName("test2");
		product2.setProductCost(2000);
		
		productService.insertProduct(product1);
		
		productService.insertProduct(product2);
		
		System.out.println("Product's inserted(CommandLineRunner2) !!!!");

	}

}
