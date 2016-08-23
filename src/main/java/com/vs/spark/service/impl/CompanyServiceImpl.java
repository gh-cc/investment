package com.vs.spark.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.vs.spark.dao.CompanyDao;
import com.vs.spark.domain.Company;
import com.vs.spark.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService{

	@Resource
	public CompanyDao companyDao;
	
	public Company get(String name) {
		return this.companyDao.get(name);
	}

}
