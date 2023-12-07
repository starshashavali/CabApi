package com.tcs.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.feign.IProductFeign;

@RestController
@RequestMapping("/product/api")
public class ProductRestController {

	@Autowired
	private IProductFeign productFeign;

	@GetMapping("/{id}")
	public ResponseEntity<?> getProduct(@PathVariable Integer id) {
	    return productFeign.getProduct(id);
	}


	@GetMapping("/GetAllProducts")
	public ResponseEntity<?> getAllProducts() {
		return productFeign.getAllProducts();
		 
	}
}