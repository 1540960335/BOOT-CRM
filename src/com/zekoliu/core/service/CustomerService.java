package com.zekoliu.core.service;

import com.zekoliu.common.utils.Page;
import com.zekoliu.core.po.Customer;

public interface CustomerService {
	//��ѯ�ͻ��б�
	public Page<Customer> findCustomerList(Integer page, Integer rows, String custName, String custSource,
											String custIndustry, String custLevel);
	//�����ͻ�
	public int createCustomer(Customer customer);
}
