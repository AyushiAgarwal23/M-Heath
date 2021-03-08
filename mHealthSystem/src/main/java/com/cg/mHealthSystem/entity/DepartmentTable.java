package com.cg.mHealthSystem.entity;

import javax.persistence.Entity;

@Entity
public class DepartmentTable {

	public int Dept_ID;
	public String Dept_Name;
	public String Phone_no;
	public String email_ID;
	public int getDept_ID() {
		return Dept_ID;
	}
	public void setDept_ID(int dept_ID) {
		Dept_ID = dept_ID;
	}
	public String getDept_Name() {
		return Dept_Name;
	}
	public void setDept_Name(String dept_Name) {
		Dept_Name = dept_Name;
	}
	public String getPhone_no() {
		return Phone_no;
	}
	public void setPhone_no(String phone_no) {
		Phone_no = phone_no;
	}
	public String getEmail_ID() {
		return email_ID;
	}
	public void setEmail_ID(String email_ID) {
		this.email_ID = email_ID;
	}
	public DepartmentTable(int dept_ID, String dept_Name, String phone_no, String email_ID) {
		super();
		Dept_ID = dept_ID;
		Dept_Name = dept_Name;
		Phone_no = phone_no;
		this.email_ID = email_ID;
	}
	public DepartmentTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
