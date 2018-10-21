package com.zekoliu.core.dao;

import org.apache.ibatis.annotations.Param;

import com.zekoliu.core.po.User;

public interface UserDao {
	public User findUser(@Param("usercode") String usercode, @Param("password") String password);
}
