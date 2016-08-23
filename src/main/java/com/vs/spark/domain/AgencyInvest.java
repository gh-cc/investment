package com.vs.spark.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "agency_invest")
public class AgencyInvest {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer	id;
	
	@Column(name = "name")
	private String	name;
	
	@Column(name = "telephone")
	private String	telephone;

	@Column(name = "address")
	private String	address;
	
	@Column(name = "website")
	private String	website;
	
	@Column(name = "agency_des")
	private String	agency_des;
	
	@Column(name = "inf_from")
	private String	inf_from;
	
	@Column(name = "fund_count")
	private int	fund_count;
	
	@Column(name = "round_rank")
	private String	round_rank;
	
	@Column(name = "invest_area")
	private String	invest_area;
	
	@Column(name = "register_capital")
	private String	register_capital;
	
	@Column(name = "create_time")
	private Date create_time;
	
	@Column(name = "register_place")
	private String	register_place;
	
	@Column(name = "manager")
	private String	manager;
	
	@Column(name = "stockholder")
	private String	stockholder;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getAgency_des() {
		return agency_des;
	}

	public void setAgency_des(String agency_des) {
		this.agency_des = agency_des;
	}

	public String getInf_from() {
		return inf_from;
	}

	public void setInf_from(String inf_from) {
		this.inf_from = inf_from;
	}

	public int getFund_count() {
		return fund_count;
	}

	public void setFund_count(int fund_count) {
		this.fund_count = fund_count;
	}

	public String getRound_rank() {
		return round_rank;
	}

	public void setRound_rank(String round_rank) {
		this.round_rank = round_rank;
	}

	public String getInvest_area() {
		return invest_area;
	}

	public void setInvest_area(String invest_area) {
		this.invest_area = invest_area;
	}

	public String getRegister_capital() {
		return register_capital;
	}

	public void setRegister_capital(String register_capital) {
		this.register_capital = register_capital;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getRegister_place() {
		return register_place;
	}

	public void setRegister_place(String register_place) {
		this.register_place = register_place;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getStockholder() {
		return stockholder;
	}

	public void setStockholder(String stockholder) {
		this.stockholder = stockholder;
	}
	
	
}
