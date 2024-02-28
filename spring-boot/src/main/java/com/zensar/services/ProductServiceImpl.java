package com.zensar.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dto.ProductDTO;
import com.zensar.entity.Product;
import com.zensar.exceptions.ProductNotFoundException;
import com.zensar.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<Product> getProducts() {
		return productRepository.findAll();// at run time
	}

	@Override
	public ProductDTO getProduct(int id) {
		
		Product product = productRepository.findById(id).orElseThrow( ()-> new ProductNotFoundException());
		//Product product = productRepository.findById(id).get();
		// return mapToDTO(product);
		return modelMapper.map(product, ProductDTO.class);
	}

	@Override
	public ProductDTO insertProduct(ProductDTO productDto) {

		// Product product = mapToEnity(productDto);

		Product product = modelMapper.map(productDto, Product.class);

		Product insertedEntity = productRepository.save(product);

		return modelMapper.map(insertedEntity, ProductDTO.class);
	}

	@Override
	public void deleteProduct(int productId) {
		productRepository.deleteById(productId);
	}

	@Override
	public Product updateProduct(int productId, Product product) {
		return productRepository.save(product);
	}

	
	  public List<ProductDTO> getProductByItsName(String productName) { // return
		  
	
	  
	  List<Product> listOfProductEntities = productRepository.test1(productName);
	  
	  List<ProductDTO> productDTOList = new ArrayList<>();
	  
	  for (Product productEntity : listOfProductEntities) {
	  productDTOList.add(modelMapper.map(productEntity, ProductDTO.class)); }
	  
	  return productDTOList;
	  
	  }
	 

	public List<ProductDTO> getProductByItsNameAndCost(String productName, double productCost) { // return
																									// productRepository.findByProductName(productName);

		List<Product> listOfProductEntities = productRepository.test2(productName, productCost);

		List<ProductDTO> productDTOList = new ArrayList<>();

		for (Product productEntity : listOfProductEntities) {
			productDTOList.add(modelMapper.map(productEntity, ProductDTO.class));
		}

		return productDTOList;

	}

	/*
	 * private ProductDTO mapToDTO(Product productEntity) {
	 * 
	 * ProductDTO productDto = new ProductDTO();
	 * productDto.setProductId(productEntity.getProductId());
	 * productDto.setProductName(productEntity.getProductName());
	 * productDto.setProductCost(productEntity.getProductCost());
	 * 
	 * return productDto;
	 * 
	 * }
	 * 
	 * private Product mapToEnity(ProductDTO productDto) {
	 * 
	 * Product product = new Product();
	 * 
	 * product.setProductId(productDto.getProductId());
	 * product.setProductName(productDto.getProductName());
	 * product.setProductCost(productDto.getProductCost());
	 * 
	 * return product;
	 * 
	 * }
	 */

}
