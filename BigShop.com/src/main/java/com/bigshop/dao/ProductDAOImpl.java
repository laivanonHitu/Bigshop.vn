package com.bigshop.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import com.bigshop.entity.Post;
import com.bigshop.entity.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	private static SessionFactory sessionFactory = null;
	@Autowired
	@Qualifier(value = "sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		ProductDAOImpl.sessionFactory = sessionFactory;
	}

	Logger logger = LoggerFactory.getLogger(ProductDAOImpl.class);

	@Override
	public void save(Product product) {
		try {
			Session session = sessionFactory.getCurrentSession();
			session.save(product);
			logger.debug("save product info" + session);
		} catch (Exception e) {
			System.out.println("error save product " + e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProduct() {
		try {
			return sessionFactory.getCurrentSession().createCriteria(Product.class).list();
		} catch (Exception e) {
			System.out.println(" co loi ay du lieu " + e);
			return new ArrayList<>();
		}
	}

	@Override
	public void updateProduct(Product product) {

	}

	@Override
	public void deleteProduct(int id) {
		Session session = sessionFactory.getCurrentSession();
		String sql = "DELETE FROM Product WHERE id = :id";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(Post.class);
		query.setParameter("id", id);
		query.executeUpdate();
	}

	@Override
	public Product getProductById(int id) {
		return ((Product) sessionFactory.getCurrentSession().get(Product.class, id));
	}
}
