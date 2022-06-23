package com.jbk.ProductManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.ProductManagement.Entity.Product;
import com.jbk.ProductManagement.dao.ProductDao;

@Service
public class ProductService_impl implements ProductService
{
	
	@Autowired
	private ProductDao dao;

	@Override
	public Boolean saveProduct(Product product) {
		Boolean b = dao.saveProduct(product);
		return b;
	}

	@Override
	public Product getProductById(int productId) {
		Product product=dao.getProductById(productId);
		return product;
	}

	@Override
	public List<Product> getAllProduct() 
	{
		List<Product> products=dao.getAllProduct();
		return products;
	}

	@Override
	public Boolean deleteProductByProductId(String productId) {
		
		return null;
	}

	@Override
	public Boolean updateProduct(Product product) {
		
		return null;
	}

}
