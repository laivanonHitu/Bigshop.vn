package com.bigshop.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bigshop.entity.Post;

@Service
@Transactional
public class postServiceImpl implements postService {
	@Autowired
	private com.bigshop.dao.postDAO postDAO;

	@Override
	public void save(Post post) {
		this.postDAO.save(post);
	}

	@Override
	public List<Post> getAllPost() {
		return this.postDAO.getAllPost();
	}

	@Override
	public void updatePost(Post post) {
		 this.postDAO.updatePost(post);
	}

	@Override
	public Post getPostById(int id) {
		return this.postDAO.getPostById(id);
	}

	@Override
	public void deletePost(int id) {
		this.postDAO.deletePost(id);
	}

}
