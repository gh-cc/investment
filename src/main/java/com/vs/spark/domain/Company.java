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
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer	id;
	
	@Column(name = "company_name")
	private String	company_name;
	
	@Column(name = "field_type")
	private String	field_type;
	
	@Column(name = "address")
	private String	address;
	
	@Column(name = "found_time")
	private Date found_time;
	
	@Column(name = "register_capital")
	private String	register_capital;
	
	@Column(name = "stockholder")
	private String	stockholder;
	
	@Column(name = "team")
	private String	team;
	
	@Column(name = "round_rank")
	private String	round_rank;

	@Column(name = "found_")
	private Date found_;
	
	@Column(name = "age")
	private Integer age;
	
	@Column(name = "company_")
	private String company_;
	
	@Column(name = "education_back")
	private String education_back;
	
	@Column(name = "family_back")
	private String family_back;
	
	@Column(name = "sex")
	private String sex;
	
	@Column(name = "venture_experience")
	private String venture_experience;
	
	@Column(name = "work_experience")
	private String work_experience;
	
	
	public Date getFound_time() {
		return found_time;
	}

	public void setFound_time(Date found_time) {
		this.found_time = found_time;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
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

	public String getFamily_back() {
		return family_back;
	}

	public void setFamily_back(String family_back) {
		this.family_back = family_back;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getVenture_experience() {
		return venture_experience;
	}

	public void setVenture_experience(String venture_experience) {
		this.venture_experience = venture_experience;
	}

	public String getWork_experience() {
		return work_experience;
	}

	public void setWork_experience(String work_experience) {
		this.work_experience = work_experience;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getField_type() {
		return field_type;
	}

	public void setField_type(String field_type) {
		this.field_type = field_type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getFound_() {
		return found_;
	}

	public void setFound_(Date found_) {
		this.found_ = found_;
	}

	public String getRegister_capital() {
		return register_capital;
	}

	public void setRegister_capital(String register_capital) {
		this.register_capital = register_capital;
	}

	public String getStockholder() {
		return stockholder;
	}

	public void setStockholder(String stockholder) {
		this.stockholder = stockholder;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getRound_rank() {
		return round_rank;
	}

	public void setRound_rank(String round_rank) {
		this.round_rank = round_rank;
	}

}
