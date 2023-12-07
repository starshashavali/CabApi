package com.tcs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.domain.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
