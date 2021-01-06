package com.bigshop.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bigshop.dao.menuDAO;
import com.bigshop.entity.Menu;

@Service
@Transactional
public class menuServiceImpl implements menuService{
	@Autowired
	private menuDAO menuDao;

	@Override
	public List<Menu> getAllMenu() {
		return this.menuDao.getAllMenu();
	}
}
