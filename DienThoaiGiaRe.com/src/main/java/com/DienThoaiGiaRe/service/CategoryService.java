package com.DienThoaiGiaRe.service;

import java.util.List;

import com.DienThoaiGiaRe.entity.Category;

public interface CategoryService {
	public List<Category> getAllCategory();
	public List<Object>  getCategoryById(int id);
}
