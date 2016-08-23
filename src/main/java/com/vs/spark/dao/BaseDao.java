package com.vs.spark.dao;

import java.util.List;

public interface BaseDao {
	public List<Object[]> sqlQuery(String sql);

	public List<Object> sqlQuery2(String sql);
	
	public List<Object> find(String sql);
}
