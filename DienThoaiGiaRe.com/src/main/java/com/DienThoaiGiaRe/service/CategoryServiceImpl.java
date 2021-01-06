package com.DienThoaiGiaRe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DienThoaiGiaRe.dao.CategoryDAO;
import com.DienThoaiGiaRe.entity.Category;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryDAO categoryDAO;

	public List<Category> getAllCategory() {
		return this.categoryDAO.getAllCategory();

	}

	@Override
	public List<Object> getCategoryById(int id) {
		return this.categoryDAO.getCategoryById(id);
	}
}
