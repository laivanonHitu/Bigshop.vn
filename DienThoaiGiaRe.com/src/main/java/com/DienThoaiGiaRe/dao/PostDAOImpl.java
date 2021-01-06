package com.DienThoaiGiaRe.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.DienThoaiGiaRe.entity.Post;
import com.DienThoaiGiaRe.entity.Product;

@Repository
public class PostDAOImpl implements PostDAO {
	@Autowired
	private SessionFactory sessionFactory;
	Logger logger = LoggerFactory.getLogger(PostDAOImpl.class);

	public void setSessionFactory(SessionFactory factory) {
		this.sessionFactory = factory;
	}

	public Product getProductById(int id) {
		return ((Product) sessionFactory.getCurrentSession().get(Product.class, id));
	}

	@Override
	public Post save(Post post) {
		try {
			Session session = sessionFactory.getCurrentSession();
			session.save(post);
			logger.debug("save product info" + session);
		} catch (Exception e) {
			System.out.println("error save product " + e.getMessage());
		}
		return post;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Post> getAllPost() {
		try {
			Session session = sessionFactory.getCurrentSession();
			List<Post> listPost = session.createSQLQuery("SELECT * FROM post").list();
			return listPost;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void updatePost(Post post) {
	}

	@Override
	public void deletePost(int id) {
		Session session = sessionFactory.getCurrentSession();
		String sql = "DELETE FROM Product WHERE id = :id";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(Post.class);
		query.setParameter("id", id);
		query.executeUpdate();

	}

	@Override
	public Post getPostById(int id) {
		return ((Post) sessionFactory.getCurrentSession().get(Post.class, id));
	}

}
