package com.yyf.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class House {
	private String id;
	private String hname;
	private int price;
	private String p1;
	private String p2;
	private String address;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date houseDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getP1() {
		return p1;
	}
	public void setP1(String p1) {
		this.p1 = p1;
	}
	public String getP2() {
		return p2;
	}
	public void setP2(String p2) {
		this.p2 = p2;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getHouseDate() {
		return houseDate;
	}
	public void setHouseDate(Date houseDate) {
		this.houseDate = houseDate;
	}
	@Override
	public String toString() {
		return "House [id=" + id + ", hname=" + hname + ", price=" + price + ", p1=" + p1 + ", p2=" + p2 + ", address="
				+ address + ", houseDate=" + houseDate + "]";
	}
	public House(String id, String hname, int price, String p1, String p2, String address, Date houseDate) {
		super();
		this.id = id;
		this.hname = hname;
		this.price = price;
		this.p1 = p1;
		this.p2 = p2;
		this.address = address;
		this.houseDate = houseDate;
	}
	public House() {
		super();
	}
	
}
