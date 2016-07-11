package com.vs.spark.service;

import com.vs.spark.domain.Persion;

public interface PersionService {
	public void add(Persion persion);
	public Persion get(int id);
}
