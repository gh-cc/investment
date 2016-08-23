package com.vs.spark.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.vs.spark.dao.BaseDao;
import com.vs.spark.domain.Company;

@Repository
public class BaseDaoImpl implements BaseDao{

	@Resource
    public HibernateTemplate hibernateTemplate;

	@Override
	public List<Object[]> sqlQuery(final String sql) {
		return hibernateTemplate.execute(new HibernateCallback(){
		           public List<Object[]> doInHibernate(Session session) throws HibernateException
		           {
		              List<Object[]> list= session.createSQLQuery(sql).list();
		              return list;
		           }
		       });
	}
	
	public List<Object> sqlQuery2(final String sql) {
		return hibernateTemplate.execute(new HibernateCallback(){
		           public List<Object> doInHibernate(Session session) throws HibernateException
		           {
		              List<Object> list= session.createSQLQuery(sql).list();
		              return list;
		           }
		       });
	}
	
	public List<Object> find(String sql) {
		return hibernateTemplate.find(sql);
	}
	

}
