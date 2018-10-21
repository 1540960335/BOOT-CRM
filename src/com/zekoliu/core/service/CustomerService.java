package com.zekoliu.core.service;

import com.zekoliu.common.utils.Page;
import com.zekoliu.core.po.Customer;

public interface CustomerService {
	//查询客户列表
	public Page<Customer> findCustomerList(Integer page, Integer rows, String custName, String custSource,
											String custIndustry, String custLevel);
	//创建客户
	public int createCustomer(Customer customer);
}
