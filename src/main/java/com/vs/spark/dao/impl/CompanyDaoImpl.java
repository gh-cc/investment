package com.vs.spark.dao.impl;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.vs.spark.dao.CompanyDao;
import com.vs.spark.domain.Company;
import com.vs.spark.domain.Persion;

@Repository
public class CompanyDaoImpl implements CompanyDao{

	@Resource
    public HibernateTemplate hibernateTemplate;
	
	public Company get(String name) {
		return (Company) this.hibernateTemplate.find("FROM Company WHERE company_name = '"+name+"'").get(0);
	}

}
