package com.DienThoaiGiaRe.service;


import java.util.List;

import com.DienThoaiGiaRe.entity.Product;

public interface ProductService{
	public Product save(Product product);
	public List<Product> getAllProduct();
	public Product updateProduct(Product product);
	public void deleteProduct(int id);
	public Product getProductById(int id);
}
