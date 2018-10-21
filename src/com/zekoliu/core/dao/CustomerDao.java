package com.zekoliu.core.dao;

import java.util.List;

import com.zekoliu.core.po.Customer;

public interface CustomerDao {
	//�ͻ��б�
	public List<Customer> selectCustomerList(Customer customer);
	//�ͻ���
	public Integer selectCustomerListCount(Customer customer); 
	//�����ͻ�
	public int createCustomer(Customer customer);
}
