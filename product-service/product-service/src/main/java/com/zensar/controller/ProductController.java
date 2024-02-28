package com.zensar.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entity.Product;
import com.zensar.services.ProductService;

@RestController
@RequestMapping("/product-api")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	

	@PostMapping("/product")
	public Product insertProduct(@RequestBody Product product) {
		
	 	 return productService.insertProduct(product);
	
	}

}


