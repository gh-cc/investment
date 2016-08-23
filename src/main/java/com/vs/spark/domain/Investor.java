package com.vs.spark.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "investor")
public class Investor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer	id;
	
	@Column(name = "agency_name")
	private String	agency_name;
	
	@Column(name = "education_back")
	private String	education_back;
	
	@Column(name = "sex")
	private String	sex;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "work_experience")
	private String	work_experience;
	
	@Column(name = "position")
	private String	position;
	
	@Column(name = "invest_experience")
	private String	invest_experience;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAgency_name() {
		return agency_name;
	}

	public void setAgency_name(String agency_name) {
		this.agency_name = agency_name;
	}

	public String getEducation_back() {
		return education_back;
	}

	public void setEducation_back(String education_back) {
		this.education_back = education_back;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getWork_experience() {
		return work_experience;
	}

	public void setWork_experience(String work_experience) {
		this.work_experience = work_experience;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getInvest_experience() {
		return invest_experience;
	}

	public void setInvest_experience(String invest_experience) {
		this.invest_experience = invest_experience;
	}

}
