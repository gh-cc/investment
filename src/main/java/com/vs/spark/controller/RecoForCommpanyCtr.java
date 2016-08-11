package com.vs.spark.controller;

import com.vs.spark.service.RecoForCommpanyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2016/8/10.
 */
@Controller
public class RecoForCommpanyCtr {
    @Resource
    RecoForCommpanyService recoForCommpanyService;

    @RequestMapping("/reqrecomForComp.action")
    public String recomForComp(Model model){
        return "recommend/recommForCompany.jsp";
    }

    @RequestMapping("/recomForCompResult.action")
    public String recomForCompResult(Model model,String company_name,HttpServletRequest request){
        List agencyList = recoForCommpanyService.findRecomResult(company_name);
        request.setAttribute("agencyList".agencyList);

        return "recommend/recompanyContent.html";
    }


}
