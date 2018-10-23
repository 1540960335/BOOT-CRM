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
	//通过id查找客户
	public Customer getCustomerById(Integer id);
	//更新用户
	public int updateCustomer(Customer customer);
	//删除用户
	public int deleteCustomer(Integer id);
}
