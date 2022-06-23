package com.jbk.ProductManagement.Service;

import java.util.List;

import com.jbk.ProductManagement.Entity.Product;

public interface ProductService 
{

	public Boolean saveProduct(Product product);
	public Product getProductById(int productId);
	public List<Product> getAllProduct();
	public Boolean deleteProductByProductId(String productId);
	public Boolean updateProduct(Product product);
}
