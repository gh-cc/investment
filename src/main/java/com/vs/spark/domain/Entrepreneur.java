package com.vs.spark.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "company")
public class Entrepreneur {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer	id;
	
	@Column(name = "company_")
	private String	company_;
	
	@Column(name = "education_back")
	private String	education_back;
	
	@Column(name = "sex")
	private String	sex;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "work_experience")
	private String	work_experience;
	
	@Column(name = "family_back")
	private String	family_back;
	
	@Column(name = "venture_experience")
	private String	venture_experience;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompany_() {
		return company_;
	}

	public void setCompany_(String company_) {
		this.company_ = company_;
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

	public String getFamily_back() {
		return family_back;
	}

	public void setFamily_back(String family_back) {
		this.family_back = family_back;
	}

	public String getVenture_experience() {
		return venture_experience;
	}

	public void setVenture_experience(String venture_experience) {
		this.venture_experience = venture_experience;
	}
	
}
