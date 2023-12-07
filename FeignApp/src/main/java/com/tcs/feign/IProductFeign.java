package com.tcs.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "APISERVICE")
public interface IProductFeign {

	@GetMapping("/product/api/{id}")
	public ResponseEntity<?> getProduct(@PathVariable Integer id);

	@GetMapping("/product/api/GetAllProducts")
	public ResponseEntity<?> getAllProducts();
	

}
