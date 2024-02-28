package com.zensar.services;

import java.util.List;

import com.zensar.dto.ProductDTO;
import com.zensar.entity.Product;

public interface ProductService {
	
	public List<Product> getProducts();
	
	public ProductDTO getProduct( int id);
	
	public ProductDTO insertProduct(ProductDTO product);
	
	public void deleteProduct(int productId);
	
	public Product updateProduct( int productId,  Product product);
	
	public List<ProductDTO> getProductByItsName(String productName);
	
	public List<ProductDTO> getProductByItsNameAndCost(String productName,double productCost) ;

}
