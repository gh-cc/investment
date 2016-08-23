package com.vs.spark.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "fund_inf")
public class FundInf {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer	id;
	
	@Column(name = "agency_name")
	private String	agency_name;
	
	@Column(name = "leaderorfollow")
	private int	leaderorfollow;
	
	@Column(name = "company_name")
	private String	company_name;
	
	@Column(name = "fund_amount")
	private String fund_amount;
	
	@Column(name = "round_rank")
	private String	round_rank;
	
	@Column(name = "fund_time")
	private Date fund_time;
	
	@Column(name = "inf_from")
	private String	inf_from;
	
	@Column(name = "project")
	private String	project;

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

	public int getLeaderorfollow() {
		return leaderorfollow;
	}

	public void setLeaderorfollow(int leaderorfollow) {
		this.leaderorfollow = leaderorfollow;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getFund_amount() {
		return fund_amount;
	}

	public void setFund_amount(String fund_amount) {
		this.fund_amount = fund_amount;
	}

	public String getRound_rank() {
		return round_rank;
	}

	public void setRound_rank(String round_rank) {
		this.round_rank = round_rank;
	}

	public Date getFund_time() {
		return fund_time;
	}

	public void setFund_time(Date fund_time) {
		this.fund_time = fund_time;
	}

	public String getInf_from() {
		return inf_from;
	}

	public void setInf_from(String inf_from) {
		this.inf_from = inf_from;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}
	
}
