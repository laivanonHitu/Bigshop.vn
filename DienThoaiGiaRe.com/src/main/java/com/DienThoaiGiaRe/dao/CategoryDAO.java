package com.DienThoaiGiaRe.dao;

import java.util.List;

import com.DienThoaiGiaRe.entity.Category;

public interface CategoryDAO {
	public List<Category> getAllCategory();
	public List  getCategoryById(int id);
}
