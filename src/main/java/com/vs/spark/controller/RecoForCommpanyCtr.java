package com.vs.spark.controller;

import com.vs.spark.service.RecoForCommpanyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    public String recomForCompResult(Model model){
        String companyName = null;
        List agencyList = recoForCommpanyService.findRecomResult(companyName);
        return "recommend/recompanyContent.html";
    }


}
