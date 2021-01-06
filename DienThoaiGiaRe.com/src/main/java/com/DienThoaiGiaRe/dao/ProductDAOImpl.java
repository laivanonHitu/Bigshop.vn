package com.DienThoaiGiaRe.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.DienThoaiGiaRe.entity.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	private SessionFactory sessionFactory;
	Logger logger = LoggerFactory.getLogger(ProductDAOImpl.class);

	public void setSessionFactory(SessionFactory factory) {
		this.sessionFactory = factory;
	}

	public Product save(Product product) {
		try {
			Session session = sessionFactory.getCurrentSession();
			session.save(product);
			logger.debug("save product info" + session);
		} catch (Exception e) {
			System.out.println("error save product " + e.getMessage());
		}
		return product;
	}

	@SuppressWarnings("unchecked")
	public List<Product> getAllProduct() {
		try {
			return sessionFactory.getCurrentSession().createCriteria(Product.class).list();
		} catch (Exception e) {
			System.out.println(" co loi ay du lieu " + e);
			return new ArrayList<>();
		}

	}

	public Product updateProduct(Product product) {
		try {
			Session session = sessionFactory.getCurrentSession();
//			Product product = new Product();
//
//			String sql = "UPDATE Product SET image=:image,name=:name, price = :price, price_dis=:priceDis,"
//					+ " weight =:weight, decription =:decription, short_decription=:shortDecription"
//					+ "modifieddate=:modifieddate,brand=:brand,product_code=:productCode" + "WHERE id =:id";
//			SQLQuery query = session.createSQLQuery(sql);
//			query.addEntity(Product.class);
//			query.setParameter("image", product.getImage());
//			query.setParameter("name", product.getName());
//			query.setParameter("price", product.getPrice());
//			query.setParameter("price_dis", product.getPriceDis());
//			query.setParameter("weight", product.getWeight());
//			query.setParameter("decription", product.getDecription());
//			query.setParameter("short_decription", product.getShortDecription());
//			query.setParameter("modifieddate", product.getModifieddate());
//			query.setParameter("brand", product.getBrand());
//			query.setParameter("product_code", product.getProductCode());
//			query.setParameter("id", id);
//			query.executeUpdate();
			session.update(product);
		} catch (Exception e) {
			System.out.println("error save product " + e.getMessage());
		}
		return product;
	}

	public void deleteProduct(int id) {
		Session session = sessionFactory.getCurrentSession();
		String sql = "DELETE FROM Product WHERE id = :id";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(Product.class);
		query.setParameter("id", id);
		query.executeUpdate();
	}

	public Product getProductById(int id) {
		return ((Product) sessionFactory.getCurrentSession().get(Product.class, id));
	}
}
