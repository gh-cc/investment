package com.vs.spark.dao.impl;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.vs.spark.dao.PersionDao;
import com.vs.spark.domain.Persion;

@Repository
public class PersionDaoImpl implements PersionDao{

	@Resource
    public HibernateTemplate hibernateTemplate;
	
	public void add(Persion persion) {
		this.hibernateTemplate.save(persion);
	}

	public Persion get(int id) {
		return this.hibernateTemplate.get(Persion.class, id);
	}

}
