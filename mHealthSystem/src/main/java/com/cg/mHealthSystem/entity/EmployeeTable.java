package com.cg.mHealthSystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeTable {
	@Id
	public int Emp_ID;
	public String First_Name;
	public String Middle_Name ;
	public String  Last_Name ;
	public String Mobile_No;
	public String Gender;
	public String Street ;
	public String DOB;
	public String City ;
	public String State ;
	public String pincode ;
	public String ID_Proof ;
	public int getEmp_ID() {
		return Emp_ID;
	}
	public void setEmp_ID(int emp_ID) {
		Emp_ID = emp_ID;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getMiddle_Name() {
		return Middle_Name;
	}
	public void setMiddle_Name(String middle_Name) {
		Middle_Name = middle_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getMobile_No() {
		return Mobile_No;
	}
	public void setMobile_No(String mobile_No) {
		Mobile_No = mobile_No;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getID_Proof() {
		return ID_Proof;
	}
	public void setID_Proof(String iD_Proof) {
		ID_Proof = iD_Proof;
	}
	public EmployeeTable(int emp_ID, String first_Name, String middle_Name, String last_Name, String mobile_No,
			String gender, String street, String dOB, String city, String state, String pincode, String iD_Proof) {
		super();
		Emp_ID = emp_ID;
		First_Name = first_Name;
		Middle_Name = middle_Name;
		Last_Name = last_Name;
		Mobile_No = mobile_No;
		Gender = gender;
		Street = street;
		DOB = dOB;
		City = city;
		State = state;
		this.pincode = pincode;
		ID_Proof = iD_Proof;
	}
	public EmployeeTable() {
		super();
		// TODO Auto-generated constructor stub
	}

}
