package com.DienThoaiGiaRe.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DienThoaiGiaRe.dao.ProductDAO;
import com.DienThoaiGiaRe.entity.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAO productDao;
	Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

	public Product save(Product product) {
		return this.productDao.save(product);
	}

	public List<Product> getAllProduct() {

		return this.productDao.getAllProduct();
	}

	public Product updateProduct(Product product) {
		return this.productDao.updateProduct(product);
	}

	public void deleteProduct(int id) {
		this.productDao.deleteProduct(id);
	}

	public Product getProductById(int id) {
		return this.productDao.getProductById(id);
	}
}
