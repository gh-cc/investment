package com.vs.spark.service;

import java.util.List;

public interface SqlService {
	// 传入sql 直接查询结果
	public List<Object[]> sql(String sql);
	public List<Object> sql2(String sql);
	public List<Object> find(String sql);
	
}
