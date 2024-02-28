package com.zensar.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
//JPQL
//@NamedNativeQuery(name = "Product.test", query = "select * from product where name like ?1", resultClass = Product.class)
//@NamedQuery(name = "Product.test2", query = "FROM Product p where p.productName=?1 and p.productCost=?2")//JPQL

/*
 * @NamedQueries(value = { @NamedQuery(name = "Product.test1", query =
 * "FROM Product p where p.productName=?1"),
 * 
 * @NamedQuery(name = "Product.test2", query =
 * "FROM Product p where p.productName=?1 and p.productCost=?2") })
 */


public class Product {   // lombok 
	@Id
	@Column(name = "id")
	
	private int productId;
	@Column(name = "name")
	private String productName;
	@Column(name = "cost")
	private double productCost;
	
	
	
	
}
