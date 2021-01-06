package com.DienThoaiGiaRe.service;


import java.util.List;

import com.DienThoaiGiaRe.entity.Post;
import com.DienThoaiGiaRe.entity.Product;

public interface PostService{
	public Post save(Post post);
	public List<Post> getAllPost();
	public Product updatePost(Post post);
	public void deletePost(int id);
	public Post getPostById(int id);
}
