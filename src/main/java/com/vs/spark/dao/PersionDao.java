package com.vs.spark.dao;

import com.vs.spark.domain.Persion;

public interface PersionDao {
	public void add(Persion persion);
	public Persion get(int id);
}
