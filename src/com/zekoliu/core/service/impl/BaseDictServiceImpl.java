package com.zekoliu.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zekoliu.core.dao.BaseDictDao;
import com.zekoliu.core.po.BaseDict;
import com.zekoliu.core.service.BaseDictService;

@Service("baseDictService")
public class BaseDictServiceImpl implements BaseDictService {
	@Autowired
	private BaseDictDao baseDictDao;
	//根据类别代码查询数据字典
	@Override
	public List<BaseDict> findBaseDictByTypeCode(String typecode) {
		return baseDictDao.selectBaseDictByTypeCode(typecode);
	}

}
