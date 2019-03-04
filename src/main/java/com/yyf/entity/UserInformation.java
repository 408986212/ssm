package com.yyf.entity;

import java.sql.Timestamp;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class UserInformation {
	private String id;
	private String username;
	private String password;
	private String name;
	private int age;
	private int sex;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date birthday;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Timestamp createTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public UserInformation(String id, String username, String password, String name, int age, int sex, Date birthday,
			 Timestamp createTime) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.birthday = birthday;
		this.createTime = createTime;
	}
	public UserInformation() {
		super();
	}

}
