package com.DienThoaiGiaRe.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.DienThoaiGiaRe.entity.Category;
import com.DienThoaiGiaRe.entity.Product;

@Repository
public class CategoryDAOImpl implements CategoryDAO {
	@Autowired
	private SessionFactory sessionFactory;
	Logger logger = LoggerFactory.getLogger(CategoryDAOImpl.class);

	public void setSessionFactory(SessionFactory factory) {
		this.sessionFactory = factory;
	}

	public String SQL(int id) {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT ");
		sql.append("    * ");
		sql.append("FROM ");
		sql.append("   product ");
		sql.append("INNER JOIN ");
		sql.append("   category ON product.id_category = category." + id);
		return sql.toString();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Category> getAllCategory() {
		Session session = sessionFactory.getCurrentSession();
		try {
			List<Category> list = session.createQuery("from Category").list();
			return list;
		} catch (Exception e) {
			System.out.println(" co loi ay du lieu " + e);
			return null;
		}
	}

	@SuppressWarnings("unused")
	@Override
	public List getCategoryById(int id) {
		String sql = "select * from product as p where p.id_category in (select cat." + id + " from category as cat)";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery(sql);
		query.executeUpdate();
		try {
			List list = session.createQuery("from Category C, Product P where P.id_product = C." + id).list();
			return list;
		} catch (Exception e) {
			System.out.println(" co loi ay du lieu " + e);
			return null;
		}

	}

}
