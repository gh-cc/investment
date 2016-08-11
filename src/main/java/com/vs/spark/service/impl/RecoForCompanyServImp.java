package com.vs.spark.service.impl;

import com.vs.spark.dao.RecoForCompanyDao;
import com.vs.spark.service.RecoForCommpanyService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2016/8/10.
 */
public class RecoForCompanyServImp implements RecoForCommpanyService {
    @Resource
    RecoForCompanyDao recoForCompanyDao;
    public List findRecomResult(String companyName){
        List list = recoForCompanyDao.findRecomResult(companyName);
        return  list;
    }


}

