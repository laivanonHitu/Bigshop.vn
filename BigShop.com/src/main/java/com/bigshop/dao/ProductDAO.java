package com.bigshop.dao;

import java.util.List;

import com.bigshop.entity.Post;
import com.bigshop.entity.Product;

public interface ProductDAO {
	public void save(Product product);
	public List<Product> getAllProduct();
	public void updateProduct(Product product);
	public void deleteProduct(int id);
	public Product getProductById(int id);
}
