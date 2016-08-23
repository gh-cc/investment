package com.vs.spark.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.vs.spark.dao.BaseDao;
import com.vs.spark.dao.PersionDao;
import com.vs.spark.domain.Persion;
import com.vs.spark.service.PersionService;
import com.vs.spark.service.SqlService;

@Service
public class SqlServiceImpl implements SqlService{

	@Resource
	public BaseDao baseDao;

	@Override
	public List<Object[]> sql(String sql) {
		return baseDao.sqlQuery(sql);
	}
	
	public List<Object> sql2(String sql) {
		return baseDao.sqlQuery2(sql);
	}
	
	public List<Object> find(String sql){
		return baseDao.find(sql);
	}

}
