package com.bigshop.service;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.bigshop.dao.ProductDAO;
import com.bigshop.entity.Post;
import com.bigshop.entity.Product;
import org.springframework.util.StringUtils;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAO productDAO;

	@Override
	public void save(Product product) {
		this.productDAO.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		return this.productDAO.getAllProduct();
	}

	@Override
	public void updatePost(Product product) {

	}

	@Override
	public void deleteProduct(int id) {
		this.productDAO.deleteProduct(id);
	}

	@Override
	public Product getProductById(int id) {
		return this.productDAO.getProductById(id);
	}

	@Override
	public void saveProductToDB(MultipartFile file, String name, Double price, Double price_dis) {
		Product p = new Product();
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		if (fileName.contains("..")) {
			System.out.println("not a a valid file");
		}
		try {
			p.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e) {
			e.printStackTrace();
		}

		p.setName(name);
		p.setPrice(price);
		p.setPrice_dis(price_dis);
		productDAO.save(p);
	}

	@Override
	public void saveProductToDB(MultipartFile file) {
		Product p = new Product();
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		if (fileName.contains("..")) {
			System.out.println("not a a valid file");
		}
		try {
			p.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		productDAO.save(p);
	}

}
