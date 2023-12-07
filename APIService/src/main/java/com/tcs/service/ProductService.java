package com.tcs.service;

import java.util.List;

import com.tcs.dto.ProductDto;

public interface ProductService {

	public ProductDto addProduct(ProductDto productDto);

	public ProductDto getProductDtls(Integer id);

	public List<ProductDto> getAllProducts();
}
