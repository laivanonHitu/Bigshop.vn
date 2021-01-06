package com.bigshop.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.bigshop.entity.Menu;
import com.bigshop.entity.Post;

@Repository
public class menuDAOImpl implements menuDAO {

	private static SessionFactory sessionFactory =null;

	@Autowired
	@Qualifier(value = "sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		menuDAOImpl.sessionFactory = sessionFactory;
	}

	Logger logger = LoggerFactory.getLogger(menuDAOImpl.class);

	@SuppressWarnings("unchecked")
	public List<Menu> getAllMenu() {
		try {
			return sessionFactory.getCurrentSession().createCriteria(Menu.class).list();
		} catch (Exception e) {
			System.out.println(" error get data from database " + e);
			return new ArrayList<>();
		}
	}
}
