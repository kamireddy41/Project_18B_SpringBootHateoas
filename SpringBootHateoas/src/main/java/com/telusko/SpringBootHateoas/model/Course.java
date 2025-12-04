package com.telusko.SpringBootHateoas.model;

import org.springframework.hateoas.RepresentationModel;

public class Course extends RepresentationModel
{
	private Integer cid;
	
	private String cname;
	
	private Double cost;

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cost=" + cost + "]";
	}

	public Course(Integer cid, String cname, Double cost) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cost = cost;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
