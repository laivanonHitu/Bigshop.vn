package com.DienThoaiGiaRe.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.DienThoaiGiaRe.entity.Post;
import com.DienThoaiGiaRe.entity.Product;

@Repository
public class PostServiceImpl implements PostService {
	@SuppressWarnings("unused")
	@Autowired
	private SessionFactory sessionFactory;
	Logger logger = LoggerFactory.getLogger(PostServiceImpl.class);

	private PostService postService;

	public void setSessionFactory(SessionFactory factory) {
		this.sessionFactory = factory;
	}

	public Post getProductById(int id) {
		return this.postService.getPostById(id);
	}

	@Override
	public Post save(Post post) {
		return this.postService.save(post);
	}

	@Override
	public List<Post> getAllPost() {
		return this.postService.getAllPost();
	}

	@Override
	public Product updatePost(Post post) {
		return this.postService.updatePost(post);
	}

	@Override
	public void deletePost(int id) {
		this.postService.deletePost(id);
	}

	@Override
	public Post getPostById(int id) {
		return this.postService.getPostById(id);
	}

}
