package com.vs.spark.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vs.spark.domain.Company;
import com.vs.spark.service.CompanyService;
import com.vs.spark.service.RecoForCommpanyService;
import com.vs.spark.service.SqlService;

/**
 * Created by lenovo on 2016/8/10.
 */
@Controller
public class RecoForCommpanyCtr {
    @Resource
    RecoForCommpanyService recoForCommpanyService;
    
    @Resource
    SqlService sqlService;

    @Resource
    CompanyService companyService;
    
    @RequestMapping("/reqrecomForComp.action")
    public String recomForComp(Model model){
        return "recommend/recommForCompany.jsp";
    }

    @RequestMapping("/recomForCompResult.action")
    public String recomForCompResult(Model model,String company_name,String company_id){
//        List agencyList = recoForCommpanyService.findRecomResult(company_name);
//    	String company_name_id = "SELECT company.id FROM company WHERE company.company_name = '"+company_name+"'";
//    	company_name_id = "SELECT id FROM company WHERE company.`name`='拼班'";
//    	company_name_id = "SELECT company.id FROM company limit 1";
//    	Integer _id = (Integer) sqlService.sql2(company_name_id).get(0);
//    	List<Object> find = sqlService.find("FROM Company WHERE company_name = '"+company_name+"'");
    	
//    	Company company = companyService.get(company_name);
    	
    	
    	String sql = "SELECT fund_inf.id,fund_inf.agency_name,recommresult.score FROM fund_inf,recommresult WHERE recommresult.agency_id=fund_inf.id AND recommresult.company_id="+company_id;
    	
//    	sql = "SELECT `name`,COUNT(*) FROM company b GROUP BY `name`";
//    	sql = "SELECT fund_inf.id,fund_inf.agency_name,recommresult.score FROM fund_inf, recommresult WHERE recommresult.agency_id=fund_inf.id LIMIT 20";
//    	sql = "SELECT fund_inf.id,fund_inf.agency_name,recommresult.score FROM fund_inf, recommresult WHERE recommresult.agency_id=fund_inf.id LIMIT 20";
    	
    	List<Object[]> agencyList = sqlService.sql(sql);
    	/*List<String[]> liS = new ArrayList<String[]>();
    	for(Object[] o1 : agencyList){
    		System.out.println("--------------------------");
//    					Object[] obj = o;  //每一个类的属性信息存入一个数组中
    					String [] ss = new String[3];
    					for(int i=0;i<o1.length;i++){
    						System.out.print(o1[i].toString()+",");  //打印每一条查询结果
    						ss[i] = o1[i].toString();
    					}
    					liS.add(ss);
    			}*/
    	
    	
    	model.addAttribute("agencyList",agencyList);

        return "recommend/recompanyContent.jsp";
    }


}
