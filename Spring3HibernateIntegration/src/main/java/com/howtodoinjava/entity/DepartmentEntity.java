package com.howtodoinjava.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTMENT")
public class DepartmentEntity {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="POST_CODE")
	private String postCode;
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	public DepartmentEntity(int id, String city, String postCode) {
		super();
		this.id = id;
		this.city = city;
		this.postCode = postCode;
	}
	public DepartmentEntity(String city, String postCode) {
		super();
		this.city = city;
		this.postCode = postCode;
	}
	public DepartmentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
