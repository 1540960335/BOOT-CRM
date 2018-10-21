package com.zekoliu.core.dao;

import java.util.List;

import com.zekoliu.core.po.Customer;

public interface CustomerDao {
	//客户列表
	public List<Customer> selectCustomerList(Customer customer);
	//客户数
	public Integer selectCustomerListCount(Customer customer); 
	//创建客户
	public int createCustomer(Customer customer);
}
