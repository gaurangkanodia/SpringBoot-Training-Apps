package com.ariba.training.dal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.ariba.training.domain.Product;

@Component
public class ProductDAOInMemoryImpl implements ProductDAO
{

	Map<Integer,Product> db = new HashMap<>();
	static int idSequence = 0;
	
	public ProductDAOInMemoryImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Product save(Product p) {
		int id = ++idSequence;
		p.setId(id);
		db.put(id, p);
		return p;
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
