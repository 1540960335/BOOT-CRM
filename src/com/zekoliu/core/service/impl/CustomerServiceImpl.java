package com.zekoliu.core.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zekoliu.common.utils.Page;
import com.zekoliu.core.dao.CustomerDao;
import com.zekoliu.core.po.Customer;
import com.zekoliu.core.service.CustomerService;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;
	//�ͻ��б�
	@Override
	public Page<Customer> findCustomerList(Integer page, Integer rows, String custName, String custSource,
			String custIndustry, String custLevel) {
		Customer customer = new Customer();
		//�жϿͻ�����
		if (StringUtils.isNoneBlank(custName))
			customer.setCust_name(custName);
		//�жϿͻ���Ϣ��Դ
		if (StringUtils.isNoneBlank(custSource))
			customer.setCust_source(custSource);
		//�жϿͻ�������ҵ
		if (StringUtils.isNoneBlank(custIndustry))
			customer.setCust_industry(custIndustry);
		//�жϿͻ�����
		if (StringUtils.isNoneBlank(custLevel))
			customer.setCust_level(custLevel);
		//��ǰҳ
		customer.setStart((page-1) * rows);
		//ÿҳ��
		customer.setRows(rows);
		//��ѯ�ͻ��б�
		List<Customer> customers = customerDao.selectCustomerList(customer);
		//��ѯ�ͻ��б��ܼ�¼��
		Integer count = customerDao.selectCustomerListCount(customer);
		Page<Customer> result = new Page<>();
		result.setPage(page);
		result.setRows(customers);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}
	@Override
	public int createCustomer(Customer customer) {
		return customerDao.createCustomer(customer);
	}
	@Override
	public Customer getCustomerById(Integer id) {
		return customerDao.getCustomerById(id);
	}
	@Override
	public int updateCustomer(Customer customer) {
		return customerDao.updateCustomer(customer);
	}
	@Override
	public int deleteCustomer(Integer id) {
		return customerDao.deleteCustomer(id);
	}

}
