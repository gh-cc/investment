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
	
	@RequestMapping("/index.action")
	public String index(@PathVariable String path,Model model){
		System.out.println(path);
		return "index.jsp";
	}
}
