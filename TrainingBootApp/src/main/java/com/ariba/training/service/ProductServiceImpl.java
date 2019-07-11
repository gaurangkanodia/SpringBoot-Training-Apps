package com.ariba.training.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ariba.training.dal.ProductDAO;
import com.ariba.training.dal.ProductDAOInMemoryImpl;
import com.ariba.training.domain.Product;

@Component
public class ProductServiceImpl implements ProductService {

	public ProductServiceImpl() {
		
	}
	
	private ProductDAO productDao;
	
	@Override
	public int createNewProduct(Product p)
	{
		if(p.getPrice()*p.getQoh() < 10000)
		{
			throw new IllegalArgumentException("Value too low");
		}
		else
		{
			Product created = productDao.save(p);
			return created.getId();
		}
	}

	@Override
	public Product findById(int id) {
		return productDao.findById(id);
	}

	@Override
	public List<Product> findAll() {
		return productDao.findAll();
	}

	public void setProductDao(ProductDAO productDao) {
		this.productDao = productDao;
	}

	
	
	

}
