package com.vs.spark.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "agencyinvestcount")
public class Agencyinvestcount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer	id;
	
	@Column(name = "name_agency")
	private String	name_agency;
	
	@Column(name = "count_invest")
	private Integer	count_invest;

	public Integer getId() {
		return id;
	}

	public String getName_agency() {
		return name_agency;
	}

	public void setName_agency(String name_agency) {
		this.name_agency = name_agency;
	}

	public Integer getCount_invest() {
		return count_invest;
	}

	public void setCount_invest(Integer count_invest) {
		this.count_invest = count_invest;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
