package com.tcs.utils;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.tcs.domain.Product;
import com.tcs.dto.ProductDto;

@Component
public class Mapper {

	public ProductDto DtotoEntity(Product entity) {
		ProductDto productDto = new ProductDto();
		BeanUtils.copyProperties(entity, productDto);
		return productDto;
	}

	public Product entityToDto(ProductDto productDto) {
		Product entity = new Product();
		BeanUtils.copyProperties(productDto, entity);
		return entity;
	}

}
