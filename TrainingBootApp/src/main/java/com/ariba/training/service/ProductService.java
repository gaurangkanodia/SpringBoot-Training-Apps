package com.ariba.training.service;

import java.util.List;

import com.ariba.training.domain.Product;

public interface ProductService {

	int createNewProduct(Product p);

	Product findById(int id);

	List<Product> findAll();

}