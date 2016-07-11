package com.vs.spark.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.vs.spark.dao.PersionDao;
import com.vs.spark.domain.Persion;
import com.vs.spark.service.PersionService;

@Service
public class PersionServiceImpl implements PersionService{

	@Resource
	public PersionDao persionDao;
	
	public void add(Persion persion) {
		this.persionDao.add(persion);
	}

	public Persion get(int id) {
		return this.persionDao.get(id);
	}

}
