package com.vs.spark.dao.impl;

import com.vs.spark.dao.RecoForCompanyDao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

import java.util.List;

/**
 * Created by lenovo on 2016/8/10.
 */
@Repository
public class RecoForCompanyDaoImp implements RecoForCompanyDao {
    @Resource
    public SessionFactory sessionFactory;
    //
    public List findRecomResult(String companyName){
        Session session = sessionFactory.getCurrentSession();
//        Transaction tx = session.beginTransaction();
        String sql = "select a.id,a.agency_name,c.score from fund_inf a, recommresult c where " +
                "(select b.id from company b where b.name= '"+companyName
                +"') = c.company_id and c.agency_id=a.id order by c.score desc";
        List list = session.createSQLQuery(sql).
                addScalar("agency_name", StandardBasicTypes.STRING).list();
//        tx.commit();
        return  list;
    }
}
