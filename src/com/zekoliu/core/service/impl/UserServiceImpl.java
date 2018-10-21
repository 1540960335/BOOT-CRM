package com.zekoliu.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zekoliu.core.dao.UserDao;
import com.zekoliu.core.po.User;
import com.zekoliu.core.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	public User findUser(String usercode, String password) {
		User user = this.userDao.findUser(usercode, password);
		return user;
	}

}
