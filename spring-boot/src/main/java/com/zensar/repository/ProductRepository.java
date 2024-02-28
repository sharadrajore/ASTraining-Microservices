package com.zensar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zensar.entity.Product;

// proxy 
public interface ProductRepository extends JpaRepository<Product, Integer> {

	// List<Product> findByProductName(String productName); // D ,Impl ? findBy

	// List<Product> getByProductName(String productName);// getBy

	//@Query(value = "FROM Product p where p.productName=?1")
	@Query(value = "select * from product where name like :name",nativeQuery = true)
	List<Product> test1(@Param(value = "name")String productName);// getBy Not Working

	//@Query("FROM Product p where p.productName=?1 and p.productCost=?2")
	@Query(value="select * from product where name like ?1 and cost=?2",nativeQuery = true)
	List<Product> test2(String productName, double productCost);

}
