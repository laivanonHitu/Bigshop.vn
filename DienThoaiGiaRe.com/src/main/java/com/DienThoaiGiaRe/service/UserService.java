package com.DienThoaiGiaRe.service;

import com.DienThoaiGiaRe.entity.User;

public interface UserService {
	public boolean createUser(User user);
	public boolean findUser(String uname, String upwd);
}
