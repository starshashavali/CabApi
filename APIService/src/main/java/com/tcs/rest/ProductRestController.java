package com.tcs.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.dto.ProductDto;
import com.tcs.service.ProductService;

@RestController
@RequestMapping("/product/api")
public class ProductRestController {

	@Autowired
	private ProductService productService;

	@PostMapping("/save")
	public ResponseEntity<?> addProduct(@RequestBody ProductDto productDto) {
		ProductDto product = productService.addProduct(productDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(product);
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getProduct(@PathVariable Integer id) {
		ProductDto productDtls = productService.getProductDtls(id);
		return ResponseEntity.status(HttpStatus.CREATED).body(productDtls);
	}

	@GetMapping("/GetAllProducts")
	public ResponseEntity<?> getAllProducts() {
		List<ProductDto> allProducts = productService.getAllProducts();
		return ResponseEntity.status(HttpStatus.CREATED).body(allProducts);
	}

}
