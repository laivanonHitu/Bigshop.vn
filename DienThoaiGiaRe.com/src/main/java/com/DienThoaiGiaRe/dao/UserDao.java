package com.DienThoaiGiaRe.dao;

import com.DienThoaiGiaRe.entity.User;

public interface UserDao {
	public boolean createUser(User user);
	public boolean findUser(String uname, String upwd);
}
