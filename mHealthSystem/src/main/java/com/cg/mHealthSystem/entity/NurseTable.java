package com.cg.mHealthSystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NurseTable {
 @Id
 public int Nurse_ID;
 public int User_ID;
 public int Emp_ID;
 public int Dept_ID;
 public int Nurse_Fee;
public int getNurse_ID() {
	return Nurse_ID;
}
public void setNurse_ID(int nurse_ID) {
	Nurse_ID = nurse_ID;
}
public int getUser_ID() {
	return User_ID;
}
public void setUser_ID(int user_ID) {
	User_ID = user_ID;
}
public int getEmp_ID() {
	return Emp_ID;
}
public void setEmp_ID(int emp_ID) {
	Emp_ID = emp_ID;
}
public int getDept_ID() {
	return Dept_ID;
}
public void setDept_ID(int dept_ID) {
	Dept_ID = dept_ID;
}
public int getNurse_Fee() {
	return Nurse_Fee;
}
public void setNurse_Fee(int nurse_Fee) {
	Nurse_Fee = nurse_Fee;
}
public NurseTable(int nurse_ID, int user_ID, int emp_ID, int dept_ID, int nurse_Fee) {
	super();
	Nurse_ID = nurse_ID;
	User_ID = user_ID;
	Emp_ID = emp_ID;
	Dept_ID = dept_ID;
	Nurse_Fee = nurse_Fee;
}
public NurseTable() {
	super();
	// TODO Auto-generated constructor stub
}
 
 
}
