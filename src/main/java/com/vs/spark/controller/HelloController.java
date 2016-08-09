package com.vs.spark.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import com.vs.spark.domain.Persion;
import com.vs.spark.service.PersionService;

@Controller
public class HelloController {
	
	@Resource
	public PersionService persionService;
	
	@RequestMapping("/invest.action")
	public String invest(Model model){
		return "invest.jsp";
	}
	
	@RequestMapping("/investor.action")
	public String investor(Model model){
		return "investor.jsp";
	}
	
	@RequestMapping("/entrepreneur.action")
	public String entrepreneur(Model model){
		return "entrepreneur.jsp";
	}
	
	@RequestMapping("/entrepreneurship.action")
	public String entrepreneurship(Model model){
		return "Entrepreneurship.jsp";
	}
}
