package com.zekoliu.core.service;

import com.zekoliu.common.utils.Page;
import com.zekoliu.core.po.Customer;

public interface CustomerService {
	//查询客户列表
	public Page<Customer> findCustomerList(Integer page, Integer rows, String custName, String custSource,
											String custIndustry, String custLevel);
	//创建客户
	public int createCustomer(Customer customer);
	
	//通过id查找客户
	public Customer getCustomerById(Integer id);
	
	//更新用户
	public int updateCustomer(Customer customer);
	//删除用户
	public int deleteCustomer(Integer id);
}
