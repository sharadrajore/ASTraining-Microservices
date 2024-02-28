package com.zensar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.dto.ProductDTO;
import com.zensar.entity.Product;
import com.zensar.services.ProductService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController("myProdController")
@RequestMapping(value = "/products")
@Tag(name = "Product Controller")
public class ProductController {

	@Autowired
	private ProductService productService;

	// http://localhost:8080/ :-

	// http://localhost:8080/products get
	// @RequestMapping(value="/", method=RequestMethod.GET)
	@GetMapping
	public List<Product> getProducts() {
		return productService.getProducts(); // json
	}

	// http://localhost:8080/products/2 http text based protocol

	@GetMapping("/{productId}")
	@Operation(description = "This endpoint accepts product id and returns you Product ")
	public @ApiResponse(description = "You will be getting Product in response")     ProductDTO getProduct(@Parameter(description = "kindly pass product id")@PathVariable("productId") int id) {
			//throw new ProductNotFoundException("Sorry,product not found");
		return productService.getProduct(id);
	}
	
	/*@ExceptionHandler(value = Exception.class)
	public ResponseEntity<String> productNotFound(){
		return new ResponseEntity<String>("Product Not Found",HttpStatus.NOT_FOUND);
	}*/
	
	// http://localhost:8080/products/2    String
	// http://localhost:8080/products/name/HDD  String
	
	
	  @GetMapping("/name/{productName}") public List<ProductDTO>
	  getProductByItsName(@PathVariable("productName") String productName) {
	  
	  return productService.getProductByItsName(productName); }
	 
	
	//http://localhost:8080/products/name/MAC/cost/95000
	
	
	  @GetMapping("/name/{productName}/cost/{productCost}") 
	  public List<ProductDTO> getProductByItsNameAndCost(@PathVariable("productName") String
	  productName,@PathVariable("productCost") double productCost) {
	  
			return productService.getProductByItsNameAndCost(productName, productCost);
	}
	 
	
	
  // http://localhost:8080/products  --- > POST
	@PostMapping
	public ResponseEntity<ProductDTO> insertProduct(@RequestBody ProductDTO productDto) {
		return new ResponseEntity(productService.insertProduct(productDto), HttpStatus.CREATED);
		
		//return productService.insertProduct(product)
	}

	@DeleteMapping("/{productId}")
	public void deleteProduct(@PathVariable("productId") int productId) {
		productService.deleteProduct(productId);
	}

	@PutMapping("/{productId}")
	public Product updateProduct(@PathVariable("productId") int productId, @RequestBody Product product) {
		return productService.updateProduct(productId, product);

	}

}
