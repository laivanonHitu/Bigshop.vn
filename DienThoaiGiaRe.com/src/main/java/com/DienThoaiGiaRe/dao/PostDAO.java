package com.DienThoaiGiaRe.dao;


import java.util.List;

import com.DienThoaiGiaRe.entity.Post;

public interface PostDAO{
	public Post save(Post post);
	public List<Post> getAllPost();
	public void updatePost(Post post);
	public void deletePost(int id);
	public Post getPostById(int id);
}
