package com.tcs.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.domain.Product;
import com.tcs.dto.ProductDto;
import com.tcs.exception.IdNotFoundException;
import com.tcs.repo.ProductRepo;
import com.tcs.service.ProductService;
import com.tcs.utils.Mapper;
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepo productRepo;
	@Autowired
	private Mapper mapper;

	@Override
	public ProductDto addProduct(ProductDto productDto) {
		Product entityToDto = mapper.entityToDto(productDto);
		Product entity = productRepo.save(entityToDto);
		ProductDto producDto = mapper.DtotoEntity(entity);
		return producDto;
	}

	@Override
	public ProductDto getProductDtls(Integer id) {
		Product product = productRepo.findById(id).orElseThrow(()->
		new IdNotFoundException("Idnot Found Exception::"+id));
		ProductDto productDto = mapper.DtotoEntity(product);
		return productDto;
	}

	@Override
	public List<ProductDto> getAllProducts() {
		return  productRepo.findAll().stream().map(entity->mapper.DtotoEntity(entity))
		.collect(Collectors.toList());
			 
	}

}
