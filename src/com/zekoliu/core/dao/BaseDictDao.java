package com.zekoliu.core.dao;

import java.util.List;

import com.zekoliu.core.po.BaseDict;

public interface BaseDictDao {
	//�����������ѯ�����ֵ�
	public List<BaseDict> selectBaseDictByTypeCode(String typecode);
}
