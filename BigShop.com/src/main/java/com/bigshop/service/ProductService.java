package com.bigshop.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.bigshop.entity.Post;
import com.bigshop.entity.Product;

public interface ProductService {
	public void save(Product product);

	public List<Product> getAllProduct();

	public void updatePost(Product product);

	public void deleteProduct(int id);

	public Product getProductById(int id);

	public void saveProductToDB(MultipartFile file, String name, Double price, Double price_dis);
	
	public void saveProductToDB(MultipartFile file);
}
