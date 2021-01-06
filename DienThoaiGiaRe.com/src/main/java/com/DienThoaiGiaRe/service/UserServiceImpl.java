package com.DienThoaiGiaRe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DienThoaiGiaRe.dao.UserDao;
import com.DienThoaiGiaRe.entity.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	@Override
	public boolean createUser(User user) {
		return this.userDao.createUser(user);
	}

	@Override
	public boolean findUser(String uname, String upwd) {
		return this.findUser(uname, upwd);
	}
}
