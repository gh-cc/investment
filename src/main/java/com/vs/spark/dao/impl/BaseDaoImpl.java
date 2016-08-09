package com.vs.spark.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.vs.spark.dao.BaseDao;

@Repository
public class BaseDaoImpl implements BaseDao{

	@Resource
    public HibernateTemplate hibernateTemplate;

	@Override
	public List sqlQuery(String sql) {
		return hibernateTemplate.find(sql);
	}
	
	

}
