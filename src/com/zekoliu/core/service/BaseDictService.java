package com.zekoliu.core.service;

import java.util.List;

import com.zekoliu.core.po.BaseDict;

public interface BaseDictService {
	//�����������ѯ�����ֵ�
	public List<BaseDict> findBaseDictByTypeCode(String typecode);
}
