package com.yyf.entity;

import java.util.Date;

public class Register {
	private int id;
	private String username;
	private String password;
	private String name;
	private int sex;
	private Date birthday;
	private int IDcard;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int getIDcard() {
		return IDcard;
	}
	public void setIDcard(int iDcard) {
		IDcard = iDcard;
	}
	@Override
	public String toString() {
		return "Register [id=" + id + ", username=" + username + ", password=" + password + ", name=" + name + ", sex="
				+ sex + ", birthday=" + birthday + ", IDcard=" + IDcard + "]";
	}
	public Register(int id, String username, String password, String name, int sex, Date birthday, int iDcard) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
		IDcard = iDcard;
	}
	public Register() {
		super();
	}
	
	
}
