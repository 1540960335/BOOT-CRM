package com.zekoliu.core.service;

import com.zekoliu.core.po.User;

public interface UserService {
	
	public User findUser(String userCode, String password);
}
