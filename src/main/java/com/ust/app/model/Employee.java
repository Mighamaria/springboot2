 package com.ust.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
 public class Employee {
 	@Id
 	@GeneratedValue
 	
 	private int id;
 	private String empname;
 	private String email;
 	private int experience;
 	private String domain;

 public Employee(int id, String empname, String email, int experience, String domain) {
 	super();
 	this.id = id;
 	this.empname = empname;
 	this.email = email;
 	this.experience = experience;
 	this.domain = domain;
 }

 public Employee() {
 	// TODO Auto-generated constructor stub
 }

 public int getId() {
 	return id;
 }

 public void setId(int id) {
 	this.id = id;
 }

 public String getEmpname() {
 	return empname;
 }

 public void setEmpname(String empname) {
 	this.empname = empname;
 }

 public String getEmail() {
 	return email;
 }

 public void setEmail(String email) {
 	this.email = email;
 }

 public int getExperience() {
 	return experience;
 }

 public void setExperience(int experience) {
 	this.experience = experience;
 }

 public String getDomain() {
 	return domain;
 }

 public void setDomain(String domain) {
 	this.domain = domain;
 }
 }
 	
 	


