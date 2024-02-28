package com.zensar.spring_core.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration

@ComponentScan(value = "com.zensar" )
@PropertySource(value = { "app.properties" })

public class JavaConfiguration {
	
	
	// Bean
	/*
	 * @Bean(value = "product") public Product getProduct() { Product product =new
	 * Product(1, "Laptop", 20000); return product; }
	 */

}
