package com.bigshop.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.bigshop.entity.Post;

@Repository
public class postDAOImpl implements postDAO {

	private static SessionFactory sessionFactory = null;

	@Autowired
	@Qualifier(value = "sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		postDAOImpl.sessionFactory = sessionFactory;
	}

	Logger logger = LoggerFactory.getLogger(postDAOImpl.class);

	@Override
	public void save(Post post) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(post);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Post> getAllPost() {
		try {
			return sessionFactory.getCurrentSession().createCriteria(Post.class).list();
		} catch (Exception e) {
			System.out.println(" co loi ay du lieu " + e);
			return new ArrayList<>();
		}
	}

	@Override
	public Post getPostById(int id) {
		return ((Post) sessionFactory.getCurrentSession().get(Post.class, id));
	}

	public void updatePost(Post post) {
		Session session = sessionFactory.getCurrentSession();
		session.update(post);
		logger.debug("loi cap nhat :" + session);
	}

	@Override
	public void deletePost(int id) {
		Session session = sessionFactory.getCurrentSession();
		String sql = "DELETE FROM Post WHERE id = :id";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(Post.class);
		query.setParameter("id", id);
		query.executeUpdate();
	}
}
